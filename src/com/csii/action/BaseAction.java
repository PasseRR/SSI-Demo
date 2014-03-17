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
 * @description 所有Action的基类,实现了SessionAware、ServletRequestAware、ServleteResponseAware接口
 * @author xiehai
 * @date 2013-7-11 下午04:54:10 
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
	//获取request,response,session方式一，非IoC方式，不用实现SessionAware, ServletRequestAware, ServletResponseAware  
    //ActionContext context = ActionContext.getContext();  
    //HttpServletRequest request = (HttpServletRequest) context.get(ServletActionContext.HTTP_REQUEST);  
    //HttpServletResponse response = (HttpServletResponse) context.get(ServletActionContext.HTTP_RESPONSE);  
    //Map session = context.getSession();  
    //SessionMap session = (SessionMap) context.get(ActionContext.SESSION);  
      
    //获取request,response,session方式二，IoC方式，必须实现SessionAware, ServletRequestAware, ServletResponseAware  
}
