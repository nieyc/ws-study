/**
 * UserService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.nyc.study.ws.server;

public interface UserService_PortType extends java.rmi.Remote {
    public java.lang.String getName(java.lang.Long userId) throws java.rmi.RemoteException;
    public cn.nyc.study.ws.server.User getUser(long arg0) throws java.rmi.RemoteException;
}
