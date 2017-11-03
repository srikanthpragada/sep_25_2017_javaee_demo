/**
 * JobsServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxws;

public class JobsServiceServiceLocator extends org.apache.axis.client.Service implements jaxws.JobsServiceService {

    public JobsServiceServiceLocator() {
    }


    public JobsServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JobsServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JobsServicePort
    private java.lang.String JobsServicePort_address = "http://localhost:8888/webdemo/jaxws/jobs";

    public java.lang.String getJobsServicePortAddress() {
        return JobsServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JobsServicePortWSDDServiceName = "JobsServicePort";

    public java.lang.String getJobsServicePortWSDDServiceName() {
        return JobsServicePortWSDDServiceName;
    }

    public void setJobsServicePortWSDDServiceName(java.lang.String name) {
        JobsServicePortWSDDServiceName = name;
    }

    public jaxws.JobsService getJobsServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JobsServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJobsServicePort(endpoint);
    }

    public jaxws.JobsService getJobsServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            jaxws.JobsServicePortBindingStub _stub = new jaxws.JobsServicePortBindingStub(portAddress, this);
            _stub.setPortName(getJobsServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJobsServicePortEndpointAddress(java.lang.String address) {
        JobsServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (jaxws.JobsService.class.isAssignableFrom(serviceEndpointInterface)) {
                jaxws.JobsServicePortBindingStub _stub = new jaxws.JobsServicePortBindingStub(new java.net.URL(JobsServicePort_address), this);
                _stub.setPortName(getJobsServicePortWSDDServiceName());
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
        if ("JobsServicePort".equals(inputPortName)) {
            return getJobsServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxws/", "JobsServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxws/", "JobsServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JobsServicePort".equals(portName)) {
            setJobsServicePortEndpointAddress(address);
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
