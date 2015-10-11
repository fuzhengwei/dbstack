package com.stack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: fuzhengwei
 * Date: 15-10-11
 * Time: 下午7:01
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class Test {

    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        System.out.println("测试 。。 。。");
        return "index";
    }

}
