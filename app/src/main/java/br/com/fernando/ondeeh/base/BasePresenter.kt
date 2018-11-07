package br.com.fernando.ondeeh.base

import br.com.fernando.ondeeh.injection.component.DaggerPresenterInjector
import br.com.fernando.ondeeh.injection.component.PresenterInjector
import br.com.fernando.ondeeh.injection.module.ContextModule
import br.com.fernando.ondeeh.injection.module.NetworkModule
import br.com.fernando.ondeeh.ui.pesquisa.PesquisaPresenter

abstract class BasePresenter <out V: BaseView> (protected val view: V) {

    private val injector: PresenterInjector = DaggerPresenterInjector
            .builder()
            .baseView(view)
            .contextModule(ContextModule)
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    open fun onViewCreated(){

    }

    open fun onViewDestroyed(){

    }

    private fun inject(){
        when (this){
            is PesquisaPresenter -> injector.inject(this)
        }
    }
}