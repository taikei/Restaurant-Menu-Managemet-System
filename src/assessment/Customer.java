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
		this.name = "Unknown";
		this.discount = 0.0;
		this.status = "Unknown";
	}
	
	public Customer(String name, String status) {
		this.name = name;
		this.status = status;
		
		if(this.status == "Active") {
			// 10% discount
			this.discount = 0.1;
		}else if(this.status == "VIP") {
			// 15% discount
			this.discount = 0.15;
		}else {
			// No discount
			this.discount = 0.0;
		}
	}
	
	public String toString() {
		String print;
		print = "Name: " + getName() + 
				"\nStatus: " + getStatus();
		
		return print;
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
	// You dont wanna anyone to change discount as they like
	private void setDiscount(String status) {
		if(status == "Active") {
			this.discount = 0.1;
		}else if(status == "VIP") {
			this.discount = 0.15;
		}else {
			this.discount = 0.0;
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if(status != "Active" || status != "VIP" || status != "New") {
			return;
		} else {
			this.status = status;
			setDiscount(status);
		}
		
	}
	
	
	
	
}
