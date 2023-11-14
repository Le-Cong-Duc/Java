package model;

import java.util.ArrayList;

public class managerFruit {
	// tạo danh sách Fruit bao gồm FruitIn và FruitOut
	private ArrayList<Fruit> fruits;

	public managerFruit() {
		fruits = new ArrayList<Fruit>();
	}

	public managerFruit(ArrayList<Fruit> fruits) {
		this.fruits = fruits;
	}

// Phương thức thêm trái cây 
	public void addFruit(Fruit fruit) {
		/*
		 * dùng hàm for gán f = fruits ( fruits là danh sách trái cây vừa khởi tạo ) để
		 * rà soát tất cả fruit có trong danh sách
		 */
		for (Fruit f : fruits)
			/*
			 * so sánh id của fruit trong danh sách xem có trùng với id của fruit mới nhập
			 * vào hay không , Nếu trùng thì in ra màn hình " ID đã tồn tại....."
			 */

			if (f.getID() == fruit.getID()) {
				System.out.println("ID đã tồn tại. Vui lòng nhập lại");
				return;
				/*
				 * *******************************************************
				 *  fruits là danh sách các trái
				 *  f là dùng để biểu diễn từng phần tử có trong fruits 
				 *  fruit là trái cây mình muốn nhập vào 
				 * 
				 ********************************************************/
			}
		// Ngược lại dùng add để thêm fruit mới nhập vào danh sách fruits
		fruits.add(fruit);
	}

	public void showFruit() {
		/*
		 * duyệt qua từng phần tử có trong danh sách fruits sau đó sử dụng get(i) để
		 * biểu diễn cho các phần tử đó sau đó dùng sysout để ỉn ra
		 */
		for (int i = 0; i < fruits.size(); i++)
			System.out.println(fruits.get(i));
	}

	public void showPriceForSale() {
	// duyệt từng phần tử có trong danh sách fruits 
		for (int i = 0; i < fruits.size(); i++) {
			Fruit fruit = fruits.get(i);
	/* 2 câu lệnh trên tương tự như câu lệnh 
	 *	for ( Fruit fruit : fruits)  */
			// so sánh nếu giá bán ra của các fruit có trong danh sách > 20 thì in ra
			if (fruit.priceForSale() > 20) {
				System.out.println(fruit);
			}
		}
	}

	public void quantilyFruit() {
// đếm xem có bao nhiêu phầm tử có trong danh sách fruits thì chỉ cần in ra giới hạn size()
		System.out.println(fruits.size());
	}

	@Override
	public String toString() {
		return "managerFruit [fruits=" + fruits + "]";
	}

	public ArrayList<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(ArrayList<Fruit> fruits) {
		this.fruits = fruits;
	}

}
