package main.java.com.learning.oracleAcademy.CollectionConcepts;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        //Declare arrayList

        ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        ArrayList<String> arrayListString = new ArrayList<String>();
        List arrayListAsList = new ArrayList();
        ArrayList arrayList = new ArrayList();


        // add element to array List

        arrayList.add(10);
        arrayList.add("Welcome");
        arrayList.add(12.6);
        arrayList.add('A');
        arrayList.add(true);

        System.out.println(arrayList);  // [10, Welcome, 12.6, A, true]

        // size
        System.out.println(arrayList.size());   //5

        // remove the first  element
        arrayList.removeFirst();
        System.out.println(arrayList);  // [Welcome, 12.6, A, true]

        //remove the last element 
        arrayList.removeLast();
        System.out.println(arrayList); // [Welcome, 12.6, A]


        // remove the specofic  index
        arrayList.remove(1);
        System.out.println(arrayList); // [Welcome, A]

        //  arrayList.remove(8);
        System.out.println("arrayList = " + arrayList);  // index out of the bound exception


        // remove object - which is not there in the array list then it will ignore the value
        arrayList.remove("welcome");

        System.out.println("arrayList = " + arrayList); // arrayList = [Welcome, A]


        // remove the object which is present in the arraylist
        arrayList.remove("Welcome");
        System.out.println("arrayList = " + arrayList); // arrayList = [A]


        // insert at specific index
        arrayList.add(0, "100");
        System.out.println("arrayList = " + arrayList); // arrayList = [100, A]


        // get the specif value
        System.out.println(arrayList.get(0)); // 100
        System.out.println(arrayList.getLast()); // A
        System.out.println(arrayList.getFirst()); // 100

        // replace the element
        System.out.println(arrayList); // [100, A]
        arrayList.set(1, "B");
        System.out.println(arrayList); // [100, B]


        // chcek whethere specified object present or not
        System.out.println(arrayList.contains("B"));  // true
        System.out.println(arrayList.contains("BBB"));  // false

        // is empty

        System.out.println(arrayList.isEmpty());   // false


        /*
        print the data using
        1. for loop
        2. for ecah
        3. iterators

         */

        // for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // for each loop
        for (Object value : arrayList) {
            System.out.println(value);
        }
        //


        // iterator

        Iterator iterator = arrayList.iterator();
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());
        }


        //  add one arraylist to another araylist

        ArrayList arrayList1 = new ArrayList();

        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);


        // remove all the element

        System.out.println("before remove" + arrayList); // before remove[100, B]
        arrayList1.removeAll(arrayList);
        System.out.println("after remove = " + arrayList1); // after remove = []


        arrayList1.add("b");
        arrayList1.add("a");
        System.out.println("before sort = " + arrayList1);  // before sort = [b, a]
        //sort all the element
        Collections.sort(arrayList1);

        System.out.println("after sort = " + arrayList1);  // after sort = [a, b]


        // revrese the sort order

        Collections.sort(arrayList1, Collections.reverseOrder());
        System.out.println(arrayList1);   // [b, a]


        // shuffle element
        Collections.shuffle(arrayList1);
        System.out.println("lement after shuffle" + arrayList1);


        // convert array in to arraylist

        String data[] = {"sadhu", "brahma", "reddy"};

        System.out.println(data);

        ArrayList al = new ArrayList(Arrays.asList(data));

        System.out.println(al);
    }
}
