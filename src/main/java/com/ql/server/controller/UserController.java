package com.ql.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ql.server.entity.User;
import com.ql.server.service.UserService;
import com.ql.server.util.JnResBodyUtil;
import com.ql.server.util.JnResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login.do",method= RequestMethod.POST)
	@ResponseBody
	public JnResponseBody login(@RequestBody User user) {
		return userService.login(user);
	}
}
