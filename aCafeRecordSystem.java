/*************************************************************************************************************\
 This program starts by entering the coffee name and total sales for a number of records. Then
 (i) Display the list of the coffee nmae and total sales with the index location.
 (ii) Find availability of the coffee in the menu and display the total sales together with the index location,
 or display the coffee name or appropriate message if the coffee name is not found in the array.
 (iii) Find a specific amount of total sales and display the coffee name, total sales and how many time it is listed 
 in the records with the index location or display an appropriate message if the total sales is not found in the array.
//**********************************************************************************************************/
 // Programmer: muhammmad asyraf bin abdul aziz
 


import java.util.Scanner;
public class aCafeRecordSystem
 {
public static void main (String[] args)
{

Scanner input = new Scanner(System.in); 
Scanner sc = new Scanner(System.in );

 System.out.print("##################################################################\n");
 System.out.print("**   \t\t\t LIST OF COFFEE AND TOTAL SALES FOR FEBRUARY 2026    **\n");
 System.out.print("**   \t\t\t       a'cafe SDN BHD,BANTING SELANGOR               **\n");
 System.out.print("##################################################################\n");    
 
 
 //Declaring Variable N
     int N=0; // number of records
      System.out.print("Enter the number of coffee sold: ");     // user prompt
     N = input.nextInt();     //Reads the N
     input.nextLine();                       // input statement
     
     //Declare & Create Arrays
       String[] coffeeName = new String[N];            // array 1
        double[] totalSales = new double[N];           // array 2
        
       for(int i = 0; i < N; i++){      //1st Array Looping to read inputs
          System.out.print("\n " + (i + 1) +"." + " Enter coffee name: " );  
          coffeeName [i] = input.nextLine();
          
          System.out.print(" Enter total sales for a month : RM ");
          totalSales [i] = input.nextDouble();
          input.nextLine();
         
        }// end repeat for read
        
        //table header
    System.out.print("================================================================\n");
    System.out.print("\tNo \t\tCoffee Name \t\t Total Sales(RM) \t\t\t Index \n");
    System.out.print("================================================================\n");
    
    //2nd Array Looping to print outputs
        for(int i = 0; i < N; i++){
          System.out.println("\t" + (i+1) + "\t\t\t" + String.format("%-15s", coffeeName[i]) + "\t\t" + String.format("%.2f", totalSales[i])  
                             + "\t\t\t\t\t\t" + i);
     }// end loop for outputs
   
    //display the header for linear search
    System.out.print("\n===========================================\n");
    System.out.print("=============LINEAR SEARCH=================\n");
   System.out.print("===========================================\n");
   
   
   // read 1st search  
   System.out.println("\nEnter coffee name to determine the availability of the coffee in the menu: ");
    String searchMenu=input.nextLine();
       
    boolean found = false;
    //3rd Array Looping to 1st search
    for (int i=0; i<N; i++){
       // Determine to display finding search
       if (coffeeName[i].equals(searchMenu)) {    	
          System.out.println("\nFOUND! coffee name " +coffeeName[i]+ " with total sales RM " + String.format("%.2f", totalSales[i]) 
                             +" at Index location " + i + "\n" );
                
          found = true;
       } // end if 1st search	
    } // end loop for 1st search
    
     // Determine to display no finding search
   if (!(found))
     System.out.println(" Sorry, the coffee name is not found in the cafe menu.\n" );
   {// end if no finding search
   
      // Read 2nd linear search
       System.out.print(" Enter total sales amount to be search : RM ");
    double searchSales = input.nextDouble();

       // display header for 2nd search 
      System.out.print("================================================================\n");
    System.out.print("\tNo \t\tCoffee Name \t\t Total Sales(RM) \t\t\t Index \n");
    System.out.print("================================================================\n");
    
    //declare and initialize variable countFound
    int countFound = 0;
    
     //4th Array Looping to 2nd search
      for (int i = 0; i < N; i++) {
       if (totalSales[i] == searchSales) {
        System.out.println("\t" + (i+1) + "\t\t\t" + String.format("%-15s", coffeeName[i]) + "\t\t" + String.format("%.2f", totalSales[i])  
                             + "\t\t\t\t\t\t" + i);

               countFound++;
    }//end if
} //end for

// determine to display count of finding search
if (countFound > 0) {
    System.out.println("\nThis total sales amount was found " + countFound + " time(s) in the records." );
 }else {
    
    System.out.println("\nTotal sales RM " + String.format("%.2f", searchSales) + " is not found in the records.");
}//end if
}

   } //main
 } //class





