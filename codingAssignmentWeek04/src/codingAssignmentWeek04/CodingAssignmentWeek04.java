package codingAssignmentWeek04;

public class CodingAssignmentWeek04 {

 public static void main(String[] args) {
   
//    1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//
//    a. Programmatically subtract the value of the first element in the array from the value in the last element
//    of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
   
   
   int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
   
                 
   int first = ages[0];                    // first position is always 0
   int last = ages[ages.length - 1];       // length of array -1 to determine last position in array
   
   System.out.println( last - first) ;
   
   System.out.println("------------------------------------");
   
//    b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
//
//    i. Make sure that there are 9 elements of type int in this new array.  
//
//    ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the 
//        new array ages2 from the last element of ages2). 
//
//    iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
//
//    c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
   
  
   int [] ages2 = {6, 8, 13, 26, 38, 39, 52, 55, 60};
   
   int first2 = ages2[0];                    // initiate another set of ints to fit the second array
   int last2 = ages2[ages2.length - 1];      // the formula remains the same, we only change the array name
   
   System.out.println( last2 - first2) ;     //  this could be simplified with the use of a method
   
   System.out.println("------------------------------------");

   
   double sum = 0;                           // sum variable to store the sum of the ages. double because they might be decimals
   for (int age : ages2) {                   // for each age in array ages2, add the value to the sum
     sum += age;
   }
  
   System.out.println(sum / ages2.length);   // prints the value of the sum of all elements and divides it by the number of elements
   
   System.out.println("------------------------------------");

//    2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//
//    a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//
//    b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the
//       result to the console.
   
   
   String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
   
   double sum2 = 0;
   for (String name : names) {
     sum2 += name.length();
   }
   
   System.out.println(sum2 / names.length);
   
   System.out.println("------------------------------------");

   String result = "";                             //declare a local variable to store the results from the loop
   for (int i = 0; i < names.length; i++) {        //it will iterate for as long as i is less than the length of the array
     
    result = result.concat(names[i] + " ");        //the element is concatenated to the result + an empty space " "
     
   } System.out.println(result);                   // the result is printed (all elements concatenated with a space between them)
   
   System.out.println("------------------------------------");

//    3. How do you access the last element of any array?
       
//      By determining the length of the array first and substracting 1 (array[array.length - 1])
//
//    4. How do you access the first element of any array?
//    
//        The first position in any array in Java is always zero (array[0])

//    5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add 
//    the length of each name to the nameLengths array.
   
   int [] nameLengths = new int [names.length];
   
   for (int i = 0; i < names.length; i++) {        //for loop that iterates over all elements and finds its length
     nameLengths[i] = names[i].length();           // with the variable, the names' length gets assign a position in the new array
   }
   
//    6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the 
//    result to the console.
   
   int sumLength = 0;                              // variable to store the value of the sum
   for (int name : nameLengths) {                  // enhanced for loop that adds all values together
     sumLength += name;
     }
   
   System.out.println(sumLength);
   
   System.out.println("------------------------------------");
   
   
   
//    7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
//    itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
   
   System.out.println(concatenatesMultipleTimes("Horse",2));
   
   System.out.println("------------------------------------");

   
   
//    8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be 
//        the first and the last name as a String separated by a space).
   
   String firstName = "Jacob";
   String lastName = "Ranger";
   
   String fullName = concatenatesFirstAndLastNames (firstName, lastName);
   System.out.println(fullName);
   
   System.out.println(concatenatesFirstAndLastNames("Yolanda", "Warden"));
   
   System.out.println("------------------------------------");
   
//    9. Write a method that takes an array of int and returns true if the sum of all the ints in the 
//    array is greater than 100.
   
   System.out.println(sumGreaterThan100(ages2));

   System.out.println("------------------------------------");
   
//    10. Write a method that takes an array of double and returns the average of all the elements in the array.
   
   double [] numbersArray = {25, 14, 9, 30};
   System.out.println(returnsAverage(numbersArray));
   
   System.out.println("------------------------------------");

   
//    11. Write a method that takes two arrays of double and returns true if the average of the elements in the 
//    first array is greater than the average of the elements in the second array.

   double [] numbersArray2 = {10, 15, 25, 30};     //average is 20
   
   System.out.println(averageOfFirstIsGreaterThanSecondArray(numbersArray, numbersArray2));
   
   System.out.println("------------------------------------");

   
   
//    12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and 
//    returns true if it is hot outside and if moneyInPocket is greater than 10.50.
   
   boolean isHotOutside = false;
   double moneyInPocket = 11;
   
   System.out.println(willBuyDrink(true, 15));
   System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
   
   System.out.println("------------------------------------");

//    13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
   
   boolean workToday = false;
   boolean schoolNight = true;
   
   
   
   System.out.println(goToTheGymToday(workToday, schoolNight));
   

 } 
 
 public static boolean goToTheGymToday (boolean doYouWorkToday,  boolean isSchoolNight) {
   
   boolean result;
   
   if (doYouWorkToday == true && isSchoolNight == true) {
           result = false;
   } else {
     result = true;
    
 
   } 
   return result;
 }
 
        
 
 
 public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
   
  
   boolean willBuy;
   if (isHotOutside == true && moneyInPocket > 10.50) {
     willBuy = true;
   } else {
     willBuy = false;
    
     
   } return willBuy;
   
 }
 
 public static boolean averageOfFirstIsGreaterThanSecondArray (double [] array1, double [] array2) {
   
   double sum1 = 0;
   double sum2 = 0;
   
   for (double number : array1) {
     sum1 += number;
   }
   
   for (double number : array2) {
     sum2 += number;
   } return (sum1 / array1.length) > (sum2 / array2.length);   // this formula calculates both averages and compares them
                                                               // to each other. Returns true if 1st is greater than 2nd
 }
 
 public static double returnsAverage (double [] array) {
   
   double sum = 0;                             //also needs to be a double to get to the correct result
   for (double number : array) {
     sum+= number;
   } return sum / array.length;
   
 }
 
 public static boolean sumGreaterThan100 (int [] array) {
   
   int sum = 0;
   for (int number : array) {
     sum += number;
       
   } return (sum > 100);
 }
 
 
 public static String concatenatesFirstAndLastNames(String firstName, String lastName) {
   
   String fullName = firstName + " " + lastName;
   return fullName;
 } 
 
 public static String concatenatesMultipleTimes (String word, int n) {
  
   String result ="";                          //variable that stores the values concatenated and then returns them
   for (int i = 1; i <= n; i++) {
     result += word;
   }return result;
 } 
      

}
