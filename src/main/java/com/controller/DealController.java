package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ItemDto;
import com.dto.SellerDealDto;
import com.service.DealService;

@RestController
public class DealController {

	@Autowired
	private DealService service;

	@PostMapping("/createDeal")
	private void createDeal(@RequestBody SellerDealDto dealDto) {
		//put a dto validator here for values 
		service.createDeal(dealDto);
	}
	
	@DeleteMapping("/endDeal")
	private void endDeal(Integer id) {
		service.endDeal(id);
	}
	
	@PutMapping("/updateDeal")
	private void updateDeal(Integer dealId, Integer numberofItem, long endTime) {
		// put a validation here also that number of item can not be negative 
		service.increaseDealDetails(dealId,numberofItem,endTime);
	}
	
	@PostMapping("/claimDeal")
	private ItemDto claimDeal(ItemDto itemdto) {
		//duration over
		return itemdto;
		
	}
	
	

}
