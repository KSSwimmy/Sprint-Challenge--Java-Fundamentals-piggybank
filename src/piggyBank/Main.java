package piggyBank;
import java.util.*;

//You will need to import java.text.DecimalFormat
import java.text.DecimalFormat;


public class Main
{
	public static void main(String[] args)
	{
        // At the beginning your program, initialize the format with this statement
        // DecimalFormat fp = new DecimalFormat("$###,###.00");
		DecimalFormat fp = new DecimalFormat("$###,###.00");
		double money = 0;



        //Create a collection (array, arraylist, or hashmap) to represent the piggy bank. 
        //When creating a coin object, you can optionally give the number of coins being added. If no number is given, the default is 1 coin being added to the piggy bank.

		ArrayList<AbstractCoin> piggyBank = new ArrayList<AbstractCoin>();
        piggyBank.add(new Quarter(4));
        piggyBank.add(new Dime(10));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(20));
        piggyBank.add(new Dime(10));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(100));


        //looping through the arrayList to print out
        for(AbstractCoin v:piggyBank){
            money+=v.getValue();
        }

	    piggyBank.forEach(v -> System.out.println(v.getName()));
        System.out.println();

        //When you ready to print out the piggy bank value, use a statement like
        System.out.println("The piggy bank holds " + fp.format(money));

	}
}


//Prints out 
// 4 Quarters
// 10 Dimes
// 5 Dollars
// 20 Nickels
// 10 Dimes
// 1 Dollar
// 100 Pennys

// The piggy bank holds $11.00

//PRINT OUT COMMANDS 


// Once in the src/ folder:
// Type javac employeeApp/*.java to compile all of the .java files
// Type jar cvfe EmpApp.jar employeeApp.Main employeeApp/*.class to compile all the .classfiles into a jar file
// Type java -jar EmpApp.jar to run the .jarfile you created



