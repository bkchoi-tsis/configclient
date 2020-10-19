package com.bkchoi.configclient.controller;

import com.bkchoi.configclient.service.ConfigServerDynamic;
import com.bkchoi.configclient.service.ConfigServerStatic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConfigServerController {

    String rtn ="";

    ConfigServerStatic configServerStatic;
    ConfigServerDynamic configServerDynamic;

    public ConfigServerController(ConfigServerStatic configServerStatic, ConfigServerDynamic configServerDynamic) {
        this.configServerStatic = configServerStatic;
        this.configServerDynamic = configServerDynamic;
    }

    @RequestMapping(method = RequestMethod.GET, value ="/dynamic")
    public String getDynamic(){
        rtn = "dynamic";
        System.out.println("dynamic");
        System.out.println(configServerDynamic.getTest());
        return rtn;
    }

    @RequestMapping(method = RequestMethod.GET, value ="/static")
    public String getStatic(){
        rtn = "static";
        System.out.println("static");
        System.out.println(configServerStatic.getTest());
        return rtn;
    }

//    @RequestMapping(method = RequestMethod.GET, value ="/test")
//    public String getTest(){
//        System.out.println(first);
//        System.out.println(second);
//        return first;
//    }


}
