package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(20);
		list.add(23);
		list.add(34);
		list.add(87);
		list.add(21);
		list.add(44);
		
		Stream<Integer> stream=list.stream();
		List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> stream1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(stream1);

		//Create an empty Stream
		Stream<Object> emptyStream=Stream.empty();
		emptyStream.forEach(e->{System.out.println(e);});
		
		String names[]= {"Kunal","Om","Nitesh"};
		Stream<String> stream2=Stream.of(names);
		stream2.forEach(e->{System.out.println(e);});
		
		//List<String> city=List.of("Patna","Siwan","Delhi","Sitamadhi","Saharsa");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Siwan");
		list2.add("patna");
		list2.add("Delhi");
		list2.add("Kolkata");
		list2.add("Saharsa");
		list2.add("Mumbai");
		List<String>newCity=list2.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println(newCity);
		
		List<Integer> num=new ArrayList<>();
		num.add(24);
		num.add(20);
		num.add(23);
		num.add(34);
		num.add(87);
		num.add(21);
		num.add(44);
		List<Integer> newNum=num.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNum);
		
	}

}
