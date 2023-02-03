package com.api.devsFood.di.service;

import com.api.devsFood.di.modelo.Cliente;
import com.api.devsFood.di.modelo.Produto;
import com.api.devsFood.di.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador){
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){

        this.notificador.notificar(cliente, "Nota fiscal do produto "
                + produto.getNome() + " Foi Emitida!");
    }

}
