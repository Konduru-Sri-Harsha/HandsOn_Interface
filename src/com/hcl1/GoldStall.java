package com.hcl1;

public class GoldStall implements Stall {

	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;

	public GoldStall() {

	}

	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		super();
		this.stallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.tvSet = tvSet;
	}

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getTvSet() {
		return tvSet;
	}

	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}

	@Override
	public void display() {
		System.out.println("Stall Name:" + stallName);
		System.out.println("cost:" + cost + ".rs");
		System.out.println("Owner Name:" + ownerName);
		System.out.println("Number of TV sets:" + tvSet);
	}

}
