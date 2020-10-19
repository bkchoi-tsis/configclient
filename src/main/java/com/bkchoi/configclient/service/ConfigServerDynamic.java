package com.bkchoi.configclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RefreshScope
public class ConfigServerDynamic {

    @Value("${bkchoi.said.first}")
    private String first;
    @Value("${bkchoi.said.second}")
    private String second;

    public Map<String,String> getTest (){
        Map<String,String> keyworld = new HashMap<>();
        keyworld.put("first", first);
        keyworld.put("second", second);

        return keyworld;
    }
}
