package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlianRepository;
import com.example.demo.model.Alian;

@Controller
public class AlianController {
	@Autowired
	AlianRepository repo;
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/addAlian")
	public String addAlian(Alian alian) {
		repo.save(alian);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlian")
	public ModelAndView addAlian(@RequestParam int aid) {
		ModelAndView mv=new ModelAndView("showAlian.jsp");
		Alian alian=repo.findById(aid).orElse(new Alian());
//		System.out.println(repo.findById(aid));
//		System.out.println(repo.findByAname("pruthvi"));
		System.out.println(repo.findByAidGreaterThan(102));
		mv.addObject(alian);
		return mv;
	}
	

}
 