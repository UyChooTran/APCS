
/**
 * Write a description of class Tax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tax
{
    private boolean married;
    private double income;
    private double tax;
    public Tax(boolean m , double income)
    {
        married = m;
        this.income = income;
    }

    public Tax()
    {
        married = false;
        income = 0;
    }

    public double calcTax()

    {
        if (married == false)
        {
            return calcSing();
        }
        else
        {
            return calcMar();
        }
    }

    private double calcMar()
    {
        if (income < 0 && income <= 45200)
        {
            tax = income * .15; 
        }
        else if(income > 45200 && income <=109250)
        {
            tax = (income - 45200) * .275 + 6780;
        }
        else if(income > 109250 && income <= 166500)
        {
            tax = (income - 109250) * .305 + 24393.75;
        }
        else if (income > 166500 && income <= 297350)
        {
            tax = (income - 166500) *.355 + 41855;
        }
        else 
        {
            tax = (income - 297350) * .391 + 88306;           
        }
        return tax;
    }

    private double calcSing()
    {
        if (income < 0 && income <= 27050)
        {
            tax = income * .15; 
        }
        else if(income > 27050 && income <=65550)
        {
            tax = (income - 27050) * 27.5 + 4057.5;
        }
        else if(income > 65550 && income <= 136750)
        {
            tax = (income - 65550) * .305 + 14645;
        }
        else if (income > 136750 && income <= 297350)
        {
            tax = (income - 136750) *.355 + 36361;
        }
        else 
        {
            tax = (income - 297350) * .391 + 93374;           
        }
        return tax;
    }

}
