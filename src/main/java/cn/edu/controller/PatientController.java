package cn.edu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2017/12/29.
 */
@RestController
@RequestMapping("/patient")
public class PatientController {
    @RequestMapping("/basic")
    public String basic() {
        return "basic";
    }
    @RequestMapping("/")
    public String  hello() {
        return "Hello";
    }
}
