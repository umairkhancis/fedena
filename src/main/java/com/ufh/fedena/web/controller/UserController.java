package com.ufh.fedena.web.controller;

import com.ufh.fedena.model.entity.User;
import com.ufh.fedena.model.repo.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Umair on 3/11/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserRepository userRepository;

    String result;

    @RequestMapping("/greeting/{name}")
    public @ResponseBody
    User greeting(@PathVariable("name") String name) {
        result += 1;

        User user = new User();
        user.setUserID(1L);
        user.setUserName(name);
        user.setPassword("123456");

        return user;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public @ResponseBody User createUser(@RequestBody User requestUser) {
        userRepository.save(requestUser);

        return requestUser;
    }

    @RequestMapping(value = {"/"})
    public String printHello(ModelMap model) {
        model.addAttribute("name", "Umair Ahmed Khan !");

        List<User> users = userRepository.findAll();

        List<String> names = new ArrayList<String>();

        for (User user : users) {
            names.add(user.getUserName());
        }
        model.addAttribute("names", names);

        return "test";
    }
}
