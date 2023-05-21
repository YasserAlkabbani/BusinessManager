package com.awesome.manager.navigation

import com.awesome.manager.core.designsystem.icon.AmIconsType
import com.awesome.manager.core.designsystem.icon.AmIcons
import com.awesome.manager.core.designsystem.text.AmText
import com.awesome.manager.core.designsystem.text.asAmText
import com.awesome.manager.feature.home.R as homeR
import com.awesome.manager.feature.accounts.R as accountsR
import com.awesome.manager.feature.transactions.R as transactionsR


enum class MainDestination(
    val selectedAmIconsType:AmIconsType,
    val unSelectedAmIconsType: AmIconsType,
    val title:AmText,
){

    Home(
        selectedAmIconsType=AmIcons.HomeSelected,
        unSelectedAmIconsType = AmIcons.HomeUnSelected,
        title = homeR.string.home.asAmText()
    ),
    Accounts(
        selectedAmIconsType=AmIcons.AccountsSelected,
        unSelectedAmIconsType = AmIcons.AccountsUnSelected,
        title = accountsR.string.accounts.asAmText()
    ),
    Transactions(
        selectedAmIconsType=AmIcons.TransactionsSelected,
        unSelectedAmIconsType = AmIcons.TransactionsUnSelected,
        title = transactionsR.string.transactions.asAmText()
    ),

}