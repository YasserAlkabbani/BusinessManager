package com.awesome.manager.feature.accounts

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.awesome.manager.core.data.repository.accounts.AccountRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class AccountsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val accountRepository: AccountRepository
):ViewModel(){

    val accountsState:AccountsState= AccountsState(
        savedStateHandle = savedStateHandle,
        coroutineScope = viewModelScope,
        returnCurrencyByCurrencyId = {null},
        amAccountAsFlow = flow {  }
    )



}