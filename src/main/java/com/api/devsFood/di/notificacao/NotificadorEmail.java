package com.api.devsFood.di.notificacao;

import com.api.devsFood.di.modelo.Cliente;
import org.springframework.stereotype.Component;

//@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}