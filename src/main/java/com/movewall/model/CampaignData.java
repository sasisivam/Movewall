package com.movewall.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class CampaignData {

	public List<Campaign> getAll() {
		Campaign c= new Campaign();
		Campaign c1 = new Campaign();
		Campaign c2 = new Campaign();
		Campaign c3 = new Campaign();
		Campaign c4 = new Campaign();
		
		List<Campaign> al = new ArrayList<Campaign>();
		Date d = new Date(20200505);
		Date d1	 = new Date(20200606);
		Date d2 = new Date(20200705);
		Date d3	 = new Date(20200806);
		Date d4 = new Date(20201005);
		Date d5	 = new Date(20190606);
		c.setName("UA sports");
		c.setDuration("5 Months");
		c.setStatus("Published");
		c.setCompleteddate(d);
		c1.setName("Focus ");
		c1.setDuration("2 Months");
		c1.setStatus("Published");
		c1.setCompleteddate(d1);
		c2.setName("Billiords");
		c2.setDuration("1 Months");
		c2.setStatus("Archived");
		c2.setCompleteddate(d5);
		c3.setName("Media");
		c3.setDuration("4 Months");
		c3.setStatus("ongoing");
		c3.setCompleteddate(d2);
		c4.setName("Test");
		c4.setDuration("10 Months");
		c4.setStatus("Processing");
		c4.setCompleteddate(d3);
		c4.setName("Tournament");
		c4.setDuration("10 Months");
		c4.setStatus("Processing");
		c4.setCompleteddate(d4);
		//c6.setCompleteddate(d);
		al.add(c);
		al.add(c1);
		al.add(c2);
		al.add(c3);

		al.add(c4);
		return al;  
	}
	
	public List<Campaign> filter(String Name){
		CampaignData cam =new CampaignData();
		List<Campaign> l=cam.getAll();
		List<Campaign> user = new ArrayList<>();
		l.stream().filter(name -> name.getName().equals(Name)).forEachOrdered(user::add);
		return user;
		
		
		
	}
	public List<Campaign> filterbystatus(String status){
		CampaignData cam =new CampaignData();
		List<Campaign> l=cam.getAll();
		List<Campaign> user = new ArrayList<>();
		l.stream().filter(name -> name.getStatus().equals(status)).forEachOrdered(user::add);
		return user;
	
	}
	public List<Campaign> sortbyDate(){
		CampaignData cam =new CampaignData();
		List<Campaign> l=cam.getAll();

		
		List<Campaign> user = l.stream()
			.sorted(Comparator.comparing(Campaign::getCompleteddate).reversed())
			.collect(Collectors.toList());
	
	return user;
}
}