package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import IManager.IManager;
import ISort.ISort;
import ISortPrice.ISortPrice;

public class ProductManager implements IManager<Product>, ISort, ISortPrice {
	private ArrayList<Product> products;

	public ProductManager() {
		products = new ArrayList<>();
	}

	@Override
	public void add(Product t) {

		for (Product product : products)
			if (product.getId() == t.getId()) {
				System.out.println("Sản phẩm đã tồn tại");
				return;
			}
		products.add(t);

	}

	@Override
	public Product search(int id) {
		for (Product product : products) {
			if (product.getId() == id)
				return product;
		}
		return null;
	}

	@Override
	public ArrayList<Product> search(String name) {
		ArrayList<Product> productForSearch = new ArrayList<>();
		for (Product product : products)
			if (product.getName().equals(name)) {
				productForSearch.add(product);
			}
		return productForSearch;
	}

	@Override
	public void remove(int id) {
		Product product = search(id);
		products.remove(product);
		System.out.println("Xóa thành công");
	}

	@Override
	public ArrayList<Product> getAll() {
		return products;
	}

	@Override
	public void displayall() {
		if (products.size() == 0) {
			System.out.println("Danh sách rỗng");
			return;
		} else {
			for (int i = 0; i < products.size(); i++)
				System.out.println(products.get(i));
		}
	}

	public void displayProductIn() {
		for (Product p : products)
			if (p instanceof ProductIn) {
				System.out.println(p);
			}
	}

	public void displayProductOut() {
		for (Product p : products)
			if (p instanceof ProductOut) {
				System.out.println(p);
			}

	}

	public void displayPForSale() {
		for (Product p : products)
			if (p.priceForSale() > 100000)
				System.out.println(p);
	}

	public void productOfType(TypeProduct type) {
		for (Product product : products) {
			if (product.getType().getId() == type.getId()) {
				System.out.println(product);
			}
		}
	}

	public ArrayList<Product> typeOfProduct(TypeProduct type) {
		ArrayList<Product> typeOfProducts = new ArrayList<Product>();
		ArrayList<Product> productsToRemove = new ArrayList<Product>();
		for (Product product : products) {
			if (product.getType().getId() == type.getId()) {
				typeOfProducts.add(product);
				productsToRemove.add(product);
			}
		}
		products.removeAll(productsToRemove);
		System.out.println("Xóa sản phẩm trong loại sản phẩm thành công!");
		return typeOfProducts;
	}

	@Override
	public void sortById() {
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return Integer.compare(o1.getId(), o2.getId());
			}
		});

	}

	@Override
	public void sortById(boolean reverse) {
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (reverse == true) {
					return Integer.compare(o2.getId(), o1.getId());
				}
				return Integer.compare(o1.getId(), o2.getId());
			}
		});

	}

	@Override
	public void sortByPrice() {
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return Long.compare(o1.priceForSale(), o2.priceForSale());
			}
		});

	}

	@Override
	public void sortByPrice(boolean reverse) {
		Collections.sort(products, new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (reverse == true) {
					return Long.compare(o2.priceForSale(), o1.priceForSale());
				}
				return Long.compare(o1.priceForSale(), o2.priceForSale());
			}
		});

	}

	@Override
	public String toString() {
		return "ProductManager [products=" + products + "]";
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

}
