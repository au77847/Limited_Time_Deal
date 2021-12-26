package com.exception;

public class CannotBuyException extends Exception {
	public CannotBuyException(String reason) {
		super(reason);
	}

	public static CannotBuyException becauseTimeisOver() {
		return new CannotBuyException("You are not able to by because time is over");
	}

	public static CannotBuyException maximumDealSold() {
		return new CannotBuyException("All the item are sold already");
	}
	
	public static CannotBuyException alreadyBought() {
		return new CannotBuyException("User have already bought the item");
	}
}
