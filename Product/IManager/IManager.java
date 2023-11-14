package IManager;

import java.util.ArrayList;

public interface IManager<T> {
	// thêm
	public void add(T t);

	// tìm kiếm theo id
	public T search(int id);
	
	// xóa
	public void remove(int id);
	
	// tìm kiếm theo tên
	public ArrayList<T> search(String name);
	
	// lấy tất cả danh sách
	public ArrayList<T> getAll();
	
	// dùng để in ra danh sách
	public void displayall();

}
