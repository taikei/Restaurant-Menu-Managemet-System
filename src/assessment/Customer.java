package assessment;

public class Customer {

	private String name;
	private double discount;
	private String status;
	
	// stasus can be "Active", "VIP" and "New"
	// Active -> 10% discount
	// VIP -> 15% discount
	// New -> No discount
	
	public Customer() {
		
	}
	
	public Customer(String name, double discount, String status) {
		//super();
		this.name = name;
		this.discount = discount;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount() {
		// this.discount = calculation based on this.status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
