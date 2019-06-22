package br.luiz.ws;

import javax.jws.WebService;

@WebService(endpointInterface="br.luiz.ws.IfaceHelloWS")
public class HelloWS implements IfaceHelloWS{

	@Override
	public String helloWorld(String name) {
		// TODO Auto-generated method stub
		return "Hello World " + name;
	}

}
