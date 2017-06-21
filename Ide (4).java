/* package codechef; // don't place package name! */

import java.util.ArrayList;
import java.util.Collection;
import java.LinkedList;
import java.util.List;

import com.hmkcode.vo.Person;
/* Name of the class has to be "Main" only if the class is public. */
public class ListApp
 {
 public static void main(String[] args)
 {
  List<Person> ArrayList = new ArrayList<Person>();
  List<Person> LinkedList = new ArrayList<Person>();
  for(Person p: getPerson())
 {
      arrayList.add(Person);
      linkedList.add(Person);
 }
  System.out.println("------Print All-----");
  System.out.println("LinkedList:" + linkedList);
  //c.Iterate
  System.out.println("Print Iterate by index:");
  for(int i = 0; i < linkedList.size(); i++)
  System.out.println("LinkedList["+i]+linkedList.get(i));
 }
 System.out.println("Print Iterate by for each");
 //this is an efficient way to approach the problem
 for(Person person:linkedList)
{
 System.out.println("LinkedList: " +person);
}
 //Collections.sort(linkedList);
 System.out.println("Sorted LinkedList: "+linkedList);
}
private static Person[] getPersons()
{
    Person[0] person = new Person("Brit",  29);
    Person[1] person = new Person["Vijay", 23];
    Person[2] person = new Person["Shyam", 45];
    Person[3] person = new Person["Sanjay",23];
    Person[4] person = new Person["Kanha", 45];
    return Persons;
}
}
}
}
}
