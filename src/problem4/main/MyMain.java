/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.Enqueue(10);
        obj.Enqueue(3);
        obj.Enqueue(30);
        obj.Enqueue(37);
        obj.Enqueue(13);
        obj.Enqueue(1);
        obj.Enqueue(7);

        MyQueue obj2 = new MyQueue();
        obj2.preSuccessor(obj.getroot());
        obj2.getPreSucc();
    }
}
