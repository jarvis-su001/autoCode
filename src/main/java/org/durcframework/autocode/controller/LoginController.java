package org.durcframework.autocode.controller;

import org.durcframework.autocode.common.AutoCodeContext;
import org.durcframework.autocode.entity.BackUser;
import org.durcframework.autocode.service.BackUserService;
import org.durcframework.common.UserContext;
import org.durcframework.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户登陆
 */
@Controller
public class LoginController {
	@Autowired
	private BackUserService backUserService;

	/**
	 * 简单登陆,密码用的明文,实际开发不可这么做
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	@RequestMapping("login.do")
	public ModelAndView login(BackUser backUser) {

		if (StringUtils.hasText(backUser.getUsername())) {
			BackUser user = backUserService.get(backUser.getUsername());
			if (user != null
					&& user.getPassword().equals(backUser.getPassword())) {
				UserContext.getInstance().setUser(user);
				return ResultUtil.success();
			}
		}

		return ResultUtil.error("用户名密码不正确");
	}

	/**
	 * 注销
	 * 
	 * @return
	 */
	@RequestMapping("logout.do")
	public ModelAndView logout() {
		AutoCodeContext.getInstance().setUser(null);
		return ResultUtil.success();
	}
}
