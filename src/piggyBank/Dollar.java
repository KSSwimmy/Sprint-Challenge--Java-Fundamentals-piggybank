package piggyBank;

public class Dollar extends AbstractCoin 
{
	//Field
	private int dollar;

//Constructor
	public Dollar(int dollar)
	{
		this.dollar = dollar;
	}


//methods

	public Dollar()
	{
        this.dollar = this.dollar + 1;
    }
	
	public double getValue()
	{
		return dollar * 1.00;
    }

   
    public String getName()
    {
        
        String plural = dollar > 1 ? "s":"";
        
        return this.dollar + " Dollar" + plural;
    
    }
}