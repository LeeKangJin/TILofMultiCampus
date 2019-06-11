package test;

import java.text.ParseException;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class ProductsDelete {

	public static void main(String[] args) throws ParseException {
		Biz<Integer, Products> biz = new ProductsBiz();
		
		int key = 6;
		
		try {
			biz.remove(key);
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}
	
}
