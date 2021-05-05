
public class Sale {
	private int Id;
	private String GameName;
	private double GamePrice;
	
	public Sale(int id, String gameName, double gamePrice) {
		super();
		Id = id;
		GameName = gameName;
		GamePrice = gamePrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public double getGamePrice() {
		return GamePrice;
	}

	public void setGamePrice(double gamePrice) {
		GamePrice = gamePrice;
	}

}
