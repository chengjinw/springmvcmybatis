package com.wcj.framework.exception;
/**
 * 业务处理异常
 * @author wanshuang
 * @date 2015-4-27
 */
public class ServiceException extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String errMsg;
	private String errCode;
	
	
	public ServiceException(String errMsg) {
		super();
		this.errMsg = errMsg;
	}
	public ServiceException(String errCode,String errMsg) {
		super();
		this.errMsg = errMsg;
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	
	
}
