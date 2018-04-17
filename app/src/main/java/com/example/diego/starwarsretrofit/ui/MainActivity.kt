package com.example.diego.starwarsretrofit.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.diego.starwarsretrofit.modelo.Livros
import com.example.diego.starwarsretrofit.retrofit.WebClient
import com.example.diego.starwarsretrofit.ui.delegate.LivrosDelegate
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MainActivity : AppCompatActivity(),LivrosDelegate {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webCliente : WebClient = WebClient(this)

        webCliente.getLivros(0,3)

    }


    override
    public fun lidaComSucesso(livros: Livros) {
        livros.livros!!.size
    }
}
