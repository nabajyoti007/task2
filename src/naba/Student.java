/*
        Name: Nabajyoti Sharma
        Id: 2012020071
        Section: B
        Email: sharmanaba9@gmail.com
               cse_2012020071@lus.ac.bd
        Date: 08-August_2021
     */


package naba;

public class Student {
    String name;
    int id;
    static String universityName;

    Student()
    {
        System.out.println("Student Info:");
        universityName = "Leading University";
    }

    Student(String name)
    {
        this.name = name;
    }

    Student(String name, int id)
    {
        this.name = name;
        this.id = id;

       System.out.println("Name: " +this.name+"\n"+"Id: "+this.id);
    }

    void display()
    {
        System.out.println("University Name: " +universityName);
    }
}
