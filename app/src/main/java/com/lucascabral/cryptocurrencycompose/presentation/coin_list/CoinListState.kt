package com.lucascabral.cryptocurrencycompose.presentation.coin_list

import com.lucascabral.cryptocurrencycompose.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
