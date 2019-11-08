package life.majiang.community.controller;

import life.majiang.community.dto.PaginationDTO;
import life.majiang.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")                                                                   //网址什么都不输入就进入index模板
    public String index(
                        Model model,
                        @RequestParam(name="page",defaultValue="1") Integer page,
                        @RequestParam(name="size",defaultValue="5") Integer size) {

        PaginationDTO pagination = questionService.list(page,size);
//        for (QuestionDTO questionDTO : questionList) {
//            questionDTO.setDescription("reset2");
//        }
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
