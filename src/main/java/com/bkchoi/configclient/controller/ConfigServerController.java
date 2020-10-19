package com.bkchoi.configclient.controller;

import com.bkchoi.configclient.service.ConfigServerDynamic;
import com.bkchoi.configclient.service.ConfigServerStatic;
import com.sun.istack.internal.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;


@RestController
@RefreshScope
public class ConfigServerController {

    String rtn ="";

    @Value("${bkchoi.said.first}")
    private String first;
    @Value("${bkchoi.said.second}")
    private String second;

//    ConfigServerStatic configServerStatic;
//    ConfigServerDynamic configServerDynamic;
//
//    @RequestMapping(method = RequestMethod.GET, value ="/dynamic")
//    public String getDynamic(){
//        rtn = "dynamic";
//        System.out.println("dynamic");
//        System.out.println(configServerDynamic.getTest());
//        return rtn;
//    }

    @GetMapping("/test")
    public String getTest(){
        System.out.println(first);
        System.out.println(second);
        return first;
    }


}
