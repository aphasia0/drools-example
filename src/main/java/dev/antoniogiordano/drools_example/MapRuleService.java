package dev.antoniogiordano.drools_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Data

public class MapRuleService {

    @Autowired
    private KieSession kieSession;

    public void executeRules(Map<String, MyValue> map) {
        for (Map.Entry<String, MyValue> entry : map.entrySet()) {
            kieSession.insert(entry);
        }
        kieSession.fireAllRules();

    }
}