package com.lucascabral.cryptocurrencycompose.domain.repository

import com.lucascabral.cryptocurrencycompose.data.remote.dto.CoinDetailDto
import com.lucascabral.cryptocurrencycompose.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}