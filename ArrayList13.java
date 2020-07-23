import java.util.*;
class ArrayList13{
public static void main(String args[]){
ArrayList<String>al=new ArrayList<String>();
al.add("ABC");
al.add("DEF");
al.add("GHI");
System.out.println(al);
al.remove(1);
System.out.println("After removing element:");
System.out.println(al);
}
}