package com.BridgeLabz.ObjectOrientedPrograms;

/**
 * @author Sourabh Magdum
 * @Purpose - Pojo Class for Stock management
 * Date - 24/10/2019
 */
public class StockPortfolio {
	private String StockName;
	private int NumberOfShares;
	private int SharePrice;
	public String getStockName() {
		return StockName;
	}
	public void setStockName(String stockName) {
		StockName = stockName;
	}
	public int getNumberOfShares() {
		return NumberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		NumberOfShares = numberOfShares;
	}
	public int getSharePrice() {
		return SharePrice;
	}
	public void setSharePrice(int sharePrice) {
		SharePrice = sharePrice;
	}
	
	
}
