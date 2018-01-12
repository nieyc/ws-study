package cn.nyc.study.ws.server;

public class UserServiceProxy implements cn.nyc.study.ws.server.UserService_PortType {
  private String _endpoint = null;
  private cn.nyc.study.ws.server.UserService_PortType userService_PortType = null;
  
  public UserServiceProxy() {
    _initUserServiceProxy();
  }
  
  public UserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServiceProxy();
  }
  
  private void _initUserServiceProxy() {
    try {
      userService_PortType = (new cn.nyc.study.ws.server.UserService_ServiceLocator()).getUserServiceImplPort();
      if (userService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userService_PortType != null)
      ((javax.xml.rpc.Stub)userService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cn.nyc.study.ws.server.UserService_PortType getUserService_PortType() {
    if (userService_PortType == null)
      _initUserServiceProxy();
    return userService_PortType;
  }
  
  public java.lang.String getName(java.lang.Long userId) throws java.rmi.RemoteException{
    if (userService_PortType == null)
      _initUserServiceProxy();
    return userService_PortType.getName(userId);
  }
  
  public cn.nyc.study.ws.server.User getUser(long arg0) throws java.rmi.RemoteException{
    if (userService_PortType == null)
      _initUserServiceProxy();
    return userService_PortType.getUser(arg0);
  }
  
  
}