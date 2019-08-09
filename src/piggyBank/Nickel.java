package piggyBank;

public class Nickel extends AbstractCoin 
{
	private int nickel;
    
    public Nickel(int nickel)
    {
        this.nickel = nickel;
      
    }

    public Nickel()

    {
        this.nickel = this.nickel + 1;
    }


    public double getValue()
    {
        return nickel * 0.05;
    }



    public String getName()
    {
        String plural = nickel > 1 ? "s":"";
        return this.nickel + " Nickel" + plural;
    }
}