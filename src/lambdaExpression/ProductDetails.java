package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product{
	int id;
	String productName;
	float price;
	
	Product(int id, String productName,float price){
		super();
		this.id=id;
		this.productName=productName;
		this.price=price;
	}
}

 class NameComparator implements Comparator<Product> {
	public int compare(Product productName1,Product productName2){
	
		return productName1.productName.compareTo(productName2.productName);
	}
}

public class ProductDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product(1,"HP Laptop",23500));
		list.add(new Product(2,"Dell Laptop",45895.6f));
		list.add(new Product(3,"Keyboard",1600));
		
		Collections.sort(list,(productName1,productName2)->{
			return productName1.productName.compareTo(productName2.productName);
		});
		
		for(Product p:list) {
			System.out.println(p.id+"  "+p.productName+"  "+p.price);
		}
		

	}

}
