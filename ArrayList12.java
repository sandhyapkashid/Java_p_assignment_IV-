import java.util.*;
class ArrayList12{
public static void main(String args[]){
ArrayList<Integer>al=new ArrayList<Integer>();
al.add(15);
al.add(22);
al.add(30);
al.add(40);
al.add(2,25);
for(Integer i:al){
System.out.println("Number="+i);
}
}
}