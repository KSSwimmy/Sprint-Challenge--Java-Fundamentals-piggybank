package piggyBank; //

public abstract class AbstractCoin //
{

    //FIELDS OR ATTRIBUTES
    private int amount;
    private double value;
    private String name;
    private String plural;

    public Coin()
    {
        this.amount = 1;
        this.plural = "";
    }

    public Coin(int amount) // Parent Constructor that gets called in the supers() 
    {

        //if the amount is greater than 1 then it will add an "s" if it is not plural then add nothing. 
     
        this.amount = amount;
        if ( amount > 1)
        {
            this.plural = "s";
        }
        else
        {
            this.plural = "";
        }

    }

    //GETTERS AND SETTERS
    public int getAmount()
    {
        return amount;
    }

    public double getTotalValue()
    {
        return value * amount;
    }

   
    public void setValue(double value) //
    {
        this.value = value;
    }


    
    public String getName()
    {
        return name;
    }

    
    public void setName(String name)
    {
        this.name = name;
    }

    
    public double getValue()
    {
        return value;
    }

    @Override // Overriding or implement a method from a super()
    public String toString()
    {
        return amount + " " + name + plural;
    }
}