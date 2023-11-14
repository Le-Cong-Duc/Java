package Model;

import java.util.Scanner;

public class ProductIn extends Product {
	private long extraIn;

	public ProductIn() {
		super();
		extraIn = 0;
	}

	public ProductIn(int id, String name, TypeProduct type, long price, long extraIn) {
		super(id, name, type, price);
		this.extraIn = extraIn;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập phí nội bộ: ");
		extraIn = sc.nextLong();
	}

	@Override
	public String toString() {
		return ("ProductIn [ id: " + super.getId() + ", name: " + super.getName() + ", type: " + super.getType()
				+ ", price: " + super.getPrice() + ", extraIn: " + extraIn + " ]");
	}

	public long getExtraIn() {
		return extraIn;
	}

	public void setExtraIn(long extraIn) {
		this.extraIn = extraIn;
	}

	@Override
	long priceForSale() {
		return super.getPrice() + extraIn;
	}
}
