package com.sigismondi.marco.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class Endpoint {

	Logger logger = LoggerFactory.getLogger(Endpoint.class);

	@GetMapping()
	public String getMessage(String input) {
		return input;
	}

}
