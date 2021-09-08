package com.lucascabral.cryptocurrencycompose.presentation.coin_detail

import com.lucascabral.cryptocurrencycompose.domain.model.Coin
import com.lucascabral.cryptocurrencycompose.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
