package com.lucascabral.cryptocurrencycompose.data.remote

import com.lucascabral.cryptocurrencycompose.data.remote.dto.CoinDetailDto
import com.lucascabral.cryptocurrencycompose.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}