package piggyBankApp;
import java.util.*;
import java.text.DecimalFormat;


public class Main
{
	public static void main(String[] args)
	{
		DecimalFormat fp = new DecimalFormat("$###,###.00");
		double money = 0;

		ArrayList<TheMoney> piggyBank = new ArrayList<TheMoney>();
        piggyBank.add(new Quarter(4));
        piggyBank.add(new Dimes(10));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickels(20));
        piggyBank.add(new Dimes(10));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(100));


        
        for(TheMoney v:piggyBank){
            money+=v.getValue();
        }

	    piggyBank.forEach(v -> System.out.println(v.getName()));
        
        System.out.println();

        System.out.println("The piggy bank holds " + fp.format(money));

	}
}

//PRINT OUT COMMANDS 


// Once in the src/ folder:
// Type javac employeeApp/*.java to compile all of the .java files
// Type jar cvfe EmpApp.jar employeeApp.Main employeeApp/*.class to compile all the .classfiles into a jar file
// Type java -jar EmpApp.jar to run the .jarfile you created



