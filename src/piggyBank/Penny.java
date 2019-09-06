package piggyBank;

public class Penny extends AbstractCoin 
{
	private int penny;
    
    public Penny(int penny)
    {
        this.penny = penny;
      
    }

    public Penny()

    {
        this.penny = this.penny + 1;
    }


    public double getValue()
    {
        return penny * 0.01;
    }



    public String getName()
    {
        String plural = penny > 1 ? "s":"";
        return this.penny + " Penny" + plural;
    }
}
