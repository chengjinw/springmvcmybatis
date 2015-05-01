package com.wcj.framework.exception;

/**
 * 参数异常
 * @author wanshuang
 * @date 2015-4-27
 */

public class ParameterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ParameterException() {
		super();
	}

	public ParameterException(String message) {
		super(message);
	}

	public ParameterException(Throwable cause) {
		super(cause);
	}

	public ParameterException(String message, Throwable cause) {
		super(message, cause);
	}
}
