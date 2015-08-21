package no.hal.pg.runtime.engine.http;

import javax.servlet.http.HttpServlet;

import no.hal.pg.runtime.Service;

public class ServiceEndPoint extends HttpServlet {

	private Service<?> service;
	
	public ServiceEndPoint(Service<?> service) {
		this.service = service;
	}

}
