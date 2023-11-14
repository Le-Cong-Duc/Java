package model;

import java.util.Scanner;

import IFruit.IFruit;

public class Fruit implements IFruit {
	private int ID;
	private String name;
	private double price;
	public Fruit() {
		ID = 0;
		name = "";
		price = 0;
	}
	public Fruit(int ID, String name, double price) {
		this.ID = ID;
		this.name = name;
		this.price =price;
	}
	@Override
	public double priceForSale() {
		return price;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập ID: ");
		ID = sc.nextInt();
		System.out.println("Nhập tên trái cây: ");sc.nextLine();
		name = sc.nextLine();
		System.out.println("Nhập giá : ");
		price = sc.nextDouble();
	}
	@Override
	public String toString() {
		return "Fruit [ID=" + ID + ", name=" + name + ", price=" + price + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
