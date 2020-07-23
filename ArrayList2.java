import java.util.*;
class ArrayList2{
public static void main(String args[]){
ArrayList<String>list=new ArrayList<String>();
list.add("Mango");
list.add("Apple");
list.add("Banana");
System.out.println(list);
System.out.println(list.size());
list.ensureCapacity(100);
System.out.println(list.size());
}
}