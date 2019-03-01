package com.xsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ext
 *
 * @author xsh
 * @create 2019-03-01 14:24
 **/
@RestController
@RequestMapping("/ext/")
public class ExtController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("getSerivces")
    public String getSerivces() {
        String services = "Services:" + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
