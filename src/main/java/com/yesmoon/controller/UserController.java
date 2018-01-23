package com.yesmoon.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yesmoon.pojo.User;
import com.yesmoon.service.IUserService;
import com.yesmoon.util.ExceptionUtil;
import com.yesmoon.util.YmResult;

@Controller
public class UserController {
    
    private Log logger = LogFactory.getLog(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public YmResult test() {
        try {
        	logger.info("hello");
            List<User> users = userService.findUsers();
            logger.info("hello88888888");
            return YmResult.ok(users);
		} catch (Exception e) {
			return YmResult.build(500, ExceptionUtil.getStackTrace(e));
		}
    }

}
