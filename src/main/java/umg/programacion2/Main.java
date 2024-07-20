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
        System.out.print("Ingrese el radio del circulo: ");
        a = sc.nextFloat();
        c = grupo1.radio(a);
        System.out.println("El area del circulo es: " + c);
        System.out.println();
        System.out.print("Ingrese la base del triangulo: ");
        a = sc.nextFloat();
        System.out.print("Ingrese la altura del trinagulo: ");
        b = sc.nextFloat();
        c = grupo2.triarea(a,b);
        System.out.println("El area del triangulo es: " + c);
        System.out.println();
        System.out.print("Ingrese la area_base del prisma rectangular: ");
        a = sc.nextFloat();
        System.out.print("Ingrse la altura del prima rectangular: ");
        b = sc.nextFloat();
        c = grupo3.priarea(a,b);
        System.out.println("El area del prima rectangular es: " + c);
    }
}