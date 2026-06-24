public class condition 
{
    public static void main(String[] args) 
    {
        int salary = 25400;
        if(salary > 20000)
        {
            salary = salary + 3000;
        }
        else if(salary > 10000)
        {
            salary = salary + 2000;
        }
        else
        {
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}


//and condition
// if(a == 10 && b == 20)

//or condition
// if(a == 10 || b == 20)

//not equal to
// if(a != 10)