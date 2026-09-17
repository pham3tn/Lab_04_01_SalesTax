
class Main
{
    void main()
    {
        double purchasePrice = 23.50;
        final double RATE = 0.05;
        double salesTax = 0;
        double total = 0;

        salesTax = purchasePrice * RATE;
        total = purchasePrice + salesTax;

        IO.println("The total is "+ total +" and the tax is "+ salesTax);
    }
}
