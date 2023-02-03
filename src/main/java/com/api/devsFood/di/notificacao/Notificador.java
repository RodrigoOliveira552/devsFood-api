package com.api.devsFood.di.notificacao;

import com.api.devsFood.di.modelo.Cliente;

public interface Notificador {
void notificar(Cliente cliente, String mensagem);
}
