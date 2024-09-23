package entities;

public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double pricePerItem;
	
	// Constructors
	public Invoice() {}
	public Invoice(String number, String description, int quantity, double pricePerItem) {
		this.number = number;
		this.description = description;
		
		if (quantity < 0) {
			this.quantity = 0;
		} else {
			this.quantity = quantity;
		}
		
		if (pricePerItem < 0.0) {
			this.pricePerItem = 0.0;
		} else {
			this.pricePerItem = pricePerItem;
		}	
	}
	
	// Getters and Setters
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = (quantity < 0) ? 0 : quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem < 0.0) ? 0.0 : pricePerItem;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	// Methods
	public double getInvoiceAmount() {
		return quantity * pricePerItem;
	}

}
