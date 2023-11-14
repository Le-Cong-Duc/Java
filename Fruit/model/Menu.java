package model;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	managerFruit manager;

	public Menu() {
		manager = new managerFruit();
	}

	public int choice() {
		System.out.println("+-=====================|Menu|=======================-+");
		System.out.println("||1. Thêm trái cây                                  ||");
		System.out.println("||2. Danh sách trái cây                             ||");
		System.out.println("||3. Danh sách trái cây có priceForSale lớn hơn 20  ||");
		System.out.println("||4. Tổng số trái cây có trong danh sách            ||");
		System.out.println("||5. Thoát chương trình                             ||");
		System.out.println("+-==================================================-+");

		System.out.println("Nhập sự lựa chọn: ");
		return sc.nextInt();
	}

	public int choice1() {
		System.out.println("+-=====================|Menu|=======================-+");
		System.out.println("||1. Thêm trái cây trong nước                        ||");
		System.out.println("||2. Thêm trái cây nhập khẩu                         ||");
		System.out.println("+-==================================================-+");

		System.out.println("Nhập sự lựa chọn: ");
		return sc.nextInt();
	}

	public void run() {
		int o1, o2;
		Fruit f;
		// Fruit f dùng để chỉ chung tất cả các fruit có trong danh sách
		do {
			o1 = choice();
			switch (o1) {

			case 1:

				o2 = choice1();
				switch (o2) {
				case 1:
			// gán f = FruitIn 
					f = new FruitIn();
		    // gán lệnh input và nó được hiểu là input của FruitIn
					f.input();
			// sau khi nhập input xong dùng lệnh add để thêm trái cây mới nhập vào danh sách
					manager.addFruit(f);
			// in trái cây đó ra màn hình
					System.out.println(f);
					System.out.println("------------------------------");
					break;
				case 2:
		   // Tương tự case 1 
					f = new FruitOut();
					f.input();
					manager.addFruit(f);
					System.out.println(f);
					System.out.println("------------------------------");
					break;
				}
				break;
		// Mấy case sau chỉ cần gán phương thức của managerFruit là xong 
			case 2:
				System.out.println("Danh sách trái cây: ");
				manager.showFruit();
				System.out.println("------------------------------");
				break;
			case 3:
				System.out.println("Danh sách priceForSale >20:  ");
				manager.showPriceForSale();
				System.out.println("------------------------------");
				break;
			case 4:
				System.out.println("Số lượng trái cây: ");
				manager.quantilyFruit();
				System.out.println("------------------------------");
				break;
			}
	  // làm nhưng lệnh trên cho đến khi chọn 5 thì chương trình kết thúc
		} while (o1 != 5);
		System.out.println("Chương trình kết thúc!");

	}

}
