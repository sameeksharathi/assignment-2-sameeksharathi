/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
  public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.Enqueue("Sam",1);
        obj.Enqueue("Tom",4);
        obj.Enqueue("Joy",3);
        obj.Enqueue("Appi",2);
        obj.Enqueue("Candela",5);
        obj.display();
    }
}
