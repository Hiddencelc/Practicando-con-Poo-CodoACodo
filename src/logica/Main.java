package logica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declaro una instancia de la clase Scanner para dar lectura a lo que ingrese el usuario
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        //pedimos el nombre, apellido, edad,hobbies,editor preferido y sistema operativo utilizado

        System.out.println("\t\t******ALTA EN SISTEMA******\t\t\n");

        System.out.println("----------------DATOS PERSONALES-----------------\n");

        System.out.print("1)Ingresa tu nombre:");

        //asignamos el nombre a la variable name
        String name = read.next();

        System.out.print("2)Ingresa tu apellido:");

        //asignamos el apellido a la variable lasname 
        String lasName = read.next();

        System.out.print("3)Ingresa tu edad:");

        //asignamos la edad a la variable age
        int age = read.nextInt();

        System.out.println("----------------OTROS DATOS REQUERIDOS-----------------\n");

        System.out.print("4)¿Cuál es tu hobbie? (puedes ingresar más de uno):");

        //asigmanos hobbies a la variable hobbies
        String hobbies = read.next();

        System.out.print("5)¿Cuál es tu editor de código preferido?:");

        //asignamos editor a la variable editor
        String editor = read.next();

        System.out.print("6)¿Qué sistema operativo utilizas?");

        //asignamos el sistema operativo leido por scanner a la variable sysOp
        String sysOp = read.next();

        //mostramos por consola los datos ingresados por el usuario:
        System.out.println("\n\t TUS DATOS INGRESADOS SON:\n");
        System.out.println("*\tNombre: " + name + "\n*\tApellido: " + lasName + "\n*\tEdad: " + age);
        System.out.println("*\tHobbies: " + hobbies);
        System.out.println("*\tEditor preferido: " + editor);
        System.out.println("*\tSistema operativo utilizado: " + sysOp);


        
        
        
        
        
        
        
        
        

    }

}
