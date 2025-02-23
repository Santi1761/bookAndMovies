package ui;

import java.util.Scanner;

import model.ProductType;
import model.Shop;

/**
 * 
 * @author Santiago Arboleda Velasco
 *
 */

public class MainShop {
	private Shop shop;
	private static Scanner sc = new Scanner(System.in);
	
	public MainShop() {
		shop= new Shop("AP1's book store");
	}

	public static void main(String[] args) {
		
		MainShop mainObject= new MainShop();
		int option = 0;
		do {
			option=mainObject.showMenuAndReadInput();
			mainObject.dispatchOption(option);
		}while(option!=0);
		
	}

	public void dispatchOption(int option) {
		switch(option) {
		case -1: 
			createScenario();
			break;
		case 0: 
			System.out.println("\n*** Leaving the app, bye bye ***");
			break;
		case 1:
			addProductCatalog();
			break;
		case 2:
			System.out.println(shop.showCatalog());
			break;
		case 3:
			processProduct();
			break;
				
		}
		
		
	}

	public void rentProduct(String code) {
		System.out.println("\n*** Welcome to the rent's screen***\n");
		
		System.out.println("How many days you wanna rent the product?");
		int days= sc.nextInt();
		sc.nextLine();
		
		String answer =shop.rentProduct(code, days);
		System.out.println(answer);
		
		
		
	}
	
	public void saleProduct(String code) {
		System.out.println("\n*** Welcome to the sale's screen***\n");
		
		System.out.println("Digit the amount of units you wanna buy");
		int units2Buy= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digit the percenteage of discount(if applies)\n"
				+ "the discount is a number between 0 and 1");
		double discount= sc.nextDouble();
		sc.nextLine();
		
		String answer = shop.saleProduct(code, units2Buy, discount);
		
		System.out.println(answer);
		
		
	}

	public void processProduct() {
		System.out.println("\n*** Digit the code of the product you wanna process ***\n");
		String code = sc.nextLine();
		
		int operation= shop.getOperation(code);
		
		switch(operation) {
		case Shop.SALE:
			System.out.println("You picked a saleable product!!");
			saleProduct(code);
			break;
		case Shop.RENT:
			System.out.println("You picked a rentable product!!");
			rentProduct(code);
			break;
			default :
				System.out.println("Sorry, there's no product with that code");
				
		}
		

	}

	public  void createScenario() {
		TestScenario scenario = new TestScenario();
		scenario.createScenario1(shop);
		
	}

	public int showMenuAndReadInput() {
		System.out.println("*** Welcome to the "+ shop.getName() +  " ***\n");
		System.out.println("Please, select one option:\n"+
							"(-1) For running the scenario \n"+
							"(1) For adding a product to the catalog \n"+
							"(2) For displaying the catalog's contents \n"+
							"(3) For rent/sale a product  \n"+
							"(0) For leaving the app");
		
		int number= sc.nextInt();
		sc.nextLine();
		
		return number;
		
		
	}
	
	public void addProductCatalog() {
		System.out.println("Este producto es para vender o rentar?");
		System.out.println("1. Vender");
		System.out.println("2. Rentar");
		int option = sc.nextInt();
		sc.nextLine();
		if (option==1){

			System.out.println("Ingresa el codigo ");
			String code = sc.nextLine();
			System.out.println("Nombre: ");
			String name = sc.nextLine();
			System.out.println("Unidades: ");
			int units = sc.nextInt();
			System.out.println("Precio: ");
			double price = sc.nextDouble();
			
			System.out.println("Selecciona el tipo de producto: ");
			System.out.println("1. Libro");
			System.out.println("2. Magazine");
			System.out.println("3. DVD");
			System.out.println("4. Pelicula");
			int type = sc.nextInt();
			if (type==1){
				System.out.println(shop.addProduct(code,name,units,price,ProductType.BOOK));
			}else if(type==2){
				System.out.println(shop.addProduct(code,name,units,price,ProductType.MAGAZINE));

			}else if (type==3){
				System.out.println(shop.addProduct(code,name,units,price,ProductType.DVD_MOVIE));

			}else if (type==4){
				System.out.println(shop.addProduct(code,name,units,price,ProductType.DOWNLOAD_MOVIE));

			}else System.out.println("Elgiste un tipo que no es");


		}else if (option==2){
			System.out.println("Ingresa el codigo ");
			String code= sc.nextLine();
			System.out.println("Nombre: ");
			String name = sc.nextLine();
			System.out.println("Precio: ");
			double price = sc.nextDouble();
			System.out.println("Selecciona el tipo de producto: ");
			System.out.println("1. Libro");
			System.out.println("2. Magazine");
			System.out.println("3. DVD");
			System.out.println("4. Pelicula");
			int type = sc.nextInt();
			if (type==1){
				System.out.println(shop.addProduct(code,name,price,ProductType.BOOK));
			}else if(type==2){
				System.out.println(shop.addProduct(code,name,price,ProductType.MAGAZINE));

			}else if (type==3){
				System.out.println(shop.addProduct(code,name,price,ProductType.DVD_MOVIE));

			}else if (type==4){
				System.out.println(shop.addProduct(code,name,price,ProductType.DOWNLOAD_MOVIE));

			}else System.out.println("Incorrecto");

		} else System.out.println("Selecciona una buena porfi :)");
	}
	
	

}
