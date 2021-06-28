package com.ltts.demoSpring.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.demoSpring.Dao.PlayerDao;
import com.ltts.demoSpring.model.Player;

@RestController
public class WelcomeController {
	
	@Autowired
	PlayerDao pd;
	@RequestMapping("/")
	public ModelAndView firstMethod() {
		return new ModelAndView("index");
	}
	@RequestMapping("/player")
	public ModelAndView secondMethod()
	{
		return new ModelAndView("addplayer");
	}
	@RequestMapping(value="/insertPlayer", method=RequestMethod.POST)
	public ModelAndView thirdMethod(HttpServletRequest request) {
		ModelAndView mv=null;
		int no=Integer.parseInt(request.getParameter("pno"));
		System.out.println(no);
		String name=request.getParameter("pname");
		int tno=Integer.parseInt(request.getParameter("tno"));
		String mobile=request.getParameter("mobile");
		int runs=Integer.parseInt(request.getParameter("runs"));
		System.out.println(no+" &&& "+name+" %%%% "+tno+"  "+mobile);
		Player p=new Player(no,name,tno,mobile,runs);
		pd.insertPlayer(p);
		return mv;
	}

}
