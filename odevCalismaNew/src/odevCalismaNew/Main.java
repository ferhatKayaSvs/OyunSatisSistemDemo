package odevCalismaNew;

public class Main {

	public static void main(String[] args) {

        Players player = new Players(1, "ferhat", "KAYA", "1987", "838383838333");
        
        PlayersManagerService playerMAnaManagerService = new PlayersManagerService(new IdentityCheckManager());
        
        playerMAnaManagerService.add(player);
        
        Campaign campaign = new Campaign(5, "OLLLAAAYY KAMPANYA", 5555);
        
        CampaignManagerService campaignManagerService = new CampaignManagerService();
  
        campaignManagerService.add(campaign, player);
        
	}

}
