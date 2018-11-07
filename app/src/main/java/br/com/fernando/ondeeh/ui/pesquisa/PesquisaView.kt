package br.com.fernando.ondeeh.ui.pesquisa

import br.com.fernando.ondeeh.base.BaseView
import br.com.fernando.ondeeh.model.Endereco

interface PesquisaView : BaseView {
    fun atualizaEndereco(endereco: Endereco)

    fun showErro(erro:String)

    fun showLoading()

    fun hideLoading()
}