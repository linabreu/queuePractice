/*
Lina Breunlin
Module 8 Lab
Part B
This program allows the user to put 8 integers in a Queue, then displays the numbers in the queue, removed three and displays what was removed, 
calculates the average of what was removed, displays what is remaining in the queue, and displays the average of the numbers reamining in the queue.

Test cases:
numbers added to the queue by user: 1 2 3 4 5 6 7 8 
The numbers in the Queue are: [1, 2, 3, 4, 5, 6, 7, 8]
The numbers removed from the Queue are: 1,2,3
The average of the numbers removed from the Queue is: 2.0
The numbers remaining in the Queue are: [4, 5, 6, 7, 8]
The average of the numbers remaining in the Queue is: 6.0

numbers added to the queue by user: 10, 12, 15, 18, 21, 26, 68, 78 
The numbers in the Queue are: [10, 12, 15, 18, 21, 26, 68, 78]
The numbers removed from the Queue are: 10,12,15
The average of the numbers removed from the Queue is: 12.0
The numbers remaining in the Queue are: [18, 21, 26, 68, 78]
The average of the numbers remaining in the Queue is: 42.0 

 */
package queuedemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueueDemo 
{

    public static void main(String[] args)
    {
        //create a queue to hold the numbers
       Queue<Integer> numQ = new LinkedList<>(); 
       
       Scanner in = new Scanner(System.in);
       
       int queueNum =0;
        
        
        System.out.println("Please enter 8 integers for the Queue: ");
        for (int i = 0; i < 8; i++)
        {
          queueNum = in.nextInt();
          numQ.add(queueNum);
        }
        System.out.print("The numbers in the Queue are: " + numQ);
        System.out.println();
        
        //remove the top three numbers from the queue
        int removedNum1 = numQ.remove();
        int removedNum2 = numQ.remove();
        int removedNum3 = numQ.remove();
        
        //display the removed numbers
        System.out.println( "The numbers removed from the Queue are: " + removedNum1 + "," + removedNum2 + "," + removedNum3);
        
        //calculate the average of the removed numbers
        double removedAvg = (removedNum1 + removedNum2 + removedNum3) / 3;
        System.out.println( "The average of the numbers removed from the Queue is: " + removedAvg);
        
        //display the remaining 5 numbers
        System.out.print("The numbers remaining in the Queue are: " + numQ);
        System.out.println();
       
        //display the average of the remaining 5 numbers
        int sum = 0;
        Iterator<Integer> iterator = numQ.iterator();
        
        //iterate through the queue to get the sum of all the numbers
        while (iterator.hasNext()) 
        {
            sum = iterator.next() + sum;
        }
        
        //calculate the average and print it out
        double remainingAvg = sum/5;
        System.out.println("The average of the numbers remaining in the Queue is: " + remainingAvg);

    
}
}
