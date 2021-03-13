package com.nuagesync.edi.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EDIResource {

	@RequestMapping("/list")
	List<String> getList(){
		List<String> list = new ArrayList<String>();
		list.add("Id: 101");
		list.add("Name: Navin");
		list.add("Age: 21");
		
		list.add("Id: 103");
		list.add("Name: Kshatriya");
		list.add("Age: 22");
		
		return list;
	}
}
