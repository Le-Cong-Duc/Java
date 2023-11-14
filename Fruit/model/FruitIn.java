package model;

import java.util.Scanner;

import IFruit.IFruit;

public class FruitIn extends Fruit implements IFruit {
	private double extraIn;

	public FruitIn() {
		super();
		extraIn = 0;
	}

	public FruitIn(int ID, String name, double price, double extraIn) {
		super(ID, name, price);
		this.extraIn = extraIn;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập phí quản lí nội bộ: ");
		extraIn = sc.nextDouble();
	}
// Tạo phương thức giá bán ra của FruitIn
	public double priceForSale() {
		return super.priceForSale() + extraIn;
	}

	@Override
	public String toString() {
		return "FruitIn [ID=" + super.getID() + ", name= " + super.getName() + ", price= " + super.getPrice()
				+ ", extraIn= " + extraIn + "]";
	}

	public double getExtraIn() {
		return extraIn;
	}

	public void setExtraIn(double extraIn) {
		this.extraIn = extraIn;
	}

}
