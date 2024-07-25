package umg.programacion2;

import umg.programacion2.PKG_Grupo1.ClsGrupo1;
import umg.programacion2.PKG_Grupo2.ClsGrupo2;
import umg.programacion2.PKG_Grupo3.ClsGrupo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        ClsGrupo1 grupo1 = new ClsGrupo1();
        ClsGrupo2 grupo2 = new ClsGrupo2();
        ClsGrupo3 grupo3 = new ClsGrupo3();
        int option;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Área del círculo");
            System.out.println("2. Circunferencia de la esfera");
            System.out.println("3. Volumen del cubo");
            System.out.println("4. Área del triángulo");
            System.out.println("5. Volumen de la pirámide");
            System.out.println("6. Área del prisma rectangular");
            System.out.println("7. Área del paralelogramo");
            System.out.println("8. Volumen del cilindro");
            System.out.println("0. Salir");
            System.out.print("> ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    a = sc.nextFloat();
                    c = grupo1.radio(a);
                    System.out.println("El área del círculo es: " + c);
                    break;
                case 2:
                    System.out.print("Ingrese el radio del círculo: ");
                    a = sc.nextFloat();
                    c = grupo1.cirunferencia(a);
                    System.out.println("La circunferencia de la esfera es: " + c);
                    break;
                case 3:
                    System.out.print("Ingrese la medida de un lado del cubo: ");
                    a = sc.nextFloat();
                    c = grupo1.volumencubo(a);
                    System.out.println("El volumen del cubo es: " + c);
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    a = sc.nextFloat();
                    System.out.print("Ingrese la altura del triángulo: ");
                    b = sc.nextFloat();
                    c = grupo2.triarea(a, b);
                    System.out.println("El área del triángulo es: " + c);
                    break;
                case 5:
                    System.out.print("Ingrese la base de la pirámide: ");
                    a = sc.nextFloat();
                    System.out.print("Ingrese la altura de la pirámide: ");
                    b = sc.nextFloat();
                    c = grupo2.piravol(a, b);
                    System.out.println("El volumen de la pirámide es: " + c);
                    break;
                case 6:
                    System.out.print("Ingrese la área base del prisma rectangular: ");
                    a = sc.nextFloat();
                    System.out.print("Ingrese la altura del prisma rectangular: ");
                    b = sc.nextFloat();
                    c = grupo3.priarea(a, b);
                    System.out.println("El área del prisma rectangular es: " + c);
                    break;
                case 7:
                    System.out.print("Ingrese la área base del paralelogramo: ");
                    a = sc.nextFloat();
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    b = sc.nextFloat();
                    c = grupo3.paraarea(a, b);
                    System.out.println("El área del paralelogramo es: " + c);
                    break;
                case 8:
                    System.out.print("Ingrese la altura del cilindro: ");
                    a = sc.nextFloat();
                    System.out.print("Ingrese el radio del cilindro: ");
                    b = sc.nextFloat();
                    c = grupo3.volucin(a, b);
                    System.out.println("El volumen del cilindro es: " + c);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

            System.out.println();
        } while (option != 0);

        sc.close();
    }
}
