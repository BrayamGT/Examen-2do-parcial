package practica;

import java.util.ArrayList;
import java.util.Scanner;
import practica.JubiladoDiscapacidad;
import practica.JubiladoPatronal;
import practica.JubiladoVejez;
import practica.Persona;


public class practica {

    
    public static void main(String[] args) {
        ArrayList<Persona> jubilados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    jubilados.add(leerJubiladoVejez());
                    break;
                case 2:
                    jubilados.add(leerJubiladoDiscapacidad());
                    break;
                case 3:
                    jubilados.add(leerJubiladoPatronal());
                    break;
                case 4:
                    for (Persona jubilado : jubilados) {
                        System.out.println(jubilado);
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 5);

    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("1) Jubilado por vejez");
        System.out.println("2) Jubilado por discapacidad");
        System.out.println("3) Jubilado patronal");
        System.out.println("4) Imprimir");
        System.out.println("5) Salir");
        System.out.print("Ingrese la opcion deseada: ");
        opcion = sc.nextInt();
        return opcion;
    }

    public static JubiladoVejez leerJubiladoVejez() {
        Scanner sc = new Scanner(System.in);
        String dato;
        JubiladoVejez jubilado = new JubiladoVejez();
        System.out.print("Ingrese cedula: ");
        dato = sc.nextLine();
        jubilado.setCedula(dato);

        System.out.print("Ingrese nombre: ");
        dato = sc.nextLine();
        jubilado.setNombre(dato);

        System.out.print("Ingrese salario base: ");
        dato = sc.nextLine();
        jubilado.setSalarioBase(Float.parseFloat(dato));

        System.out.print("Ingrese años de aporte: ");
        dato = sc.nextLine();
        jubilado.setAniosAporte(Integer.parseInt(dato));

        return jubilado;
    }

    public static JubiladoPatronal leerJubiladoPatronal() {
        Scanner sc = new Scanner(System.in);
        String dato;
        JubiladoPatronal jubilado = new JubiladoPatronal();
        System.out.print("Ingrese cedula: ");
        dato = sc.nextLine();
        jubilado.setCedula(dato);

        System.out.print("Ingrese nombre: ");
        dato = sc.nextLine();
        jubilado.setNombre(dato);

        System.out.print("Ingrese salario base: ");
        dato = sc.nextLine();
        jubilado.setSalarioBase(Float.parseFloat(dato));

        System.out.print("Ingrese años de aporte: ");
        dato = sc.nextLine();
        jubilado.setAniosAporte(Integer.parseInt(dato));

        System.out.print("Ingrese porcentaje inflacion: ");
        dato = sc.nextLine();
        jubilado.setPorcentajeInfalcion(Float.parseFloat(dato));

        System.out.print("Trabaja en empresa privada (1. Si 2.No): ");
        dato = sc.nextLine();
        if (Integer.parseInt(dato) == 1) {
            jubilado.setEmpresaPrivada(true);
        } else {
            jubilado.setEmpresaPrivada(false);
        }

        return jubilado;
    }

    public static JubiladoDiscapacidad leerJubiladoDiscapacidad() {
        Scanner sc = new Scanner(System.in);
        String dato;
        JubiladoDiscapacidad jubilado = new JubiladoDiscapacidad();
        System.out.print("Ingrese cedula: ");
        dato = sc.nextLine();
        jubilado.setCedula(dato);

        System.out.print("Ingrese nombre: ");
        dato = sc.nextLine();
        jubilado.setNombre(dato);

        System.out.print("Ingrese salario base: ");
        dato = sc.nextLine();
        jubilado.setSalarioBase(Float.parseFloat(dato));

        System.out.print("Ingrese años de aporte: ");
        dato = sc.nextLine();
        jubilado.setAniosAporte(Integer.parseInt(dato));

        System.out.print("Ingrese porcentaje inflacion: ");
        dato = sc.nextLine();
        jubilado.setPorcentajeDiscapacidad(Float.parseFloat(dato));

        return jubilado;
    }
}