package com.itheima.controller;

import com.itheima.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.*;

/**
 * @author ljh
 * @version 1.0
 * @date 2020/9/29 09:54
 * @description 标题
 * @package com.itheima.controller rr
 *
 * hot-fix
 * master冲突
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/show")
    public String showPage(Model model){
        //展示简单的
        model.addAttribute("message","hello world");

        //展示pojo
        Person person = new Person("张三", 18, 1L);
        model.addAttribute("person",person);
        //展示集合List<Person>
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("隔壁老王",50,1L));
        personList.add(new Person("孙悟空",500,2L));
        personList.add(new Person("张三疯",500,3L));
        model.addAttribute("personList",personList);
        //循环map
        Map<String,Object> dataMap = new HashMap<String,Object>();
        dataMap.put("No","123");
        dataMap.put("address","深圳");
        model.addAttribute("dataMap",dataMap);
        //设置ID 的值
        model.addAttribute("id",1) ;
        model.addAttribute("age",18) ;
        //日期
        model.addAttribute("date",new Date());
        return "/indexTH.html";
//        return "redirect:http://192.168.0.201:90/indexTH.html";
    }


}
