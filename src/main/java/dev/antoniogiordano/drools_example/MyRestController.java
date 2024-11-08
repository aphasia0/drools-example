package dev.antoniogiordano.drools_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyRestController {

    @Autowired
    private MapRuleService mapRuleService;

    @PostMapping("/evaluate")
    public String evaluateRules(@RequestBody Map<String, MyValue> map) {
        System.out.println("BEFORE: " + map);
        mapRuleService.executeRules(map);
        System.out.println("AFTER:" + map);
        return "Rules evaluated";
    }
}
