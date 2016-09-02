package com.addressbookdao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.addressbookdao.data.ContactDataEntry;

@RestController
@RequestMapping("/demo")
public class DemoController {
	private List<String> names;
	
	public DemoController() {
		names = new ArrayList<String>();
		names.add("Name1");
		names.add("Name2");
		names.add("Name3");
	}
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello";
	}
	
	@RequestMapping(value = "/names", method = RequestMethod.GET)
	public List<String> getNames(){
		return names;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public List<String> addName(@RequestBody String name){
		names.add(name);
		return names;
	}
}
