package piggyBank;

public class Dime extends AbstractCoin 

{
	public Dime(int amount) 
	{
		super(int amount);
	}

    
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
}

