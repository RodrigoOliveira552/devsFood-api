package com.api.devsFood;

import com.api.devsFood.di.notificacao.NotificadorEmail;
import com.api.devsFood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevsfConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.devsfmail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        return new AtivacaoClienteService((notificadorEmail()));
    }

}
