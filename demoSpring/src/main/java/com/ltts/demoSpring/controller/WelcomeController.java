package com.ltts.demoSpring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.demoSpring.Dao.MovieDao;
import com.ltts.demoSpring.Dao.PlayerDao;
import com.ltts.demoSpring.model.Movie;
import com.ltts.demoSpring.model.Player;

@RestController
public class WelcomeController {
	
	@Autowired
	PlayerDao pd;
	
	@Autowired
	MovieDao md;
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
	@RequestMapping("/movie")
	public ModelAndView movieMethod()
	{
		return new ModelAndView("addmovie");
	}
	@RequestMapping(value="/insertmovie", method=RequestMethod.POST)
	public ModelAndView movieInsertMethod(HttpServletRequest request) {
		String moviename=request.getParameter("mname");
		String cast1=request.getParameter("cast1");
		String cast2=request.getParameter("cast2");
		String movietype=request.getParameter("mtype");
		String mdate=request.getParameter("mdate");
		System.out.println(mdate);
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//LocalDate ld=(LocalDate) dtf.parse(mdate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//  String date = "16/08/2016";

		  //convert String to LocalDate
		  LocalDate localDate = LocalDate.parse(mdate, formatter);
		System.out.println("PARSED DATE"+localDate);
		Movie m=new Movie(1,moviename,cast1,cast2,localDate,movietype);
		md.save(m);
		return new ModelAndView("success");
	}

}
