package com.retail.ecom.content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.retail.ecom.content.bootstrap.ContentApplication;
import com.retail.ecom.content.pojo.Offer;
import com.retail.ecom.content.pojo.Seller;

@RestController
@RequestMapping("/content")
public class ContentController {
	
	@Autowired
	Environment environment;
	
	@RequestMapping("/offer")
    public  Offer  offer(@RequestParam(value="id") String id) {
		Offer offer =new Offer();
		offer.setId(id);
		offer.setSellerId("1"+id);
		offer.setImageUrl("https://c.shld.net/rpx/i/s/i/spin/image/spin_prod_890496812?wid=156&hei=156&qlt=90,0&resMode=sharp&op_usm=0.9,0.5,0,0");
		offer.setName("Kenmore 414301 Food Processor - Black");
		
		String port = environment.getProperty("local.server.port");
		offer.setHostName(ContentApplication.hostName+":"+port);
		return offer;
    }
	
	@RequestMapping("/seller")
    public  Seller  seller(@RequestParam(value="id") String id) {
		Seller seller=new Seller();
		seller.setId(id);
		seller.setName("Seller"+id);
		seller.setZipcode("60107");
		
		String port = environment.getProperty("local.server.port");
		seller.setHostName(ContentApplication.hostName+":"+port);
		return seller;
    }

}
