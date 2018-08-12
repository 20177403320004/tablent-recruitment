package com.ql.server.service;

import com.ql.server.entity.User;
import com.ql.server.util.JnResponseBody;

public interface UserService {

	public JnResponseBody login(User user);

}
