package jaxws;

public class JobsServiceProxy implements jaxws.JobsService {
  private String _endpoint = null;
  private jaxws.JobsService jobsService = null;
  
  public JobsServiceProxy() {
    _initJobsServiceProxy();
  }
  
  public JobsServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initJobsServiceProxy();
  }
  
  private void _initJobsServiceProxy() {
    try {
      jobsService = (new jaxws.JobsServiceServiceLocator()).getJobsServicePort();
      if (jobsService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jobsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jobsService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jobsService != null)
      ((javax.xml.rpc.Stub)jobsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public jaxws.JobsService getJobsService() {
    if (jobsService == null)
      _initJobsServiceProxy();
    return jobsService;
  }
  
  public java.lang.String getJobTitle(java.lang.String arg0) throws java.rmi.RemoteException{
    if (jobsService == null)
      _initJobsServiceProxy();
    return jobsService.getJobTitle(arg0);
  }
  
  public jaxws.Job[] getJobs() throws java.rmi.RemoteException{
    if (jobsService == null)
      _initJobsServiceProxy();
    return jobsService.getJobs();
  }
  
  public jaxws.Job[] searchJobs(java.lang.String arg0) throws java.rmi.RemoteException{
    if (jobsService == null)
      _initJobsServiceProxy();
    return jobsService.searchJobs(arg0);
  }
  
  
}