package lesson020;

import java.util.List;

public class Main {
	
	static List<Integer> list;

	public static void main(String[] args) {

		try {
			list.add(2);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("bu satır çalışıyor mu");
		

	}

}
