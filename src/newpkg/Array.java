package newpkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array {

	public static void main(String[] args) {
	Integer [] a= {1,2,3,4,5,6,1,2,3,4};

	
List<Integer> num = new ArrayList<Integer>();
for(int num1:a) {
	num.add(num1);
}
	System.out.println(num);
System.out.println(num.size());


Set<Integer> num4= new HashSet<Integer>();
for(int num6:a) {
	num4.add(num6);
	
	
	
	
	
}
System.out.println("Hashset"+num4);



List<Integer> nm= Arrays.asList(a);

nm.addAll(nm);

System.out.println("nm  "+nm);
/*List<int[]> num =Arrays.asList(a);    
 System.out.println("Array converted to Set");
 System.out.println(num)*/

 String[] array = {"a", "b", "c", "d", "e"};

 //Method 1
 List<String> list = Arrays.asList(array);          
 System.out.println(list);
	}

}
