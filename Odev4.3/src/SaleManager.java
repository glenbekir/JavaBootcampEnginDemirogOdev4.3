
public class SaleManager implements SaleService{


	@Override
	public void GameSale(Sale sale, Campaign campaign, User user) {
		
		double NewPrice =  sale.getGamePrice()	- (sale.getGamePrice()*(campaign.getDiscount()));
		System.out.println(sale.getGameName()+" adli oyun "+campaign.getCampaignName()+"  ile "+
				NewPrice+ " TL ye satildi. Satin alan oyuncu : "+ user.getFirstName()+" "+user.getLastName());
		
	}

}
