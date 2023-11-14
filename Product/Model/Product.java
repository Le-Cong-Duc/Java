package Model;

import java.util.Scanner;

public abstract class Product {
	private int id;
	private String name;
	private TypeProduct type;
	private long price;

	public Product() {
		id = 0;
		name = "";
		type = new TypeProduct();
		price = 0;
	}

	public Product(int id, String name, TypeProduct type, long price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id sản phẩm: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập tên sản phẩm: ");
		name = sc.nextLine();
		System.out.println("Nhập giá sản phẩm: ");
		price = sc.nextLong();
	}

	abstract public String toString();

	abstract long priceForSale();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeProduct getType() {
		return type;
	}

	public void setType(TypeProduct type) {
		this.type = type;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

}
