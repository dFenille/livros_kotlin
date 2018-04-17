package com.example.diego.starwarsretrofit.retrofit.interfaces

import com.example.diego.starwarsretrofit.modelo.Livros
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by diego on 17/04/18.
 */
interface LivrosService {
    @GET("listarLivros")
    abstract fun listaLivro(@Query("indicePrimeiroLivro") primeiro: Int, @Query("qtdLivros") qtd: Int): Call<Livros>
}