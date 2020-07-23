import java.util.*;
class ArrayList8{
public static void main(String args[]){
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(30);
al.add(40);
Object[] o=al.toArray();
for(Object obj: o)
System.out.println(obj+" ");
}
}
