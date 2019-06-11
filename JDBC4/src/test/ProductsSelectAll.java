package test;

import java.text.ParseException;
import java.util.ArrayList;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class ProductsSelectAll {
	
	public static void main(String[] args) throws ParseException {
		
		
		Biz<Integer, Products> biz = new ProductsBiz();
		ArrayList<Products> ap = new ArrayList<Products>();
		
		try {
			ap =biz.get();
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<ap.size(); i++) {
			System.out.println(ap.get(i).getPdNo());
			
		}
		
	}
}
