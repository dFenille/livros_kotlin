package com.example.diego.starwarsretrofit.modelo

import com.google.gson.annotations.SerializedName



/**
 * Created by diego on 16/04/18.
 */

class Livro{


    private val id: Long = 0
    @SerializedName("nomeLivro")
    private val nome: String? = null
    @SerializedName("descricaoLivro")
    private val descricao: String? = null
    @SerializedName("numeroPaginas")
    private val numPaginas: Int = 0
    private val dataPublicacao: String? = null
    private val ISBN: String? = null
    private val valorFisico: Double = 0.toDouble()
    private val valorVirtual: Double = 0.toDouble()
    @SerializedName("valorVirtualComFisico")
    private val valorDoisJuntos: Double = 0.toDouble()
    @SerializedName("imagemUrl")
    private val urlFoto: String? = null
    private val autores: List<Autor>? = null
}