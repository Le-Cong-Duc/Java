package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import IManager.IManager;
import ISort.ISort;

public class TypeProductManager implements IManager<TypeProduct>, ISort {
	private ArrayList<TypeProduct> typeProducts;

	public TypeProductManager() {
		typeProducts = new ArrayList<>();
	}

	@Override
	public void add(TypeProduct type) {
		for (TypeProduct typeProduct : typeProducts)
			if (typeProduct.getId() == type.getId()) {
				System.out.println("Sản phẩm đã tồn tại");
				return;
			}
		typeProducts.add(type);
		System.out.println("Thêm thành công");
	}

	@Override
	public void displayall() {
		if (typeProducts.size() == 0) {
			System.out.println("Danh sách rỗng");
			return;
		}
		for (int i = 0; i < typeProducts.size(); i++) {
			System.out.println(typeProducts.get(i));

		}
	}

	@Override
	public TypeProduct search(int id) {
		for (TypeProduct typeProduct : typeProducts) {
			if (typeProduct.getId() == id)
				return typeProduct;
		}
		return null;
	}

	@Override
	public ArrayList<TypeProduct> search(String name) {
		ArrayList<TypeProduct> ProductByName = new ArrayList<>();
		for (TypeProduct typeProduct : typeProducts) {
			if (typeProduct.getName().equals(name))
				ProductByName.add(typeProduct);
		}
		return ProductByName;
	}

	@Override
	public void remove(int id) {
		TypeProduct typeProduct = search(id);
		if (typeProduct != null) {
			typeProducts.remove(typeProduct);
			System.out.println("Xóa loại sản phẩm thành công");
		} else {
			System.out.println("Xóa thất bại , Loại sản phẩm không tồn tại!");
		}
	}

	@Override
	public ArrayList<TypeProduct> getAll() {
		return typeProducts;
	}

	@Override
	public void sortById() {
		Collections.sort(typeProducts, new Comparator<TypeProduct>() {
			@Override
			public int compare(TypeProduct o1, TypeProduct o2) {
				return Integer.compare(o1.getId(), o2.getId());
			}
		});
	}

	@Override
	public void sortById(boolean reverse) {
		Collections.sort(typeProducts, new Comparator<TypeProduct>() {
			@Override
			public int compare(TypeProduct o1, TypeProduct o2) {
				if (reverse == true) {
					return Integer.compare(o2.getId(), o1.getId());
				}
				return Integer.compare(o1.getId(), o2.getId());
			}
		});

	}


	@Override
	public String toString() {
		return "TypeProductManager [typeProducts=" + typeProducts + "]";
	}

	public ArrayList<TypeProduct> getTypeProducts() {
		return typeProducts;
	}

	public void setTypeProducts(ArrayList<TypeProduct> typeProducts) {
		this.typeProducts = typeProducts;
	}

}
