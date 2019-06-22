package br.luiz.main;

import javax.xml.ws.Endpoint;

import br.luiz.ws.HelloWS;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Endpoint.publish("http://localhost:4791/ws/hello", new HelloWS());
			System.out.println("Done");
		}
		catch(Exception e) {			
			System.out.println(e.getMessage());			
		}

	}
}
