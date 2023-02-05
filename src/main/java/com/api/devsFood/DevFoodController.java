package com.api.devsFood;


import com.api.devsFood.di.modelo.Cliente;
import com.api.devsFood.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DevFoodController {

    public AtivacaoClienteService ativacaoClienteService;

    public DevFoodController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("DevFoodController " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joaozin = new Cliente("Joaozin", "jz@qmail.com", "219232425");
ativacaoClienteService.ativar(joaozin);

        return "Teste!";
    }

}
