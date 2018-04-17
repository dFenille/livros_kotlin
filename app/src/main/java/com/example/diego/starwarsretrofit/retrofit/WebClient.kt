package com.example.diego.starwarsretrofit.retrofit


import android.util.Log
import com.example.diego.starwarsretrofit.modelo.Livros
import com.example.diego.starwarsretrofit.retrofit.interfaces.LivrosService
import com.example.diego.starwarsretrofit.ui.delegate.LivrosDelegate
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WebClient {
    var base_url: String = "http://cdcmob.herokuapp.com"
    var delegate : LivrosDelegate ? = null

    constructor(application: LivrosDelegate){
        this.delegate = application
    }

    fun getLivros(indicePrimeiro: Int, qtd: Int) {

        val client: Retrofit = Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val service: LivrosService = client.create(LivrosService::class.java)
        val call: Call<Livros> = service.listaLivro(indicePrimeiro, qtd)
        call.enqueue(callback { throwable, response ->
            response?.let { this.delegate!!.lidaComSucesso(response.body()) }
            throwable?.let{ Log.e("error",throwable.message) }

        })
    }

    public fun <Livros> callback(fn: (Throwable?, Response<Livros>?) -> Unit): Callback<Livros> {
        return object : Callback<Livros> {
            override fun onResponse(call: Call<Livros>, response: retrofit2.Response<Livros>) = fn(null, response)
            override fun onFailure(call: Call<Livros>, t: Throwable) = fn(t, null)
        }
    }



}


