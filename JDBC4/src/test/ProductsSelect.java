package test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class ProductsSelect {

	public static void main(String[] args) throws ParseException {
		ProductsBiz biz = new ProductsBiz();
		Products ap = null;
		int key = 1;
		
		try {
			ap =biz.get(key);
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(ap.getFactNo());

		
	}
	
}
