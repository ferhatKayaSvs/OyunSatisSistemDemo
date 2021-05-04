package odevCalismaNew;

public class CampaignManagerService implements CampaignService{

	@Override
	public void add(Campaign campaign, Players players) {
		System.out.println("Yeni Kampanyadan fayadalandı."+ players.getFirstName());
		
	}

	@Override
	public void update(Campaign campaign, Players players) {
		System.out.println("Var olan Kampanyada Güncelleme yapıldı."+ players.getFirstName());
		
	}

	@Override
	public void delete(Campaign campaign, Players players) {
		System.out.println("Kapmanya Silindi." + players.getFirstName());
		
	}
	

}
