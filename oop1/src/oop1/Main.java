package oop1;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product();

		// set value
		product1.setName("Delongi Kahve Makinesi 1");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageURL("bilmemne1.jpeg");
		
		// get value
		// System.out.println(product1.name);

		Product product2 = new Product();

		// set value
		product2.setName("Delongi Kahve Makinesi 2");
		product2.setUnitPrice(6500);
		product2.setDiscount(8);
		product2.setUnitsInStock(1);
		product2.setImageURL("bilmemne2.jpeg");

		Product product3 = new Product();

		// set value
		product3.setName("Delongi Kahve Makinesi 3");
		product3.setUnitPrice(5500);
		product3.setDiscount(9);
		product3.setUnitsInStock(1);
		product3.setImageURL("bilmemne3.jpeg");
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}

		// ==> Inheritances <==
		
		IndividualCustomer hakanCeran = new IndividualCustomer();
		
		hakanCeran.setId(1);
		hakanCeran.setPhone("5340224669");
		hakanCeran.setCustomerNumber("12345");
		hakanCeran.setFirstName("Hakan");
		hakanCeran.setLastName("Ceran");
		
		CorporateCustomer merveCeran = new CorporateCustomer();
		merveCeran.setId(2);
		merveCeran.setPhone("553553553");
		merveCeran.setCustomerNumber("543211");
		merveCeran.setCompanyName("Kodlama.io");
		merveCeran.setTaxNumber("111222333");
		
		Customer[] customers = {hakanCeran, merveCeran};
		
	}

}
