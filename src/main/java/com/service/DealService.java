package com.service;

import org.springframework.stereotype.Service;

import com.dto.SellerDealDto;
import com.modal.Item;
import com.modal.SellerDeal;

@Service
public class DealService {

	public void createDeal(SellerDealDto dealto) {
		SellerDeal deal = new SellerDeal();
		deal.setHours(dealto.getHours());

		Item item = new Item();
		//item.setMaxLimit(dealto.getItem().getMaxLimit());
		item.setName(dealto.getItem().getName());
		item.setPrice(dealto.getItem().getPrice());

		deal.setItem(item);
		//dao.save(deal);

	}

	public void endDeal(Integer id) {
		//find by id
		//Do the soft delete using a boolean field.
		//dao.delete();
	}

	public void increaseDealDetails(Integer dealId, Integer numberofItem, long endTime) {
		
		// finding the deatil from backend then do the updation
		SellerDeal dealDetails = new SellerDeal();//dao.findById();
		dealDetails.setHours(dealDetails.getHours()+endTime);
		//dealDetails.getItem().setMaxLimit(dealDetails.getItem().getMaxLimit()+numberofItem);
		
		//dao.save();
	}

}
