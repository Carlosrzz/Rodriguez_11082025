/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez_11082025;

/**
 *
 * @author Carlos Josue
 */
public class Main {
    
    
public static int horasEnUnDia = 24;
    public static int segundosEnUnaHora = 3600;
    public static int segundosEnUnMinuto = 60;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //VARIABLE LOCAL
        int segundosTotales = 91111;
        //SE ASIGNA EL VALOR DE DIAS A LA VARIABLE
        int dias = calcularDias(segundosTotales);
        //SE ASIGNAEL VALOR DE LOS SEGUNDOS EXCENDENTES O RESTANTES DESPUES DE HABER
        //CALCULADO LOS DÍAS
        int segundosRestantesDespuesDeExtraerDias = obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);
        //SE ASIGNA EL VALOR DE LAS HORAS A PARTIR  DE LOS SEGUNDOS EXCEDENTES DEL CALCULO DE DIAS
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        //SE ASIGNA EL VALOR DE LOS SEGUNDOS EXCEDENTES  A PARTIR DEL CALCULO DE HORAS
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        // SE ASIGNA EL VALOR DE LOS MINUTOS A PARTIR DE LOS SEGUNDOS RESTANTES DEL CALCULO DE HORAS
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        //LOS SEGUNDOS QUE QUEDAN DESPUES DE HABER REALIZADO TODOS LOS CALCULOS ANTERIORES
        int segundosFinales = obtenerSegundosRestantesDespuesDeExtraerMinutos (segundosRestantesDespuesDeExtraerHoras);
        
        
        //SALIDA AL USUARIO
        System.out.println("Usted ha solicitado calcular los dias, horas, minutos y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor actual  de segundos como: "+segundosTotales);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundosFinales);
        
    }
    
    //MÓDULO PARA CALCULAR LA CANTIDAD DE DIAS*/
    public static int calcularDias(int segundosTotales){
        return segundosTotales/(Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    
    //MÓDULO PARA CALCULAR LOS SEGUNDOS RESTANTES DESPUES DE EXTRAER LOS DIAS
    public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotales){
        return segundosTotales % (Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    
    //MODULO PARA CALCULAR LAS HORAS
    public static int calcularHoras (int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    
    //MODULO PARA CALCULAR LOS SEGUNDOS RESTANTES DESPUES DE EXTRAER LAS HORAS
    public static int obtenerSegundosRestantesDespuesDeExtraerHoras(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    
    
   //MODULO PARA CALCULAR LA CANTIDAD DE MINUTOS A PARTIR DE LOS SEGUNDOS RESTANTES
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnMinuto;
    }
    
    //MODULO PARA CALCULAR LOS SEGUNDOS RESTANTES DE TODA LA OPERACION
    public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnMinuto;
    }
   
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    

