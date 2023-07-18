package implementaciones;
import clases.Alumno;
import clases.Grado;
import clases.Sede;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        //Variables
        Scanner lector = new Scanner(System.in);
        int opcion;
        List<Alumno> alumnos = new ArrayList();
        List<Grado> grados = new ArrayList();
        List<Sede> sedes = new ArrayList();

        //Opciones de menú
        do {
            System.out.println("Opciones \n 1. Registrar Alumno. \n 2. Registrar Grado. \n 3. Registrar Sede.");
            System.out.println(" 4. Listar alumnos inscritos. \n 5. Listar grado y sección  \n 6. Ver sede \n 7. Salir.");
            System.out.println("Ingrese una opción: ");
            opcion = lector.nextInt();
            lector.nextLine();
            switch(opcion) {
                case 1:
                    Alumno alumno = new Alumno();
                    System.out.println("Nombre del Alumno: ");
                    alumno.setNombre(lector.nextLine());
                    System.out.println("DNI del alumno: ");
                    alumno.setDni(lector.nextLine());
                    System.out.println("Teléfono del alumno: ");
                    alumno.setTelefono(lector.nextLine());
                    System.out.println("Dirección del alumno: ");
                    alumno.setDireccion(lector.nextLine());
                    System.out.println("E-mail del alumno: ");
                    alumno.setEmail(lector.nextLine());
                    alumnos.add(alumno);
                    break;
                case 2:
                    Grado grado=new Grado();
                    System.out.println("Seleccione grado: Primero, segundo, tercero, cuarto, quinto");
                    grado.setGrado(lector.nextLine());
                    System.out.println("Elija la sección: 'A' 'B' 'C' 'D'");
                    grado.setSeccion(lector.nextLine());
                    grados.add(grado);
                    break;

                case 3:
                    Sede sede=new Sede();
                    System.out.println("Ingrese la sede: Ate - Centro - Norte - Sur");
                    sede.setSede(lector.nextLine());
                    sedes.add(sede);
                    break;
                case 4:
                    for (Alumno alu: alumnos) {
                        System.out.println("Nombre: "+ alu.getNombre() + " - DNI: " + alu.getDni() + " - Teléfono: " + alu.getTelefono()+ " - Direccion: " + alu.getDireccion()+ " - E-mail: " + alu.getEmail());
                        System.out.println("---------------------------------------------------------------------------");
                    }
                    System.out.println("###################################################");
                    break;
                case 5:
                    for (Grado gra: grados) {
                       System.out.println("Grado: " + gra.getGrado() + " - Seccion: " + gra.getSeccion());
                       System.out.println("---------------------------------------------------------------------------");
                    }
                    System.out.println("###################################################");
                    break;
                case 6:
                    for (Sede se: sedes) {
                    System.out.println("Sede: "+ se.getSede());
                    System.out.println("---------------------------------------------------------------------------");
                }
                System.out.println("###################################################");
                break;
            }
        }while(opcion!=7);
    }}