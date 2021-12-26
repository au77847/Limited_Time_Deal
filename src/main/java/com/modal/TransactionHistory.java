package com.modal;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TransactionHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer claimedBy;

	private Integer dealId;

	private Integer itemId;

	private float amount;

	private float discount;

	private Date claimedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClaimedBy() {
		return claimedBy;
	}

	public void setClaimedBy(Integer claimedBy) {
		this.claimedBy = claimedBy;
	}

	public Integer getDealId() {
		return dealId;
	}

	public void setDealId(Integer dealId) {
		this.dealId = dealId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public Date getClaimedDate() {
		return claimedDate;
	}

	public void setClaimedDate(Date claimedDate) {
		this.claimedDate = claimedDate;
	}
}
