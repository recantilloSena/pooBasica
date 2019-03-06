package com.adsi.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bus bus = new Bus("RHJ-323", 40, 2400);
        
        System.out.println(bus.subirPasajeros(20)); 
        System.out.println(bus.getCapacidadPasajeros());
        System.out.println(bus.getTotalPasajeros());
        
        
        System.out.println(bus.subirPasajeros(10));
        System.out.println(bus.getCapacidadPasajeros());
        System.out.println(bus.getTotalPasajeros());
        
        
        System.out.println(bus.subirPasajeros(20));
        System.out.println(bus.getCapacidadPasajeros());
        System.out.println(bus.getTotalPasajeros());
        
         System.out.println(bus.subirPasajeros(10));
        System.out.println(bus.getCapacidadPasajeros());
        System.out.println(bus.getTotalPasajeros());
        
        System.out.println("Se Recibieron $"+bus.getTotalPasajeros() * bus.getPrecioPasaje()+ " En Total" );
    }
    
}
