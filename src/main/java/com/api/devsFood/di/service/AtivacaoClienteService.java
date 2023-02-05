package com.api.devsFood.di.service;

import com.api.devsFood.di.modelo.Cliente;
import com.api.devsFood.di.notificacao.Notificador;
import com.api.devsFood.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(NotificadorEmail notificador){
        this.notificador = notificador;
        System.out.println("AtivacaoClienteService " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}