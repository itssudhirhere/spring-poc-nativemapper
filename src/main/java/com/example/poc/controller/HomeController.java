package com.example.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.poc.dto.EmpDto;
import com.example.poc.dto.EmpProj;
import com.example.poc.entity.Employee;
import com.example.poc.service.HomeService;


@RestController
public class HomeController {

	@Autowired
	HomeService homeService;
	
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public List<Employee> index(){
		homeService.addRedcord();
		System.out.println(homeService.findById());
		return homeService.findAll();
	}
	
	
	@RequestMapping(value="/index1", method= RequestMethod.GET)
	public List<EmpProj> index1(){
		homeService.addRedcord();
//		System.out.println(homeService.findById());
		return homeService.findById1();
	}
	
	
	@RequestMapping(value="/joinData", method=RequestMethod.GET)
	public List<EmpDto> joindata(){
		return homeService.getJoinData();
	}
}
