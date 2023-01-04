package com.api.devsFood.di.service;

import com.api.devsFood.di.modelo.Cliente;
import com.api.devsFood.di.notificacao.NotificadorEmail;
import org.springframework.stereotype.Component;


@Component
public class AtivacaoClienteService {

    private NotificadorEmail notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}