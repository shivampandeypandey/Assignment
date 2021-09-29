package com.assignment.springboot;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/details")
public class springbootApplicationController {
	
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getSomeParameters() {
	    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
	            "Employee Name", "Shivam pandey",
	            "Employee Code", "11136",
	            "Email", "shivam.pandey@quantiphi.com",
	            "Permanent Address","XYZ, gorakhpur, Uttarpradesh",
	            "Birth Date","01-Dec-2000",
	            "Mobile Phone","9997501509",
	            "Gender","Male",
	            "Primary Department","QAI - AI - India"
	    		));
	}    

}
