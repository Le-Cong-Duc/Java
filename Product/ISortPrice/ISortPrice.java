package ISortPrice;

public interface ISortPrice {
	// dùng để sắp xếp tên theo priceForSale
	public void sortByPrice();

	// nếu reverse = true thì sắp xếp giảm dần và ngược lại
	public void sortByPrice(boolean reverse);

}
