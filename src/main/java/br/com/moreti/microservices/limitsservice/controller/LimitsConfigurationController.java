package br.com.moreti.microservices.limitsservice.controller;

import br.com.moreti.microservices.limitsservice.config.Configuration;
import br.com.moreti.microservices.limitsservice.model.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    private Configuration configuration;

    public LimitsConfigurationController(Configuration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }
}
