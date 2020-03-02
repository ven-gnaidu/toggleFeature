package com.globalConfig.globalConfig;

import kafka.Producer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("toggle")
public class ConfigurationController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getToggleForFeature(String feature) {

        return "Y";
    }

  /*  private String getFeatureValue(String feature) {
        Producer pr = new Producer();
        pr.sendMessage("I got it");
        Map<String, String> featureValue = new HashMap<>();

        return featureValue.get(feature);
    }*/




}

