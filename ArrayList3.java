import java.util.*;
class ArrayList3{
public static void main(String args[]){
ArrayList<String>al=new ArrayList<String>();
al.add("A");
al.add("B");
al.add("C");
al.add("D");
al.add("E");
System.out.println(al);
System.out.println(al.size());
al.trimToSize();
System.out.println(al.size());
}
}