package com.portfolioproject.model;

public class Asset
{
	private String Assetid;
	private String Assetname;
	private double AssetPrice;
	
	public Asset(String Assetid, String Assetname, double Price)
	{
		this.Assetid=Assetid;
		this.Assetname=Assetname;
		this.AssetPrice=Price;
	}

	public String getAssetid() {
		return Assetid;
	}

	public void setAssetid(String assetid) {
		Assetid = assetid;
	} 

	public String getAssetname() {
		return Assetname;
	}

	public void setAssetname(String assetname) {
		Assetname = assetname;
	}

	public double getAssetPrice() {
		return AssetPrice;
	}

	public void setAssetPrice(double assetPrice) {
		AssetPrice = assetPrice;
	}
	
}
	