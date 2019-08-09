package piggyBank;

public class Dime extends AbstractCoin 

{
    private int dimes;
    
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
        String plural = dimes > 1 ? "s":"";
        return this.dimes + " Dime" + plural;
    }
}

