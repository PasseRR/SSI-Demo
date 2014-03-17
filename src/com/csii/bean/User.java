package com.csii.bean;

/**
 * @ClassName User 
 * @description User的Bean类
 * @author xiehai
 * @date 2013-7-11 下午04:57:38 
 */
public class User {
	/**
	 * 用户ID
	 */
	private int userID;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String userPassword;
	//必须要有无参的构造函数,很多框架都会用到这个,否则会报错
	public User(){
		
	}
	public User(String userName, String userPassword) {
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
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
	@Override
	public String toString() {
		return "userID = " + this.userID + ", userName = " + this.userName +
			   ", userPassword" + this.userPassword;
	}
}
