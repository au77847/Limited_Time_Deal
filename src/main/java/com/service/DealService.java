package com.service;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.dto.SellerDealDto;
import com.modal.Item;
import com.modal.SellerDeal;

@Service
public class DealService {

	public void createDeal(SellerDealDto dealDto) {
		SellerDeal deal = new SellerDeal();
		Date currentDate = new Date();
		deal.setStartTime(currentDate);
		deal.setEndTime(addHoursToJavaUtilDate(currentDate, dealDto.getHours()));
		deal.setMaxAvailableQuantity(dealDto.getMaxAvailableQuantity());

		Item item = new Item();
		item.setName(dealDto.getItem().getName());
		item.setPrice(dealDto.getItem().getPrice());
		deal.setItem(item);
		// dao.save(deal);

	}

	public void endDeal(Integer dealId) {
		// sellerDao.findById(dealId)
		// Do the soft delete using a boolean field isEnded(Set it to true).
		SellerDeal dealDetails = new SellerDeal(); //sellerDao.findById(dealId)
		dealDetails.setDealEnded(true);
		dealDetails.setDealId(dealId);
		//sellerDao.save(dealDetails)
		
	}

	public void updateExixtingDealDetails(Integer dealId, Integer numberofItem, int hours) {
		// findById from sellorDao then update the detail for that dealId.
		// we can put validation like item to be increase should be a positive integer.
		SellerDeal dealDetails = new SellerDeal();
		dealDetails.setEndTime(addHoursToJavaUtilDate(dealDetails.getEndTime(), hours));
		dealDetails.setMaxAvailableQuantity(dealDetails.getMaxAvailableQuantity() + numberofItem);
		dealDetails.setDealId(dealId);
		// dsellorDaoao.save(dealDetails);
	}

	public Date addHoursToJavaUtilDate(Date date, int hours) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR_OF_DAY, hours);
		return calendar.getTime();
	}
}
