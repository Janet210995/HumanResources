/*
Nombre:Janet Iridian Velázquez Sánchez
Matricula: 2023036
 */
package mx.edu.cesba.model;

public class Employee {

    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public int phoneNumber;
    public double salary;
    public String hiredate;

    //Metodo: son las acciones que realiza un objeto
    public void getDetails() { //METODO
        System.out.println ("Id:" + id);
        System.out.println ("FirstName:" + firstName);
        System.out.println ("LastName:" + lastName);
        System.out.println ("Age:" + age);
        System.out.println ("Email:" + email);
        System.out.println ("Phone Number:" + phoneNumber);
        System.out.println ("Salary:" + salary);
        System.out.println ("Hire Date:" + hiredate);

    }
}
