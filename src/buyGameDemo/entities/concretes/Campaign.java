package buyGameDemo.entities.concretes;

import buyGameDemo.entities.abstracts.Entity;

public class Campaign implements Entity {
	private int campaignId;
	private String campaingName;
	private double compaingAmount;
	public Campaign(int campaignId, String campaingName, double compaingAmount) {
		super();
		this.campaignId = campaignId;
		this.campaingName = campaingName;
		this.compaingAmount = compaingAmount;
	}
	public int getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	public double getCompaingAmount() {
		return compaingAmount;
	}
	public void setCompaingAmount(double compaingAmount) {
		this.compaingAmount = compaingAmount;
	}
}
