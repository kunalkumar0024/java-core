package streamAPI;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(25);
		marks.add(45);
		marks.add(78);
		marks.add(23);
		marks.add(98);
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Kunal");
		names.add("Kunal Kumar");
		names.add("Kunal Singh");
		names.add("Nitesh");
		names.add("Nitesh Mahapatra");
		names.add("Nitesh Kumar Mahapatra");
		names.add("Om");
		names.add("Om Prakash Pan");
		
		System.out.println(marks);
		
		List<Integer> listOfFailed=marks.stream().filter(i->i<40).collect(Collectors.toList());
		System.out.println(listOfFailed);
		
		List<Integer> list=marks.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		
		Comparator<Integer> c=(i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0;
		List<Integer> list2=marks.stream().sorted(c).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3=marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(list3);
		
		List<Integer> list4=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(list4);
		
		List<Integer> list1=marks.stream().sorted((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(list1);
		
		long count1=marks.stream().filter(m->m<40).count();
		System.out.println(count1);
		
		Comparator<String> name=(name1,name2)->{
			int l1=name1.length();
			int l2=name2.length();
			if(l1<l2)
				return -1;
			else if(l1>l2)
				return +1;
			else
				return 0;
						//name1.compareTo(name2);
		};
		
		List<String> sortedName=names.stream().sorted(name).collect(Collectors.toList());
		System.out.println(sortedName);
		
		Integer min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		
		Integer max=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
		//Integer min=marks.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println(max);
		
		
		Consumer<Integer> c1=i->{
			System.out.println("Square of"+i+"="+i*i);
		};
		
		marks.stream().forEach(c1);
		
		Integer[] i=marks.stream().toArray(Integer[]::new);
		/*for(Integer i1:i) {
			System.out.println(i1);
		}*/
		Stream.of(i).forEach(System.out::println);
		
		//Stream.of(9,99,999,9999).forEach(System.out::println);
		
		

	}

}
