package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	TypeProductManager typeManager;
	ProductManager manager;

	public Menu() {
		typeManager = new TypeProductManager();
		manager = new ProductManager();
	}

	public int choice1() {
		System.out.println("+===MENU========================+");
		System.out.println("|| 1. Quản lí loại sản phẩm    ||");
		System.out.println("|| 2. Quản lí sản phẩm         ||");
		System.out.println("|| 3. Thoát chương trình       ||");
		System.out.println("+===============================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

// 1. quản lí loại sản phẩm
	public int choice2() {
		System.out.println("+==============================================+");
		System.out.println("|| 1. Thông tin loại sản phẩm                  ||");
		System.out.println("|| 2. Tạo loại sản phẩm                        ||");
		System.out.println("|| 3. Tìm kiếm loại sản phẩm                   ||");
		System.out.println("|| 4. Sắp xếp loại sản phẩm                    ||");
		System.out.println("|| 5. Danh sách sản phẩm dựa vào loại sản phẩm ||");
		System.out.println("|| 6. Xóa loại sản phẩm                        ||");
		System.out.println("|| 7. Thoát quản lí loại sản phẩm              ||");
		System.out.println("+===============================================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

// 1.3 Tìm kiếm sản phẩm
	public int choice2_1() {
		System.out.println("+===============================+");
		System.out.println("|| 1. Tìm kiếm theo id         ||");
		System.out.println("|| 2. tìm kiếm theo tên         ||");
		System.out.println("+===============================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

// 1.4 Sắp xếp sản phẩm
	public int choice2_2() {
		System.out.println("+==============================================+");
		System.out.println("|| 1. Sắp xếp tăng dần theo id                ||");
		System.out.println("|| 2. Sắp xếp giảm dần theo id                ||");
		System.out.println("|| 3. Sắp xếp giảm dần theo số lượng sản phẩm ||");
		System.out.println("+==============================================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

// 2. quản lí sản phẩm
	public int choice3() {
		System.out.println("+======================================+");
		System.out.println("|| 1. Thông tin sản phẩm              ||");
		System.out.println("|| 2. Tạo sản phẩm                    ||");
		System.out.println("|| 3. Tìm kiếm sản phẩm               ||");
		System.out.println("|| 4. Sắp xếp sản phẩm                ||");
		System.out.println("|| 5. Xóa sản phẩm                    ||");
		System.out.println("|| 6. Thoát quản lí sản phẩm          ||");
		System.out.println("+======================================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

// 2.1 Xem thông tin sản phẩm 
	public int choice3_1() {
		System.out.println("+==================================================+");
		System.out.println("|| 1. Danh sách tất cả sản phẩm                   ||");
		System.out.println("|| 2. Danh sách sản phậm nội địa                  ||");
		System.out.println("|| 3. Danh sách sản phẩm nhập khẩu                ||");
		System.out.println("|| 4. Những sản phẩm có giá trị bán ra hơn 100000 ||");
		System.out.println("+==================================================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

//2.2 Tao sản phẩm
	public int choice3_2() {
		System.out.println("+===================================+");
		System.out.println("|| 1. Tạo sản phẩm nội địa         ||");
		System.out.println("|| 2. Tạo sản phẩm nhập khẩu       ||");
		System.out.println("+===================================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

// 2.3 Tìm kiếm sản phẩm
	public int choice3_3() {
		System.out.println("+=============================+");
		System.out.println("|| 1. Tìm kiếm theo id       ||");
		System.out.println("|| 2. Tìm kiếm theo tên      ||");
		System.out.println("+=============================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

// 2.4 Sắp xếp san phẩm
	public int choice3_4() {
		System.out.println("+=========================================+");
		System.out.println("|| 1. Sắp xếp tăng dần theo id           ||");
		System.out.println("|| 2. Sắp xếp giảm dần theo id           ||");
		System.out.println("|| 3. Sắp xếp tăng dần theo giá bán ra   ||");
		System.out.println("|| 4. Sắp xếp giảm dần theo giá bán ra   ||");
		System.out.println("+=========================================+");

		System.out.println("Nhập sự lựa chọn:  ");
		return sc.nextInt();
	}

	public void run() {
		int o1, o2, o3, o4, o5, o6, o7, o8, o9;
		TypeProduct t;
		do {
			o1 = choice1();
			switch (o1) {
			// quản lí loại sản phẩm
			case 1:
				do {
					o2 = choice2();
					switch (o2) {
					case 1:
						System.out.println("Thông tin loại sản phẩm: ");
						typeManager.displayall();
						
						break;
					case 2:
						t = new TypeProduct();
						t.input();
						typeManager.add(t);
						System.out.println(t);
						break;
					case 3:
						o3 = choice2_1();
						switch (o3) {
						case 1:
							System.out.println("Nhập id loại sản phẩm cần tìm kiếm: ");
							int id = sc.nextInt();
							TypeProduct typeProduct = typeManager.search(id);
							System.out.println(typeProduct);
							break;
						case 2:
							System.out.println("Nhập tên loại sản phẩm cần tìm kiếm: ");
							sc.nextLine();
							String name = sc.nextLine();
							ArrayList<TypeProduct> ProductByName = typeManager.search(name);
							System.out.println(ProductByName);
							break;
						}
						break;
					case 4:
						o4 = choice2_2();
						switch (o4) {
						case 1:
							typeManager.sortById();
							System.out.println("Danh sách đã được sắp xếp");
							break;
						case 2:
							boolean reverse = true;
							typeManager.sortById(reverse);
							System.out.println("Danh sách đã được sắp xếp");
							break;
						case 3:
							// Sắp xếp giảm dần theo số lượng sản phẩm có loại sản phẩm đó.

						}
						break;
					case 5:
						System.out.println("Chọn loại sản phẩm: ");
						typeManager.displayall();
						System.out.println("Chọn id loại sản phẩm: ");
						int idd = sc.nextInt();
						TypeProduct typpe = typeManager.search(idd);
						manager.productOfType(typpe); 
						break;

					case 6:
						System.out.println("Chọn loại sản phẩm cần xóa: ");
						typeManager.displayall();
						System.out.println("----------------------");
						System.out.println("Nhập id loại sản phẩm cần xóa: ");
						int id = sc.nextInt();
						TypeProduct type = typeManager.search(id);
						if (type == null) {
							System.out.println("Loại sản phẩm không tồn tại");
						} else {
							manager.typeOfProduct(type);
							typeManager.getTypeProducts().remove(type);
							System.out.println("Xóa loại sản phẩm thành công!");
						}
						break;
					}
				} while (o2 != 7);
				System.out.println("Chương trình quản lí loại sản phẩm kết thúc!");
				break;
			// quản lí sản phẩm
			case 2:
				Product p;
				do {
					o5 = choice3();
					switch (o5) {
					case 1:
						o6 = choice3_1();
						switch (o6) {
						case 1:
							System.out.println("Danh sách tất cả sản phẩm: ");
							manager.displayall();
							break;

						case 2:
							System.out.println("Danh sách sản phẩm trong nước");
							manager.displayProductIn();
							break;
						case 3:
							System.out.println("Danh sách sản phẩm nhập khẩu: ");
							manager.displayProductOut();
							break;
						case 4:
							System.out.println("Danh sách sản phẩm có giá bán ra > 100000 : ");
							manager.displayPForSale();
							break;
						}
						break;
					case 2:
						o7 = choice3_2();
						switch (o7) {
						case 1:
							System.out.println("Chọn loại sản phẩm của sản phẩm : ");
							typeManager.displayall();
							System.out.println("----------------------");
							System.out.println("Chọn id loại sản phẩm : ");
							int id = sc.nextInt();
							System.out.println("----------------------");
							TypeProduct type = typeManager.search(id);
							p = new ProductIn();
							System.out.println("Thêm sản phẩm : ");
							p.input();
							p.setType(type);
							manager.add(p);
							System.out.println(p);
							break;
						case 2:
							System.out.println("Chọn loại sản phẩm của sản phẩm : ");
							typeManager.displayall();
							System.out.println("----------------------");
							System.out.println("Chọn id loại sản phẩm : ");
							int idd = sc.nextInt();
							System.out.println("----------------------");
							TypeProduct typpe = typeManager.search(idd);
							p = new ProductOut();
							System.out.println("Thêm sản phẩm : ");
							p.input();
							p.setType(typpe);
							manager.add(p);
							System.out.println(p);

						}
						break;
					case 3:
						o8 = choice3_3();
						switch (o8) {
						case 1:
							System.out.println("Nhập id sản phẩm cần tìm: ");
							int id = sc.nextInt();
							Product product = manager.search(id);
							System.out.println(product);
							break;
						case 2:
							System.out.println("Nhập tên sản phẩm cần tìm: ");
							sc.nextLine();
							String name = sc.nextLine();
							ArrayList<Product> productByName = manager.search(name);
							System.out.println(productByName);
							break;
						}
						break;
					case 4:
						o9 = choice3_4();
						switch (o9) {
						case 1:
							manager.sortById();
							System.out.println("Danh sách đã được sắp xếp");
							break;
						case 2:
							boolean reserve = true;
							manager.sortById(reserve);
							System.out.println("Danh sách đã được sắp xếp");
							break;
						case 3:
							manager.sortByPrice();
							System.out.println("Danh sách đã được sắp xếp");
							break;
						case 4:
							boolean reserve1 = true;
							manager.sortByPrice(reserve1);
							System.out.println("Danh sách đã được sắp xếp");
							break;
						}
						break;
					case 5:

						System.out.println("Nhập id sản phẩm cần xóa: ");
						int id = sc.nextInt();
						Product p1 = manager.search(id);
						if (p1 == null) {
							System.out.println("Sản phẩm không tồn tại");
						} else {
							manager.remove(id);
							System.out.println("Sản phẩm đã được xóa");
						}
						break;
					}
				} while (o5 != 6);
				System.out.println("Chương trình quản lí sản phẩm kết thúc!");
				break;
			}

		} while (o1 != 3);
		System.out.println("Chương trình kết thúc");
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.run();
	}
}
