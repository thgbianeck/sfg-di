package br.com.bnck.sfgdi.controllers;

import br.com.bnck.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
