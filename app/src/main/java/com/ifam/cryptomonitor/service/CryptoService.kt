package com.ifam.cryptomonitor.service;

import retrofit2.Response
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CryptoService {

    @GET("api/{coin}/ticket")
    suspend fun fetchCoinTicket(@Path("coin") coin: String = "BTC"): Response<TicketResponse>

}
