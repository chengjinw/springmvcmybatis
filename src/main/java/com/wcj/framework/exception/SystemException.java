package com.wcj.framework.exception;

public class SystemException extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  public SystemException(String frdMessage)
  {
    super(createErrMsg(frdMessage));
  }

  public SystemException(Throwable throwable) {
    super(throwable);
  }

  public SystemException(Throwable throwable, String frdMessage) {
    super(createErrMsg(frdMessage), throwable);
  }

  private static String createErrMsg(String msgBody) {
    String prefixStr = "抱歉，";
    String suffixStr = " 请稍后再试或与管理员联系！";
    StringBuffer errMsg = new StringBuffer("");
    errMsg.append(prefixStr);
    errMsg.append(msgBody);
    errMsg.append(suffixStr);
    return errMsg.toString();
  }
}