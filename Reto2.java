/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.Scanner;


/**
 *
 * @author juanj
 */
public class reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroPacinetesInt=0, longitud;//defino int y strigs que uso en el programa
        int cancer=0,card = 0, respi = 0, cereb = 0,hiper = 0, diab = 0, Fami = 0, STotal = 0, Coom = 0, CSalud = 0, SColmena = 0,Sanitas=0,SCOL=0,SSalud=0,SaludC=0,CValle=0,CBlanca=0,ComP=0,SURA=0,ColS=0;
        String[] listaEnfermedades = {"cancer", "cardiovasculares", "respiratorias", "cerebrovasculares", "hipertension", "diabetes"};
        String[] listaEPS = {"Famisanar", "Salud Total", "Cafesalud", "Coomeva", "Salud Colmena","Sanitas","Salud colombia","Solsalud","Saludcoop","Comfenalco Valle","Cruz Blanca","Compensar","SURA","Colseguros"};
        String enfermedades, EPS;
        String adultos2 = " ";
        
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("Ingrese el numero de pacientes: ");//pido el numero de pacientes en strings y lo convierto en int
        String numeroPacientes = scanner.nextLine();
        numeroPacinetesInt = Integer.parseInt(numeroPacientes);
        
        while(numeroPacinetesInt >0){
           numeroPacinetesInt--;
           
           //Leo los datos ingresados los separo por - y lo convierto en un vector y tomo el dato de la enfermedad en otra variable
           //System.out.println("Ingrese los datos del paciente: ");
           String datos = scanner.nextLine(); 
           String palabras[] = datos.split("-"); 
           //enfermedades = "AAAA";//palabras[5];
           enfermedades = palabras[5];
           EPS = palabras[4];
           
           
           switch(EPS){
               
               case "Famisanar":
                   Fami++;
                   break;
               case "Salud Total":
		   STotal++;
                   break;
               case "Cafesalud":
                   CSalud++;
                   break;
               case "Coomeva":
                   Coom++;
                   break;
               case "Salud Colmena":
                   SColmena++;
                   break;
               case "Sanitas":
                   Sanitas++;
                   break;
               case "SALUDCOLOMBIA":
                   SCOL++;
                   break;
               case "Solsalud":
                   SSalud++;
                   break;
               case "Saludcoop":
                   SaludC++;
                   break;
               case "Comfenalco Valle":
                   CValle++;
                   break;
               case "Cruz Blanca":
                   CBlanca++;
                   break;
               case "Compensar":
                   ComP++;
                   break;
               case "SURA":
                   SURA++;
                   break;
               case "Colseguros":
                   ColS++;
                   break;
                   
           }
            System.out.println(SSalud+" :AAAAAA: "+CSalud);
           //utilizo los if para sumar las difeerentes enfermedades
           if(enfermedades.equalsIgnoreCase("cancer")){
                cancer++;
            } 
           else if(enfermedades.equalsIgnoreCase("cardiovasculares")){
                card++;
            }
           else if(enfermedades.equalsIgnoreCase("respiratorias")){
                respi++;
            }
           else if(enfermedades.equalsIgnoreCase("cerebrovasculares")){
                cereb++;
            }
           else if(enfermedades.equalsIgnoreCase("hipertension")){
                hiper++;
            }
           else if(enfermedades.equalsIgnoreCase("diabetes")){
                diab++;
            }
            
           int edad = Integer.parseInt(palabras[2]);
           Paciente PacienteEdad = new Paciente(edad);
           palabras[2] = PacienteEdad.clasificarEdad();
           //System.out.println("edad: "+PacienteEdad.calcularEdad());
           
           if(palabras[2].equalsIgnoreCase("Adulto")){//intento que salgan los adultos
               String adultos  = palabras[0]+" "+palabras[1];
               adultos2 = adultos2+","+adultos;
               //System.out.println(adultos2);
               
           }
        }
        
        //int[] numeroEPS = {Fami, STotal, CSalud, Coom, SColmena};
        int[] numeroEPS = {Fami, STotal, CSalud, Coom, SColmena,Sanitas,SCOL,SSalud,SaludC,CValle,CBlanca,ComP,SURA,ColS}; 
        
        
        int[] numeroEnfermedades = {cancer, card, respi, cereb, hiper, diab};
        int numeroMayor = 0, numeroMenor = 0;
        
        for(int i = 1; i < numeroEnfermedades.length;i++){
             if(numeroEnfermedades[i] > numeroEnfermedades[numeroMayor]){
                 numeroMayor = i;
             }        
        }
        for(int i = 1; i < numeroEnfermedades.length;i++ ){
             if(numeroEnfermedades[i] < numeroEnfermedades[numeroMenor]){
                 numeroMenor = i;             
             }
             
        }
        System.out.println(listaEnfermedades[numeroMayor]);
        System.out.println(listaEnfermedades[numeroMenor]);
        
        numeroMayor = 0;
        
        for(int i = 1; i < numeroEPS.length;i++){
             if(numeroEPS[i] > numeroEPS[numeroMayor]){
                 numeroMayor = i;
             }        
        }

        System.out.println(listaEPS[numeroMayor]);
        
        String pacientesAdultos[] = adultos2.split(","); 
        
        
        longitud = pacientesAdultos.length;
        for(int i = 1;i< longitud; i++ ){
            System.out.println(pacientesAdultos[i]);
        }
        

    }
    
}
