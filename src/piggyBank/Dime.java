package piggyBank;

public class Dime extends AbstractCoin 

{
	public Dime(int amount) 
	{
		super(int amount);
	}

    
    public Dimes(int dimes)
    {
        this.dime = dime;
    }

    public Dimes()
    {
        this.dimes = this.dimes + 1;
    }


    public double getValue()
    {
        return dimes * 0.10;
    }
}

