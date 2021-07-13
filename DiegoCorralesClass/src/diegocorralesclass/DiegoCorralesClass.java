/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocorralesclass;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Diego Corrales
 */
public class DiegoCorralesClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date fecha_nacimiento = new Date(118,4,13);
        SimpleDateFormat formato = new SimpleDateFormat("dd-MMM-yyyy");
        Scanner inst_datos_entrada =new Scanner(System.in);
        
        
        System.out.println("1. Ingrese su nombre:");
        String name = inst_datos_entrada.nextLine();
        
        System.out.print("2. Ingrese sus apellidos:");
        String lastname = inst_datos_entrada.nextLine();
        
        System.out.print("3. Ingrese sus apellidos:");
        String sex = inst_datos_entrada.nextLine();
        
        System.out.print("4. Ciudad de nacimiento:");
        String city_born = inst_datos_entrada.nextLine();
        
        System.out.print("5. Departamento de nacimiento:");
        String regi_born = inst_datos_entrada.nextLine();
        
        System.out.print("6. Profesión:");
        String profession = inst_datos_entrada.nextLine();
        
        System.out.print("7. Dirección:");
        String address = inst_datos_entrada.nextLine();
        
        System.out.print("8. Típo de documento:");
        String doc_type = inst_datos_entrada.nextLine();
        
        System.out.print("9. Número de documento:");
        int doc_number = inst_datos_entrada.nextInt();
        
        System.out.print("10. ¿Cuantos Hijos tiene?:");
        int num_child = inst_datos_entrada.nextInt();
        
        System.out.print("11. Estatura en Kg:");
        float height = inst_datos_entrada.nextFloat();
        
        System.out.print("12. Peso en mts:");
        float weight = inst_datos_entrada.nextFloat();
        
        ComplementDates complement_person = new ComplementDates(name,lastname,city_born,regi_born,doc_type,doc_number,profession
                                                                ,address,num_child,height,weight,sex);
        System.out.println(complement_person.Person_Dates());
    }
    
}
