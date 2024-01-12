package SealedClass;
// sealed class is a technique that limits the number of classes that can inherit the given class.
sealed class Employee permits Nikhil{
    public void fillTimeSheet(){
        System.out.println("Employee fills timesheet");
    }
}

final class Nikhil extends Employee{
    @Override
    public void fillTimeSheet() {
        System.out.println("Nikhil fills timesheet");
    }
}

public class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.fillTimeSheet();
        Nikhil obj = new Nikhil();
        obj.fillTimeSheet();
    }
}
