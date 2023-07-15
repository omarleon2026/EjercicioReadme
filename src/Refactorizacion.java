import java.util.Scanner;

public class Refactorizacion {
    public static void main(String[] args) {
        Scanner digits = new Scanner(System.in);
        while (true) {
            System.out.println("Calculator");
            System.out.println("""
 1.Add
 2.Subtraction
 3.Multiply
 4.Division
 5.Exit
 """);
            System.out.println("Select an operation: ");
            //Convertir la opción del usuario en número
            var operation = digits.nextInt();//Se cambio la forma en la que recibimos los datos por algo mas optimo
            if (operation >= 1 && operation <=4){
                //Recibiendo los números con los que trabajaremos
                System.out.print("Number one: ");
                var numberone = digits.nextDouble();//Se cambio la forma en la que recibimos los datos por algo mas optimo
                System.out.print("Number two: ");
                var numbertwo = digits.nextDouble();//Se cambio la forma en la que recibimos los datos por algo mas optimo
                double result;
                //Realizando las operaciones según el caso(operation)
                switch (operation){
                    case 1 ->{
                        System.out.println("Add: " + suma(numberone, numbertwo));//Utilizando funciones
                    }
                    case 2 ->{
                        System.out.println("Subtraction: " + resta(numberone, numbertwo));//Utilizando funciones
                    }
                    case 3 ->{
                        System.out.println("Multiply: " + multiplicacion(numberone, numbertwo));//Utilizando funciones
                    }
                    case 4 ->{
                        System.out.println("Division: " + division(numberone, numbertwo));//Utilizando funciones
                    }
                    //Mensaje en caso de que algun número entre al switch y no pertenezca a los números de las opciones
                    default -> System.out.println("Error" + operation);
                }
            } else if (operation == 5) {
                System.out.println("Good bye");
                break;//Este break sirve para poder salir del bucle While y no ocasionar un ciclo infinito.
            }else {
                System.out.println("Please select a correct operation " + operation);
            }
        }
        System.out.println();
    }

    //Funciones
    public static double suma( double a, double b ){
        double result = a + b;
        return result;
    }

    public static double resta( double a, double b ){
        double result = a - b;
        return result;
    }

    public static double division( double a, double b ){
        double result = a / b;
        return result;
    }

    public static double multiplicacion( double a, double b ){
        double result = a * b;
        return result;
    }


}

