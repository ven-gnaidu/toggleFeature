package com.globalConfig.globalConfig;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("toggle")
public class ConfigurationController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getToggleForFeature() {
         return "TurnedOn";
    }

}

