package com.lucascabral.cryptocurrencycompose.data.repository

import com.lucascabral.cryptocurrencycompose.data.remote.CoinPaprikaApi
import com.lucascabral.cryptocurrencycompose.data.remote.dto.CoinDetailDto
import com.lucascabral.cryptocurrencycompose.data.remote.dto.CoinDto
import com.lucascabral.cryptocurrencycompose.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}