package net.xdclass.demoproject.controller;

import net.xdclass.demoproject.config.WxConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tpl")
public class TemplatesController {

    @Autowired
    private WxConfig wxConfig;

    @GetMapping("freemarker")
    public String index1(ModelMap modelMap) {
        modelMap.addAttribute("setting", wxConfig);
        //不用加后缀，因为配置文件里加了后缀了
        return "user/fm/index";
    }

    @GetMapping("thymeleaf")
    public String index2(ModelMap modelMap) {
        modelMap.addAttribute("setting", wxConfig);
        //不用加后缀，因为配置文件里加了后缀了
        return "tl/index";
    }
}
