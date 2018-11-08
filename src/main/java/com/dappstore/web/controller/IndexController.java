package com.dappstore.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author houfc
 * @date 2018/11/8
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/**")
    public Object index() {
        return "Hello 51Dapp";
    }
}
