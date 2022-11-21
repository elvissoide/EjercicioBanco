import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cuenta cuenta1 = new cuenta("Elvis Guanoluisa", 0);
        String opcion;
        double monto;

        mostrarMenuPrincipal();
        System.out.print("Ingresar opcion del menu: ");
        opcion = sc.next().toUpperCase();
        switch (opcion){
            case "A":
                System.out.print("Ingrese el monto a depositar: ");
                monto = sc.nextDouble();
                cuenta1.depositar(monto);
                System.out.println("Monto despues del deposito: " + cuenta1.getSaldo());
                break;
            case "B":
                System.out.print("Ingrese el monto a retirar: ");
                monto = sc.nextDouble();
                cuenta1.depositar(monto);
                System.out.println("Monto despues del retiro: " + cuenta1.getSaldo());
                break;
            case "C":
                System.out.println("Dueño de la cuenta: " + cuenta1.getTitular());
                System.out.println("Sueldo de la cuenta: " + cuenta1.getSaldo());
                break;
        }

    }

    static void mostrarMenuPrincipal(){
        System.out.println("\n\t *** MENU ***");
        System.out.println("A. Depositar.");
        System.out.println("B. Retirar.");
        System.out.println("C. Datos de la cuenta.");
        System.out.println("D. Salir");
    }
}
