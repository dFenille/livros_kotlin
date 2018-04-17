package com.example.diego.starwarsretrofit.modelo

import com.google.gson.annotations.SerializedName



/**
 * Created by diego on 16/04/18.
 */
class Autor {

    @SerializedName("idAutor")
    private val id: Long = 0
    @SerializedName("nomeAutor")
    private val nome: String? = null
    @SerializedName("detalhesAutor")
    private val biografia: String? = null
    @SerializedName("imagemAutor")
    private val urlFoto: String? = null


}