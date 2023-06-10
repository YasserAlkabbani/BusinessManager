package com.awesome.manager

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.awesome.manager.core.common.AmResult
import com.awesome.manager.core.data.repository.auth.AuthRepository
import com.awesome.manager.feature.auth.AuthScreenMainState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val authRepository:AuthRepository
):ViewModel() {

    val mainActivityState=MainActivityState(
        isLogin = authRepository.isLogin().stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000),false)
    )

    init {
        observeAuthTokenState()
        refreshUserInfo()
    }

    private fun observeAuthTokenState(){
        viewModelScope.launch {
            authRepository.isLogin().collectLatest {
                Timber.d("TEST_AUTH AUTH_TOKEN $it")
            }
        }
    }

    private fun refreshUserInfo(){
        viewModelScope.launch {
            authRepository.refreshUserInfo().collectLatest{
                when(it){
                    is AmResult.Loading -> Timber.d("TEST_AUTH REFRESH_USER LOADING")
                    is AmResult.Success -> Timber.d("TEST_AUTH REFRESH_USER SUCCESS ${it.data}")
                    is AmResult.Error -> Timber.d("TEST_AUTH REFRESH_USER ERROR ${it.throwable.message}")
                }
            }
        }
    }

}