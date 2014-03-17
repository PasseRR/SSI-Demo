package com.csii.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.csii.bean.User;
import com.csii.dao.UserDao;

/**
 * @ClassName UserDaoImpl 
 * @description 实现用户(User)的数据层类
 * @author xiehai
 * @date 2013-7-11 下午05:34:31 
 */
public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {
	
	/* (non-Javadoc)
	 * @see com.csii.dao.UserDao#loginUser(com.csii.bean.User)
	 */
	public User loginUser(User user) {
		return (User)this.getSqlMapClientTemplate().queryForObject("user.loginUser", user);
	}

	public void addUser(User user) {
		this.getSqlMapClientTemplate().insert("user.saveUser", user);
	}

	public void deleteUser(int userID) {
		this.getSqlMapClientTemplate().delete("user.deleteUser", userID);
	}

	public List<User> getAllUser() {
		return (List<User>) this.getSqlMapClientTemplate().queryForList("user.getAllUser");
	}

	public void updateUser(User user) {
		this.getSqlMapClientTemplate().update("user.updateUser", user);
	}
}
