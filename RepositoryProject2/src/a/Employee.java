package a;

public class Employee
{
    private int age;

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
