package com.business.controller;

import com.business.domain.Book;
import com.business.domain.User;
import com.business.service.ServiceUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pei on 2016/5/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    ServiceUser serviceUser;

    @RequestMapping("showAll")
    public String showAll(Map<String,Object> map){
        List<User> users = serviceUser.getAll();
        map.put("users",users);
        return "show.jsp";
    }

    @RequestMapping("/find")
    public String find(Integer id, Model model) {
        User user = serviceUser.getUserProduct(id);
        model.addAttribute("user", user);
        return "test.jsp";
    }

  /*  @RequestMapping("/findother")该例子为直接跳到WEB-INF外的index页面
    public String findOther(Integer id, HttpServletRequest request) {
        User user = serviceUser.getUserById(id);
        request.getSession().setAttribute("user", user);
        return "redirect:/index.jsp";
    }*/
    @RequestMapping("/toinsert")
    public String toinsert(){
        return "insert.jsp";
    }
    @RequestMapping("/insert")
    public String insert(User user){
        serviceUser.insert(user);
        return "redirect:/user/showAll";
    }
    @RequestMapping("/toupdate")
    public String toupdate(Integer id,Model model){
        User user = serviceUser.getUserById(id);
        model.addAttribute("user",user);
        return "update.jsp";
    }
    @RequestMapping("/update")
    public String update(User user){
        serviceUser.updateById(user);
        return "redirect:/user/showAll";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        serviceUser.deleteById(id);
        return "redirect:/user/showAll";
    }
    @RequestMapping("/deleteMore")
    public String deleteMore(@RequestParam("ids") String idLIst){
        for (String id : idLIst.split(",")) {
            serviceUser.deleteById(Integer.parseInt(id));
        }
        return "redirect:/user/showAll";
    }
    //展示所有人的所有信息时用的方法
    @RequestMapping("/usersinfo")
    public String getUsersAllInfo(Integer id,Map map){
        map.put("id",id);
        List<User> users= serviceUser.getUserAllInfo(map);
       map.put("users",users);

        return "redirect:/user/showAll";
    }
    //只要一个人的所有信息
    @RequestMapping("/userinfo")
    public String getUserAllInfoById(Integer id,Map map){
        User user = serviceUser.getUserAllInfoById(id);
        System.out.println("userinfo");
       map.put("user",user);
        return "personalinfo.jsp";
    }


}
