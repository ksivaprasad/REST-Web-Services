package com.samplerestservice.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * REST Service Using Spring MVC
 * 
 * @author Sivaprasad
 *
 */

@Controller
@RequestMapping("/getService")
public class SampleController {
	
	@RequestMapping(value="/getData", method = {RequestMethod.GET,RequestMethod.POST}, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE  )
	public @ResponseBody String getService(@RequestBody String input) {
		JSONParser parser = new JSONParser();
		try {
			JSONObject json = (JSONObject) parser.parse(input);
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Received";
	}
	
}
