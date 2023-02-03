package com.api.devsFood.di.service;

import com.api.devsFood.di.modelo.Cliente;
import com.api.devsFood.di.notificacao.Notificador;


//@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador){
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}