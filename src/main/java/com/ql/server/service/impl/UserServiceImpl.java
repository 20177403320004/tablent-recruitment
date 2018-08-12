package com.ql.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ql.server.dao.UserDao;
import com.ql.server.entity.User;
import com.ql.server.service.UserService;
import com.ql.server.util.JnResBodyUtil;
import com.ql.server.util.JnResCode;
import com.ql.server.util.JnResponseBody;

@Service
public class UserServiceImpl implements UserService{
    
	@Autowired
	private UserDao userDao;

	public JnResponseBody login(User user) {
		// TODO Auto-generated method stub
		if(user.getUserName()==null || user.getUserName()=="") {
			return JnResBodyUtil.error("1","用户不能为空");
		}else if(user.getPassWord()==null || user.getPassWord()=="") {
			return JnResBodyUtil.error("2","密码不能为空");
		}else {
			User resultUser=userDao.login(user);
			if(resultUser==null) {
				return JnResBodyUtil.error("3","用户名或密码不正确");
			}else {
				return JnResBodyUtil.success(resultUser);
			}
			
		}
	}
	
   

	

}
