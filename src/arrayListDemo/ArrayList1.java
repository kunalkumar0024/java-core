package arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list=new ArrayList<String>();
     list.add("Kunal");
     list.add("Liku");
     list.add("Prince");
     list.add("Appu");
     Iterator<String> itr=list.iterator();
     while(itr.hasNext())
    	 System.out.println(itr.next());
	}

}
