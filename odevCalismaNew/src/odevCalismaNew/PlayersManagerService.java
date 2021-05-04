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

			System.out.println("Yeni Oyuncu Kay�t edildi. " + players.getFirstName());

		}

	}

	@Override
	public void update(Players players) {
		if (identityCheckManager.identityCheck() == true) {
			System.out.println("Se�ili Oyuncu G�ncellendi. " + players.getFirstName());
		}

	}

	@Override
	public void delete(Players players) {
		if (identityCheckManager.identityCheck() == true) {
			System.out.println("Se�ili Oyuncu Silindi. " + players.getFirstName());
		}

	}

}
