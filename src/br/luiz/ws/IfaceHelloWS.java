package br.luiz.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IfaceHelloWS {
	
	@WebMethod 
	public String helloWorld(String name); 

}
