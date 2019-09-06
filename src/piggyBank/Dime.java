package piggyBank;

//A Dime worth $0.10


public class Dime extends AbstractCoin 

{
    private int dime;
    
    public Dime(int dime)
    {
        this.dime = dime;
    }

    public Dime()
    {
        this.dime = this.dime + 1;
    }


    public double getValue()
    {
        return dime * 0.10;
    }

     public String getName()
    {
        String plural = dime > 1 ? "s":"";
        return this.dime + " Dime" + plural;
    }
}

