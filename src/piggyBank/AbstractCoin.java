package piggyBank;

public abstract class AbstractCoin

{

	public AbstractCoin()
	{
		subtract = 1.50;
		remove = 2;

	}

	public AbstractCoin(int remove, double subtract)
	{
		this.remove = remove;
		if (remove )
	}

	

    public abstract String getName();

    
    public abstract double getValue();

    @Override
    public String toString()

    {
        return getName();
    
    }
}