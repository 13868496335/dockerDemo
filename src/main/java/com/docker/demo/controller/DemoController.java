package com.docker.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TODO
 * @Author Think
 * @Date 2019/7/3113:21
 */
@RestController
public class DemoController {

    @GetMapping("/print")
    public  void  print(HttpServletResponse res){
        try {
            res.getWriter().print("enter docker  success !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
