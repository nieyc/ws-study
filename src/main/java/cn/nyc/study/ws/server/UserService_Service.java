/**
 * UserService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.nyc.study.ws.server;

public interface UserService_Service extends javax.xml.rpc.Service {
    public java.lang.String getUserServiceImplPortAddress();

    public cn.nyc.study.ws.server.UserService_PortType getUserServiceImplPort() throws javax.xml.rpc.ServiceException;

    public cn.nyc.study.ws.server.UserService_PortType getUserServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
