package com.modal;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

public class SellerDeal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dealId;
	
	@ManyToMany
	@JoinColumn(name="itemId")
	private Item item;
	
	private Integer maxAvailableQuantity;
	
	private Date startTime;
	
	private Date endTime;
	
	private boolean isDealEnded;

	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getMaxAvailableQuantity() {
		return maxAvailableQuantity;
	}

	public void setMaxAvailableQuantity(Integer maxAvailableQuantity) {
		this.maxAvailableQuantity = maxAvailableQuantity;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public boolean isDealEnded() {
		return isDealEnded;
	}

	public void setDealEnded(boolean isDealEnded) {
		this.isDealEnded = isDealEnded;
	}

	public Integer getDealId() {
		return dealId;
	}

	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}

	

}
