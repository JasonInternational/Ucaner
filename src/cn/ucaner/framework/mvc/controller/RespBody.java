/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.framework.mvc.controller;

import java.io.Serializable;

/**
* @Package：cn.ucaner.framework.mvc.controller   
* @ClassName：RespBody   
* @Description：   <p> 响应格式</p>
* @Author： - DaoDou 
* @CreatTime：2017年8月30日 下午1:55:06   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class RespBody implements Serializable {

	private static final long serialVersionUID = 5905715228490291386L;
	/**
	 * 状态
	 */
	private Status status;
	/**
	 * 结果
	 */
	private Object result;
	/**
	 * 消息描述
	 */
	private String message;

	public RespBody() {
		super();
	}

	/**
	 * @param status
	 */

	public RespBody(Status status) {
		super();
		this.status = status;
	}

	public RespBody(Status status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public RespBody(Status status, Object result) {
		super();
		this.status = status;
		this.result = result;
	}

	public RespBody(Status status, Object result, String message) {
		super();
		this.status = status;
		this.result = result;
		this.message = message;
	}

	/**
	 * 结果类型信息
	 */
	public enum Status {
		OK, ERROR, PROMPT
	}

	/**
	 * 添加成功结果信息
	 */
	public void addOK(String message) {
		this.message = message;
		this.status = Status.OK;
	}

	/**
	 * 添加成功结果信息
	 */
	public void addOK(Object result, String message) {
		this.message = message;
		this.status = Status.OK;
		this.result = result;
	}

	/**
	 * 添加错误消息
	 */
	public void addError(String message) {
		this.message = message;
		this.status = Status.ERROR;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
