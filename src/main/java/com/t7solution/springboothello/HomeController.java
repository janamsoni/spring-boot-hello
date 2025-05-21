package com.t7solution.springboothello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @RequestMapping(value = {"","/"})
    String home()
    {
        return "Hello World";
    }

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable(required = false) String name )
    {
        return "Hello " + name;
    }
}
