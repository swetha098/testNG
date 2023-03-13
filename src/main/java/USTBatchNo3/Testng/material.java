package USTBatchNo3.Testng;

public class material {
	
	String city;
	int pricemate;
	int price;
	public material(String city, int pricemate, int price) {
		super();
		this.city = city;
		this.pricemate = pricemate;
		this.price = price;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricemate() {
		return pricemate;
	}
	public void setPricemate(int pricemate) {
		this.pricemate = pricemate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "material [city=" + city + ", pricemate=" + pricemate + ", price=" + price + "]";
	}

}
