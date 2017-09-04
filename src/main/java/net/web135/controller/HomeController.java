package net.web135.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liu_t on 2017-9-5.
 * net.web135.controller @ springbootdemo
 */
@RestController
public class HomeController {

    @GetMapping("/hello")
    public String helloWorld(){
        //TODO 刘博，这样使用注解的写法会非常省心，使用浏览器访问“http://localhost:8080/hello”就会返回“helloWorld! LiuBo”在页面，你可以继续写些其他的玩
        return "helloWorld! LiuBo";
    }
}
