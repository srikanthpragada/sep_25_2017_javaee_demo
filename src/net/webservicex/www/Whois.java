/**
 * Whois.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.webservicex.www;

public interface Whois extends javax.xml.rpc.Service {
    public java.lang.String getwhoisSoapAddress();

    public net.webservicex.www.WhoisSoap getwhoisSoap() throws javax.xml.rpc.ServiceException;

    public net.webservicex.www.WhoisSoap getwhoisSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
