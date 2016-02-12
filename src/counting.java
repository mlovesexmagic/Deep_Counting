
/**
 * Exercise 1 is to remove duplicated values.
 * Exercise 2 is to count the duplicated values;
 * @author Zhipeng Mei
 * CCSF ID: w10479122
 * Date: Oct 3, 2015
 */
import java.util.Scanner;
   

public class counting {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner (System.in);
        //menu method

        boolean choice = false;
        while(!choice)
        {
            menu();
            if(in.hasNextInt())
            {
                int chose = in.nextInt();
                if(chose > 0 && chose < 3)
                {
                    switch(chose)
                    {
                        case 1: System.out.println("Exercise 1\n");
                                exercise1();
                                break;
                        case 2: System.out.println("Exercise 2\n");
                                exercise2();
                                break;
                        default: exercise1();
                                break;
                    }
                }//if condition
                else{
                    System.out.println("Input Error, please enter a valid choice.\n");
                }
            }//if hasNextInt statement
            else
            {
              String input = in.next();

              if(input.equals("Q"))
              {
                  System.out.println("Quitting...");
                  choice = true;
              }
              else
              {
                  System.out.println("Input Error, please enter a valid choice.\n");
              }
            }
        }//while loop, !choice condition
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("1. Exercise 1");
        System.out.println("2. Exercise 2");
        System.out.println("Q to quit");
        System.out.println("Enter 1 or 2 to continue.");
    }

   public static void exercise1(){
        Scanner input = new Scanner (System.in);
        int[] array = new int[10];
        System.out.println("Please enter 10 numbers from 0-100.");
            
            //for loop to get 10 values from user
        for(int i=0; i<10; i++){ 
            //implement each input into array
            int num = input.nextInt();
            

            //set range of input only available from 0-100
            if(num < 0 || num > 100 ){
                System.out.println("Error input! Please enter numbers from 0-100.");
            }
            else{   
                array[i] = num;  
            }        
        }
        
        //printing out the user's 10 inputs
        System.out.print("\nInput: "); 
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+ " ");
            
        }
        
        //finding duplicated values and set it as -1
         for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    array[j] = -1;
                }
            } 
        }
             
        //printing out everything in an array except -1 marked values
        System.out.print("\nOutput: "); 
        for(int i=0; i<array.length;i++){
            if(array[i] != -1){
                System.out.print(array[i]+ " ");
            }
        }
         System.out.println("\n");
    } 
    
   
   //exercise 2
   public static void exercise2(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please enter a string: ");
        
        //creating a new String
        String userString = new String();

        //obtaining user's input in 1 string
        String characters = input.nextLine();
          
        //store user's input into a String we created
        userString  = characters; 
        
        //conver String to lower case
        userString = userString.toLowerCase();
       
        //convert String into char[] array
        char[] userArrayChars = userString.toCharArray();
        
        //create an array for count to record repeated letters' # count
        int[] countArray = new int[userArrayChars.length];
        
        //set initial all values of count to 1
        for(int z=0; z<countArray.length; z++){
            countArray[z] = 1;
        }
                
        int count = 1;
        for(int i=0; i<userArrayChars.length; i++){           
            for(int j=i+1; j<userArrayChars.length;j++){                 
                if(userArrayChars[i]==userArrayChars[j]){
                    //set the repeated values to ','
                    userArrayChars[j] = ',';
                    count = count + 1;
                    countArray[i] = count;
                    
                }  
            }
            count = 1;
        }
        
        
        for(int i=0; i<userArrayChars.length; i++){
            if(userArrayChars[i] != ',' && userArrayChars[i] != ' '){
                if(countArray[i] == 1){
                    System.out.println(userArrayChars[i] + " occurs " + countArray[i] + " time");
                }
                else{
                    System.out.println(userArrayChars[i] + " occurs " + countArray[i] + " times");
                }
                
            }         
        } 
        System.out.println("\n");
    }
    
    
}    
    