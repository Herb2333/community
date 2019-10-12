package life.majiang.community.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class IndexController {
    @GetMapping("/")                                                                   //网址什么都不输入就进入index模板
    public String index() {
        return "index";
    }
}
