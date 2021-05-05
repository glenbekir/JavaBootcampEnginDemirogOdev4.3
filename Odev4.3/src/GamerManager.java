
public class GamerManager implements GamerService{

	@Override
	public void register(User user) {
		
		System.out.println();
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("Gamer updated" + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println("Gamer deleted" + user.getFirstName());
		
	}

}
