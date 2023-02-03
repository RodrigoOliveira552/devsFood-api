package com.api.devsFood.di.notificacao;

import com.api.devsFood.di.modelo.Cliente;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);

    }
}