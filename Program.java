package Array_Lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        // int[] arr = {1, 3, 4};
        // int[] arr1 = new int[3];
        
        // // System.out.println(Arrays.toString(arr));
        // // System.out.println(Arrays.toString(arr1));

        // ArrayList<Integer> arrList1 = new ArrayList<Integer>();
        
        // arrList1.add(5);
        // arrList1.add(10);
        
        // ArrayList<Integer> arrList = new ArrayList<Integer>(arrList1);
        // arrList.add(1);
        // arrList.add(3);
        // arrList.add(4);
        // // arrList.addAll(arrList1);

        // /*
        //  * Created an Array List. Demonstrated adding values to the list
        //  * and implemented a try/catch where I made further edits to the list and printed them to the console.
        //  */
        // MyArrayList<Integer> myFirstList = new MyArrayList<Integer>();
        // myFirstList.AddEnd(3);
        // myFirstList.AddEnd(7);
        // myFirstList.AddEnd(1);
        // //myFirstList.Print();
        // myFirstList.AddStart(2);
        // //myFirstList.Print();
        // myFirstList.AddAtIndex(300, 2);
        // //myFirstList.Print();
        // myFirstList.AddAtIndex(-2, -2);
        // //myFirstList.Print();
        // myFirstList.AddAtIndex(900, 30);
        // myFirstList.Print();

        // try{
        //     System.out.println(myFirstList.Size());
        //     myFirstList.DeleteAtStart();
        //     myFirstList.Print();
        //     myFirstList.DeleteATIndex(3);
        //     System.out.println(myFirstList.Size());
        //     myFirstList.Print();
        //     System.out.println(myFirstList.IsEmpty());
        //     myFirstList.DeleteAtEnd();
        //     myFirstList.Print();
        //     System.out.println(myFirstList.Size());
        // } catch(Exception exception){
        //     System.out.println(exception);
        // }
        
        // myFirstList.ClearAll();
        // myFirstList.Print();
        // System.out.println(myFirstList.IsEmpty());
        // System.out.println(myFirstList.Size());
        // //System.out.println(myFirstList.GetElementAtIndex(59));
    
        // /*
        //  * Created a second Array List. Demonstrated adding strings to the list
        //  * I then made edits to and deleted from the list and printed them to the console.
        //  */
        // MyArrayList<String> mySecondList = new MyArrayList<String>();
        // mySecondList.AddStart("Hello");
        // mySecondList.AddEnd("World!");
        // mySecondList.AddAtIndex("Beautiful", 1);
        // mySecondList.Print();
        // System.out.println(mySecondList.Size());
        // mySecondList.DeleteAtEnd();
        // mySecondList.Print();
        // mySecondList.ClearAll();
        // mySecondList.Print();
    
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("World!");
        // add a new node here
        myLinkedList.AddFront(" Hello ");
        myLinkedList.AddFront(" This is me");
        myLinkedList.AddFront("Hi");
        myLinkedList.Append("Dog");
        System.out.println(myLinkedList.GetSize());
        System.out.println(myLinkedList);
    }   

}

   