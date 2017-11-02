package net.webservicex.www;

public class WhoisSoapProxy implements net.webservicex.www.WhoisSoap {
  private String _endpoint = null;
  private net.webservicex.www.WhoisSoap whoisSoap = null;
  
  public WhoisSoapProxy() {
    _initWhoisSoapProxy();
  }
  
  public WhoisSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWhoisSoapProxy();
  }
  
  private void _initWhoisSoapProxy() {
    try {
      whoisSoap = (new net.webservicex.www.WhoisLocator()).getwhoisSoap();
      if (whoisSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)whoisSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)whoisSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (whoisSoap != null)
      ((javax.xml.rpc.Stub)whoisSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.webservicex.www.WhoisSoap getWhoisSoap() {
    if (whoisSoap == null)
      _initWhoisSoapProxy();
    return whoisSoap;
  }
  
  public java.lang.String getWhoIS(java.lang.String hostName) throws java.rmi.RemoteException{
    if (whoisSoap == null)
      _initWhoisSoapProxy();
    return whoisSoap.getWhoIS(hostName);
  }
  
  
}