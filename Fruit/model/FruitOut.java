package model;

import java.util.Scanner;

public class FruitOut extends Fruit {
	private String orgin;
	private double extraOut;

	public FruitOut() {
		super();
		orgin = "";
		extraOut = 0;
	}

	public FruitOut(int ID, String name, double price, String orgin, double extraOut) {
		super(ID, name, price);
		this.orgin = orgin;
		this.extraOut = extraOut;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập xuất xứ: ");
		orgin = sc.nextLine();
		System.out.println("Nhập phí nhập khẩu: ");
		extraOut = sc.nextDouble();
	}
// Tạo phương thức giá bán ra của fruitOut
	public double priceForSale() {
		return super.priceForSale() + extraOut + (0.1 * extraOut);
	}

	@Override
	public String toString() {
		return "FruitOut [ID=" + super.getID() + ", name= " + super.getName() + ", price= " + super.getPrice()
				+ ", orgin= " + orgin + ", extraOut= " + extraOut + "]";
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public double getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(double extraOut) {
		this.extraOut = extraOut;
	}

}
