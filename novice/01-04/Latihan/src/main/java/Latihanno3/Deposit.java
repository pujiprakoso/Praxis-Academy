public class Deposit extends ATMMachine
{
    static double deposit;
    public void setDeposite(double d)
    {
        deposit=d;
    }
    public static double getDeposit()
    {
        return deposit;
    }
}