/*
Nombre:Janet Iridian Velázquez Sánchez
Matricula: 2023036
 */
package mx.edu.cesba.main;

import javax.swing.JOptionPane;
import mx.edu.cesba.model.Employee;

public class HR_Main {

    public static void main(String[] args) {
        //Creacion de objetos:
        Employee e1 = new Employee(); //sintaxis para crear objeto en java
        Employee e2 = new Employee();

        e1.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
        e1.firstName = JOptionPane.showInputDialog("Ingrese el Nombre");
        e1.lastName = JOptionPane.showInputDialog("Ingrese el Apellido");
        e1.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        e1.email = JOptionPane.showInputDialog("Ingrese el correo");
        e1.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número telefónico"));
        e1.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario mensual"));
        e1.hiredate = JOptionPane.showInputDialog("Ingrese la Fecha de contratación");

        e2.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID"));
        e2.firstName = JOptionPane.showInputDialog("ingrese el nombre");
        e2.lastName = JOptionPane.showInputDialog("ingrese el Apellido");
        e2.age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        e2.email = JOptionPane.showInputDialog("Ingrese el correo");
        e2.phoneNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número telefónico"));
        e2.salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario mensual"));
        e2.hiredate = JOptionPane.showInputDialog("Ingrese la Fecha de contratación");

        e1.getDetails();
        System.out.println("*****************************");
        e2.getDetails();

    }

}
