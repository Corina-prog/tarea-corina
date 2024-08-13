package tareaprogra;

import java.util.Scanner;

public class Tareaprogra {

    public static void main(String[] args) {
        electrodomestico arreglo[] = new electrodomestico[15];
        Scanner teclado = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        int op = 0;

        while (op != 5) {

            System.out.println("1. Nuevo electrodomestico");
            System.out.println("2. Ver electrodomesticos");
            System.out.println("3. Buscar electrodomesticos");
            System.out.println("4. Modificar electrodomestico");
            System.out.println("5. Salir");
            System.out.println("Ingrese el numero de opcion");
            op = teclado.nextInt();

            if (op == 1) {

                System.out.println("------------------------");
                System.out.println("Ingrese codigo");

                int codigo = teclado.nextInt();

                System.out.println("Ingrese la maraca");

                String marca = letras.nextLine();

                System.out.println("Ingrese el tipo de electrodomestico ");

                String tipo = letras.nextLine();

                System.out.println(nuevoElectrodometico(codigo, marca, tipo, arreglo));
            } else if (op == 2) {
                System.out.println(printTodo(arreglo));
            } else if (op == 3) {
                System.out.println("---------------------");
                System.out.println("Ingrese clave");
                int codigo = teclado.nextInt();
                System.out.println(buscarelectrodomesticoBoleano(codigo, arreglo));
            } else if (op == 4) {
                System.out.println("Ingrese clave");
                int clave = teclado.nextInt();
                if (buscarElectroBoleano(clave, arreglo)) {
                    System.out.println("Ingrese el nuevo nombre");
                    String nombre = letras.nextLine();
                    System.out.println("Ingrese el nuevo grado");
                    String grado = letras.nextLine();
                    System.out.println(modificarDatos(clave, nombre, grado, arreglo));
                } else {

                }
            }
        }
    }

    public static String nuevoElectrodometico(int codigo, String marca, String tipo, electrodomestico arreglo[]) {
        boolean lleno = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = new electrodomestico(codigo, marca, tipo);
                lleno = false;
                break;
            } else if (arreglo[i].getCodigo() == codigo) {
                return "Ya existe la clave";

            }
        }
        if (!lleno) {
            return "--Se gurado con exito--";
        } else {
            return "Ya no hay espacio";
        }

    }

    public static String printTodo(electrodomestico arreglo[]) {
        String cadena = "";

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                cadena = cadena + arreglo[i].getCodigo() + " | " + arreglo[i].getMarca() + " | " + arreglo[i].getTipo() + "\n";
            }
        }

        return cadena;
    }

    public static String buscarelectrodomesticoBoleano(int codigo, electrodomestico arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getCodigo() == codigo) {
                return "Los datos \n nombre: " + arreglo[i].getMarca() + "Grado: " + arreglo[i].getTipo();

            }

        }
        return "No existe la clave ingresada";
    }

    public static boolean buscarElectroBoleano(int codigo, electrodomestico arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public static String modificarDatos(int codigo, String marca, String tipo, electrodomestico arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getCodigo() == codigo) {
                arreglo[i].setMarca(marca);
                arreglo[i].setTipo(tipo);
                return "Se actualizo con exito";

            }
        }
        return "";
    }

}
