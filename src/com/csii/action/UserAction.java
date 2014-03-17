package com.csii.action;

import java.util.List;

import com.csii.bean.User;
import com.csii.service.impl.UserServiceImpl;

/**
 * @ClassName UserAction 
 * @description 用户的Action类
 * @author xiehai
 * @date 2013-7-11 下午05:40:07 
 */
public class UserAction extends BaseAction {
	private UserServiceImpl userServiceImpl;
	private String userName;
	private String userPassword;
	private List<User> list;
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public UserServiceImpl getUserServiceImpl() {
		return userServiceImpl;
	}
	public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	/** 
	 * 用户登录Action
	 * @return
	 */
	public String login(){
//		System.out.println("userName = " + this.userName + ", userPassword = " + this.userPassword);
		User user = null;
		try {
			user = this.userServiceImpl.loginUser(new User(this.userName, this.userPassword));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(user == null){//登录失败
			return "loginerror";
		}
		this.session.put("user", user);
		return LOGIN;
	}

	/** 
	 * 用户修改Action 
	 * @return
	 */
	public String add(){
		User user = new User(this.userName, this.userPassword);
		try {
			this.userServiceImpl.addUser(user);
			return "addSuccess";
		} catch (Exception e) {
			e.printStackTrace();
			return "addError";
		}
	}

	/** 
	 * 用户修改Action
	 * @return
	 */
	public String update(){
		User user = new User(this.userName, this.userPassword);
		user.setUserID(((User)session.get("user")).getUserID());
//		System.out.println(user);
		try {
			this.userServiceImpl.updateUser(user);
			return "updateSuccess";
		} catch (Exception e) {
			e.printStackTrace();
			return "updateError";
		}
	}

	/** 
	 * 用户删除Action
	 * @return
	 */
	public String delete(){
		int userID = ((User)session.get("user")).getUserID();
		try {
			this.userServiceImpl.deleteUser(userID);
			return "deleteSuccess";
		} catch (Exception e) {
			e.printStackTrace();
			return "deleteError";
		}
	}
	
	/** 
	 * 列举所有用户Action
	 * @return
	 */
	public String list(){
		try {
			this.list = this.userServiceImpl.getAllUser();
			return "listSuccess";
		} catch (Exception e) {
			e.printStackTrace();
			return "listError";
		}
	}
}
