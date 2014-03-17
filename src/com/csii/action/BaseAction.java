package com.csii.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName BaseAction 
 * @description ����Action�Ļ���,ʵ����SessionAware��ServletRequestAware��ServleteResponseAware�ӿ�
 * @author xiehai
 * @date 2013-7-11 ����04:54:10 
 */
public class BaseAction extends ActionSupport implements SessionAware,
		ServletRequestAware, ServletResponseAware {
	private static final long serialVersionUID = 1L;
    HttpServletRequest request;  
    HttpServletResponse response;  
    Map<String, Object> session;  
	public void setSession(Map<String, Object> map) {
		this.session = map;
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	//��ȡrequest,response,session��ʽһ����IoC��ʽ������ʵ��SessionAware, ServletRequestAware, ServletResponseAware  
    //ActionContext context = ActionContext.getContext();  
    //HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);  
    //HttpServletResponse response = (HttpServletResponse) context.get(ServletActionContext.HTTP_RESPONSE);  
    //Map session = context.getSession();  
    //SessionMap session = (SessionMap) context.get(ActionContext.SESSION);  
      
    //��ȡrequest,response,session��ʽ����IoC��ʽ������ʵ��SessionAware, ServletRequestAware, ServletResponseAware  
}
