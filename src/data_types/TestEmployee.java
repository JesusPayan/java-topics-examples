package data_types;

import java.util.List;

public class TestEmployee {

    // las variables declaradas dentro de una clase y fuera de cualquier metodo pueden ser utilizadas en cualquier parte de la clas
    static int fecha;
    public static void main(String[] args) {

        //el alcance de es estas variables es solo dentro de este metodo.




        //System.out.println("El empleado:"+analyst.name+" tiene un salario de " + employeeSalary("Analyst"));
       // System.out.println("La fecha de hoy es : " + returnDate());

        Analyst roman =  new Analyst(0002,"Roman",50,54000,"Analyst");
        Developer pedro =  new Developer(002,"Pedro",43,34000,"Developer");
        Person persons[] = {roman,pedro};
        //showEmployeeType(pedro);


        showPersons(persons);

    }
    public static double employeeSalary(String employeeType) {
        fecha = 10;
        //el alcance de estas variables es solo este metodo;
        double totalSalary = 0.0;
        double baseSalary = 0.0;
        if (employeeType.equals("Developer")){
            baseSalary = 25000.00;
        }else if(employeeType.equals("Analyst")){
            baseSalary = 20000.00;
        }
        return totalSalary = (baseSalary * (0.10)) + baseSalary;

    }
    static int  returnDate(){
        fecha = 20221112;
        return fecha;
    }

    public static void showEmployeeType(Person person){
        if (person.type.equals("Analyst")==true){
            System.out.println("Es un Analista");
        }else {
            System.out.println("Es un Developer");
        }
    }
    public static void showPersons(Person person[]){
        for (int i= 0; i< person.length;i++){
            System.out.println("Persona:" + i);
            System.out.println("id:"+person[i].id);
            System.out.println("Nombre:"+person[i].name);
            System.out.println("Edad:"+person[i].age);
            System.out.println("Salario"+person[i].salary);
            System.out.println("Tipo:"+person[i].type);

        }
    }

}
