package com.globalConfig.Mongo;

import org.springframework.data.annotation.Id;

public class Features {
    @Id
    public String id;

    public String featureName;
    public String featureValue;

    public Features(){}

    public Features(String featureName, String featureValue) {
        this.featureName = featureName;
        this.featureValue = featureValue;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, featureName, featureValue);
    }


}
