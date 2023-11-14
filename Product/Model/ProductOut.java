package Model;

import java.util.Scanner;

public class ProductOut extends Product {
	private long extraOut;

	public ProductOut() {
		super();
		extraOut = 0;
	}

	public ProductOut(int id, String name, TypeProduct type, long price, long extraOut) {
		super(id, name, type, price);
		this.extraOut = extraOut;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("Nhập phí nhập khẩu: ");
		extraOut = sc.nextLong();
	}

	@Override
	public String toString() {
		return ("ProductOut [ id: " + super.getId() + ", name: " + super.getName() + ", type: " + super.getType()
				+ ", price: " + super.getPrice() + ", extraOut: " + extraOut + " ]");
	}

	@Override
	long priceForSale() {
		return super.getPrice() + extraOut + (extraOut / 100) * 10;
	}

	public long getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(long extraOut) {
		this.extraOut = extraOut;
	}

}
