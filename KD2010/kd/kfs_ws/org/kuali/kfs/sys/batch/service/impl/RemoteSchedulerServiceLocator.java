/**
 * RemoteSchedulerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.kuali.kfs.sys.batch.service.impl;

public class RemoteSchedulerServiceLocator extends org.apache.axis.client.Service implements org.kuali.kfs.sys.batch.service.impl.RemoteSchedulerService {

    public RemoteSchedulerServiceLocator() {
    }


    public RemoteSchedulerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RemoteSchedulerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RemoteSchedulerServiceImplPort
    private java.lang.String RemoteSchedulerServiceImplPort_address = "http://localhost:8080/kfs-dev/ws/remoteSchedulerService";

    public java.lang.String getRemoteSchedulerServiceImplPortAddress() {
        return RemoteSchedulerServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RemoteSchedulerServiceImplPortWSDDServiceName = "RemoteSchedulerServiceImplPort";

    public java.lang.String getRemoteSchedulerServiceImplPortWSDDServiceName() {
        return RemoteSchedulerServiceImplPortWSDDServiceName;
    }

    public void setRemoteSchedulerServiceImplPortWSDDServiceName(java.lang.String name) {
        RemoteSchedulerServiceImplPortWSDDServiceName = name;
    }

    public org.kuali.kfs.sys.batch.service.RemoteSchedulerService getRemoteSchedulerServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RemoteSchedulerServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRemoteSchedulerServiceImplPort(endpoint);
    }

    public org.kuali.kfs.sys.batch.service.RemoteSchedulerService getRemoteSchedulerServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.kuali.kfs.sys.batch.service.impl.RemoteSchedulerServiceSoapBindingStub _stub = new org.kuali.kfs.sys.batch.service.impl.RemoteSchedulerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRemoteSchedulerServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRemoteSchedulerServiceImplPortEndpointAddress(java.lang.String address) {
        RemoteSchedulerServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.kuali.kfs.sys.batch.service.RemoteSchedulerService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.kuali.kfs.sys.batch.service.impl.RemoteSchedulerServiceSoapBindingStub _stub = new org.kuali.kfs.sys.batch.service.impl.RemoteSchedulerServiceSoapBindingStub(new java.net.URL(RemoteSchedulerServiceImplPort_address), this);
                _stub.setPortName(getRemoteSchedulerServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RemoteSchedulerServiceImplPort".equals(inputPortName)) {
            return getRemoteSchedulerServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.batch.sys.kfs.kuali.org/", "remoteSchedulerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.batch.sys.kfs.kuali.org/", "RemoteSchedulerServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RemoteSchedulerServiceImplPort".equals(portName)) {
            setRemoteSchedulerServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
