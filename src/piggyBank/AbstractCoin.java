public abstract class AbstractCoin;

{

    public abstract String getName();
    
    public abstract double getValue();

    @Override
    public String toString(){
        return getName();
    
}
