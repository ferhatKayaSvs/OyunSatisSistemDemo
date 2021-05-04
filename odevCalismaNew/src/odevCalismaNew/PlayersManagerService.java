package odevCalismaNew;

public class PlayersManagerService implements PlayerService {

	IdentityCheckManager identityCheckManager;

	public PlayersManagerService(IdentityCheckManager identityCheckManager) {
		super();
		this.identityCheckManager = identityCheckManager;
	}

	@Override
	public void add(Players players) {
		if (identityCheckManager.identityCheck() == true) {

			System.out.println("Yeni Oyuncu Kayýt edildi. " + players.getFirstName());

		}

	}

	@Override
	public void update(Players players) {
		if (identityCheckManager.identityCheck() == true) {
			System.out.println("Seçili Oyuncu Güncellendi. " + players.getFirstName());
		}

	}

	@Override
	public void delete(Players players) {
		if (identityCheckManager.identityCheck() == true) {
			System.out.println("Seçili Oyuncu Silindi. " + players.getFirstName());
		}

	}

}
