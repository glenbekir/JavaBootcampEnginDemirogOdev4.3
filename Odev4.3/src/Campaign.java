
public class Campaign {
	
	private int Id;
	private String CampaignName;
	private double Discount;
	
	public Campaign(int id, String campaignName, double discount) {
		super();
		Id = id;
		CampaignName = campaignName;
		Discount = discount;
		
 }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}

	public double getDiscount() {
		return Discount;
	}

	public void setDiscount(double discount) {
		Discount = discount;
	}
}
	
