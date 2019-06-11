package test;

import java.sql.Date;
import java.text.ParseException;

import com.ProductsBiz;

import frame.Biz;
import vo.Products;

public class ProductsUpdate {

	public static void main(String[] args) throws ParseException {
		
		
		long millis=System.currentTimeMillis();  
		Date date=new java.sql.Date(millis);  
		
		Products u = new Products(6, "ddd", "말숙이", "10", date, 10, 10, 10);// rollback 당해서 안들어감
		Biz<Integer, Products> biz = new ProductsBiz();

		try {
			biz.modify(u);
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
