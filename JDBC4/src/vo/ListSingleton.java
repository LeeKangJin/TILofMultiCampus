package vo;

import java.util.ArrayList;

import com.FactoryBiz;
import com.ProductsBiz;

public class ListSingleton {

	static ArrayList<Factory> FactoryList = null;
	static ArrayList<Products> ProductsList = null;
	static FactoryBiz fb = new FactoryBiz();
	static ProductsBiz pb = new ProductsBiz();
	public ListSingleton() {
		
	}
	
	public static ArrayList<Products> getInstancePro(){
		
		if(ProductsList == null )
		{
			ProductsBiz pb = new ProductsBiz();
			
			try {
				ProductsList = pb.get();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ProductsList;
		
	}
	
	
	public static ArrayList<Factory> getInstanceFac() {
		
		if(FactoryList == null) {
			
			try {
				FactoryList = fb.get();
				
			} catch (Exception e) {
				System.err.println("error in singleton");
				e.printStackTrace();
			}
		}
		
		return FactoryList;
	
	
	
	}
	public static void instanceUpdateFac() {
		
		try {
			FactoryList = fb.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void instanceUpdatePro() {
		
		try {
			ProductsList = pb.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static boolean isBool(String FactNumber) {
		
		
		FactoryList = getInstanceFac();
		
		if(FactoryList == null) return false;
		
		for(int i=0; i<FactoryList.size(); i++) {
			if(FactNumber.equals(FactoryList.get(i).FactNo)) {
				return true;
			}
			
		}
		return false;
		
	}
	
	public static boolean isBool(int productId) {
		
		ProductsList = getInstancePro();
		
		if(ProductsList == null) return false;
		
		
		for(int i=0; i<ProductsList.size(); i++) {
			
			if(productId == ProductsList.get(i).PdNo) {
				
				if(isBool(ProductsList.get(i).FactNo)) {
					return true;
				}
				
				
			}
			
		}
		return false;
		
		
	}
	
	
	
	
}
