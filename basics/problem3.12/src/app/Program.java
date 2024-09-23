package app;

import entities.Invoice;

public class Program {
	 public static void main(String[] args) {
		 Invoice invoice = new Invoice("555999", "headphone", 2, 15.50);
		 
		 System.out.printf("Invoice amount: %.2f%n", invoice.getInvoiceAmount());
		 
		 invoice.setQuantity(3);
		 invoice.setPricePerItem(10.00);
		 
		 System.out.printf("Update invoice amount: %.2f%n", invoice.getInvoiceAmount());
	 }

}
