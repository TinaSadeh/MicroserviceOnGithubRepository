package com.tina.configOnGithub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/insurance-service")
public class InsuranceProviderApplication {
    @GetMapping("/getAllPlans")
    public List<String> getPlans(){
    return Stream.of("Premuim","Gold","Platuim").collect(Collectors.toList());
    }
}
