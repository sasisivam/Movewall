package com.movewall.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movewall.model.Campaign;
import com.movewall.model.CampaignData;
@Controller
@RestController
public class HelloWorldController {

	@RequestMapping({ "/hello" })
	  @ResponseBody
	public String firstPage() {
		return "Hello World";
	}
	
	@RequestMapping("/")
	  @ResponseBody
	public String index() {
		return "login.html";
	}


	@RequestMapping("/getall")
	  @ResponseBody
	public List<Campaign> Getuser() {
		CampaignData cm = new CampaignData();
List<Campaign> l = cm.getAll();
		return l;
	}
	
	@RequestMapping("/getuser/{username}")
	  @ResponseBody
	public List<Campaign> Getuserbyname(@PathVariable("username") String username) {
		CampaignData cm = new CampaignData();
List<Campaign> l = cm.filter(username);
		return l;
	}
	@RequestMapping("/getstatus/{status}")
	  @ResponseBody
	public List<Campaign> Getuserbystatus(@PathVariable("status") String status) {
		CampaignData cm = new CampaignData();
List<Campaign> l = cm.filterbystatus(status);
		return l;
	}
	
	@RequestMapping("/getstatusbysort")
	  @ResponseBody
	public List<Campaign> Getuserbydate() {
		CampaignData cm = new CampaignData();
List<Campaign> l = cm.sortbyDate();
		return l;
		
	}
	
}