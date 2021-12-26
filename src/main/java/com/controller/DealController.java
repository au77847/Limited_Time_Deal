package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ClaimDto;
import com.dto.SellerDealDto;
import com.service.DealService;

@RestController
public class DealController {

	@Autowired
	private DealService service;

	@PostMapping("/createDeal")
	private void createDeal(@RequestBody SellerDealDto dealDto) {
		//put a dto validator here for values like quantity,price should be positive.Hours must be an integer value
		service.createDeal(dealDto);
	}
	
	@DeleteMapping("/endDeal")
	private void endDeal(Integer dealId) {
		service.endDeal(dealId);
	}
	
	@PutMapping("/updateDeal")
	private void updateDeal(Integer dealId, Integer numberofItem, int increaseHours) {
		// put a validation here also that number of item can not be negative 
		service.updateExixtingDealDetails(dealId,numberofItem,increaseHours);
	}
	
	@PostMapping("/claimDeal")
	private void claimDeal(ClaimDto claimDto) {
		//first need to validate with end time for a deal.	
	    // Also validate that claimed item is available or not.
		// Validate with user Id and Item id that item is already bought by the user or not
	  
		//claim a deal and update the quantity on that deal id and update the history
		
	}
	
	

}
