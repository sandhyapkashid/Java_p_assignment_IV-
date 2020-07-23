import java.util.*;
import java.util.ArrayList;
class ArrayList16{
public static void main(String[ ] args){


ArrayList<String>al=new ArrayList<String>();
al.add("A");
al.add("B");
al.add("C");
al.add("D");
al.add("E");
System.out.println("original arrarlist:"+al);
List<String>al2=al.subList(2,4);
System.out.println("Sublist of arraylist:"+al2);

}
}