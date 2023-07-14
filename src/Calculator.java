import java.util.Scanner;

public class Calculator {
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
            var operation = Integer.parseInt(digits.nextLine());
            if (operation >= 1 && operation <=4){
                //Recibiendo los números con los que trabajaremos
                System.out.print("Number one: ");
                var numberone = Integer.parseInt(digits.nextLine());
                System.out.print("Number two: ");
                var numbertwo = Integer.parseInt(digits.nextLine());
                int result;
                //Realizando las operaciones según el caso(operation)
                switch (operation){
                    case 1 ->{
                        result = numberone + numbertwo;
                        System.out.println("Add: " + result);
                    }
                    case 2 ->{
                        result = numberone - numbertwo;
                        System.out.println("Subtraction: " + result);
                    }
                    case 3 ->{
                        result = numberone * numbertwo;
                        System.out.println("Multiply: " + result);
                    }
                    case 4 ->{
                        result = numberone / numbertwo;
                        System.out.println("Division: " + result);
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
}
