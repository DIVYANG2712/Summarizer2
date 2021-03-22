package jsonproject.jsonproject;

import java.net.URL;

public class UrlHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{    
		    URL url=new URL("162.222.176.37:3656 + '/' + 1610342314 ");    
		    System.out.println("Protocol: "+url.getProtocol());// Using getProtocol() method of the URL class  
		    System.out.println("Host Name: "+url.getHost()); // Using getHost() method   
		    System.out.println("Port Number: "+url.getPort());  // Using getPort() method  
		    System.out.println("File Name: "+url.getFile());    //Using getFile() method  
		    }  
		catch(Exception e)  
		{  
		    System.out.println(e);}    
	}    

}


