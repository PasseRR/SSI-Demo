package com.csii.service;

import java.util.List;

import com.csii.bean.User;

/**
 * @ClassName UserDao 
 * @description 用户(User)的数据层接口
 * @author xiehai
 * @date 2013-7-11 下午05:35:22 
 */
public interface UserService {
	/** 
	 * 用户登录
	 * @param user
	 * @return 登录的用户
	 */
	public User loginUser(User user);
	
	/** 
	 * 用户添加
	 * @param user 新用户的信息
	 */
	public void addUser(User user);

	/** 
	 * 用户修改
	 * @param user 修改用户的信息
	 */
	public void updateUser(User user);

	/** 
	 * 删除用户
	 * @param userID 要删除用户的ID
	 */
	public void deleteUser(int userID);

	/** 
	 * 获取所有的用户
	 * @return 用户List
	 */
	public List<User> getAllUser();
}
