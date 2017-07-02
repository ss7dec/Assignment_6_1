//Assignment_6_1

//Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print
//all even numbers from an array.


//This is a Java Program to Print the Even Numbers in an Array.
//Now using For loop and If Condition we use to choose/pick out only those integers in the array that contain Even numbers only.
//Here is the source code of the Java Program to Print Even Numbers in an Array. 
//The Java program is successfully compiled and run on a Windows system

package assignment_6_1;

public class Integer_Array {    //This java file is inside package named package1 inside src folder.

/*
 * This assignment helps in mastering the concepts to declare and initialize an array.
 */
	
	//Class declaration containing main function.
	
		public static void main(String[] args)      //main function declaration. and because it is static, program execution starts from main function. 
		{
			int[] arrayOfIntegers=new int[10];    //Creating array of integers of size 10.
			
			System.out.println("The Even Numbers given in  the array are :");     //We have to print even numbers from the array.
			
			for(int i = 0 ; i < 10 ; i++)           //for loop to initialize the array elements.
			{
				arrayOfIntegers[i] = i + 1;    //i is starting from zero, and we want 1 to 10, so we are adding 1.
				
				if(arrayOfIntegers[i] % 2 == 0)       //Checking the element is even or not.
					System.out.println(arrayOfIntegers[i]);     //Printing even elements.
			}
			
		}    //End of main function.


}
