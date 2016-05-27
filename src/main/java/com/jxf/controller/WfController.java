/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jxf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author achmad.ha
 */
@RestController
public class WfController {

    @RequestMapping("/sample")
    public String sampleIt() {
        return "Hello! Welcome to Spring Boot Sample. ";
    }

}
