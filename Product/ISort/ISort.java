package ISort;

public interface ISort {
	// Sắp xếp tăng dần theo id
	public void sortById();

	// nếu reverse = true thì sắp xếp giảm dần theo id và ngược lại
	public void sortById(boolean reverse);

}
