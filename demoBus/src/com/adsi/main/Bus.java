/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adsi.main;

/**
 *
 * @author Ricardo
 */
public class Bus {
    
private String placa;
private int capacidadPasajeros;
private double precioPasaje;
private int pasajerosActuales;
private int totalPasajeros;

    public Bus() {
    }

    public Bus(String placa, int capacidadPasajeros, double precioPasaje) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioPasaje = precioPasaje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public void setPrecioPasaje(double precioPasaje) {
        this.precioPasaje = precioPasaje;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public void setTotalPasajeros(int totalPasajeros) {
        this.totalPasajeros = totalPasajeros;
    }


    
   //Mis métodos o mi lógica de la clase.
    
    public String subirPasajeros (int pasajerosAsubir) {
        
                
        if (pasajerosAsubir  <= capacidadPasajeros  - pasajerosActuales ) {
        
              this.pasajerosActuales = this.pasajerosActuales + pasajerosAsubir;
              
              this.totalPasajeros = this.totalPasajeros + pasajerosAsubir;
              
              return "Subieron " + pasajerosAsubir +" Pasajeros";
        }else{
              
             int temporal = (capacidadPasajeros  - pasajerosActuales);
             
             this.pasajerosActuales = this.pasajerosActuales + (capacidadPasajeros  - pasajerosActuales);
             
             this.totalPasajeros = this.totalPasajeros + temporal;
             
              return "Subieron " + temporal + " Pasajeros";
                        
          }
            
        
        
    }
    
    
}
