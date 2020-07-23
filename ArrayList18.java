import java.util.*;
class ArrayList18{
public static void main(String args[]){
ArrayList<String>al=new ArrayList<String>();
al.add("Hello");
al.add("Java");
al.add("Programing");
System.out.println("In first ArrayList:"+al);
ArrayList<String>list=new ArrayList<String>();
System.out.println("In Second ArrayList"+list);
list.addAll(al);
System.out.println(list);
}
}