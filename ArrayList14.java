import java.util.*;
class ArrayList14{
public static void main(String args[]){
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(30);
al.add(1);
al.add(2);
System.out.println(al);
al.remove(new Integer(1));
al.remove(new Integer(2));
System.out.println("Modified ArrayList"+al);
}
}
