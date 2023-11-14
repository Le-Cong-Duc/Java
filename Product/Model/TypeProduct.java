package Model;

import java.util.Scanner;

public class TypeProduct {
	private int id;
	private String name;
	private String description;

	public TypeProduct() {
		id = 0;
		name = "";
		description = "";
	}

	public TypeProduct(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id mã loại sản phẩm: ");
		id = sc.nextInt();
		System.out.println("Nhập tên loại sản phẩm: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Nhập mô tả loại sản phẩm: ");
		description = sc.nextLine();
	}

	@Override
	public String toString() {
		return "TypeProduct [id= " + id + ", name= " + name + ", description= " + description + "]";
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
