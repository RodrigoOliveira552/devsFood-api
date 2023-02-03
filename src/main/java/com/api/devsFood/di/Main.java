package com.api.devsFood.di;

import com.api.devsFood.di.modelo.Cliente;
import com.api.devsFood.di.notificacao.Notificador;
import com.api.devsFood.di.notificacao.NotificadorSMS;
import com.api.devsFood.di.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {

        Cliente joaozin = new Cliente("Joaozin", "jz@qmail.com", "219232425");
        Cliente mariah = new Cliente("Mariah", "mah@qmail.com", "910203040");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joaozin);
        ativacaoCliente.ativar(mariah);

    }
}
