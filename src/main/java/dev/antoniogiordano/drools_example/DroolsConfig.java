package dev.antoniogiordano.drools_example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("dev.antoniogiordano.drools_example")
public class DroolsConfig {

    private static final String drlFile = "dev/antoniogiordano/drools_example/broker-rule.drl";

    @Bean
    public KieSession kieContainer() {
        KieServices kieServices = KieServices.Factory.get();
        return kieServices.getKieClasspathContainer().newKieSession("defaultKieSession");
    }


}