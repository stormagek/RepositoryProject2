package a;

public class Employee
{
    //My policy if that age, would be of type int
    private int age;
    private String ID;

    public Employee (int age)
    {
        this.age = age;
    }

    @Override
    public String toString ()
    {
        return "I'm an employee with age " + this.age;
    }
}
