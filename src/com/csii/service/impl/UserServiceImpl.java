package com.csii.service.impl;

import java.util.List;

import com.csii.bean.User;
import com.csii.dao.UserDao;
import com.csii.service.UserService;

/**
 * @ClassName UserServiceImpl 
 * @description 用户(User)业务逻辑层实现类 
 * @author xiehai
 * @date 2013-7-11 下午05:38:00 
 */
public class UserServiceImpl implements UserService {
	/**
	 * 用户数据层接口
	 */
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User loginUser(User user) {
		return this.userDao.loginUser(user);
	}
	public void addUser(User user) {
		this.userDao.addUser(user);
	}
	public void deleteUser(int userID) {
		this.userDao.deleteUser(userID);
	}
	public List<User> getAllUser() {
		return this.userDao.getAllUser();
	}
	public void updateUser(User user) {
		this.userDao.updateUser(user);
	}
}
