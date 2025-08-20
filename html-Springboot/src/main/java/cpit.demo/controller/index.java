package cpit.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页控制器，负责跳转到index.html页面
 */
@Controller
public class Index {
    /**
     * 处理根路径("/")和"/index"的GET请求
     * 跳转到index.html页面
     * 
     * @return 视图名称"index"，对应templates目录下的index.html
     */
    @GetMapping(value = {"/", "/index"})
    public String index() {
        // 返回视图名称，结合Thymeleaf配置会定位到classpath:/templates/index.html
        return "forward:/index.html";
    }
}
