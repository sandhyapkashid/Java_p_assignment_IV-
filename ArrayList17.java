import java.util.*;
class ArrayList17{
public static void main(String args[]){
ArrayList<String>al=new ArrayList<String>();
al.add("Hello");
al.add("Java");
System.out.println(al);
ArrayList<String>list=new ArrayList<String>();
list.add("HelloWorld");
list.add("A");
System.out.println(list);
al.addAll(list);
System.out.println("Joined ArrayList:"+al);
}
}