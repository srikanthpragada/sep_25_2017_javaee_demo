package net.webservicex.www;

public class WhoIsClient {

	public static void main(String[] args) throws Exception {
	 
		  WhoisSoapProxy proxy = new WhoisSoapProxy();
		  System.out.println(proxy.getWhoIS("facebook.com"));
		  System.out.println(proxy.getWhoIS("srikanthpragada.com"));
	}

}
