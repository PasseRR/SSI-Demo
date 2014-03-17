package com.csii.service;

import java.util.List;

import com.csii.bean.User;

/**
 * @ClassName UserDao 
 * @description �û�(User)�����ݲ�ӿ�
 * @author xiehai
 * @date 2013-7-11 ����05:35:22 
 */
public interface UserService {
	/** 
	 * �û���¼
	 * @param user
	 * @return ��¼���û�
	 */
	public User loginUser(User user);
	
	/** 
	 * �û����
	 * @param user ���û�����Ϣ
	 */
	public void addUser(User user);

	/** 
	 * �û��޸�
	 * @param user �޸��û�����Ϣ
	 */
	public void updateUser(User user);

	/** 
	 * ɾ���û�
	 * @param userID Ҫɾ���û���ID
	 */
	public void deleteUser(int userID);

	/** 
	 * ��ȡ���е��û�
	 * @return �û�List
	 */
	public List<User> getAllUser();
}
