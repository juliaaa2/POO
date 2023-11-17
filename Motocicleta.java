/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programamaven;

/**
 *
 * @author Administrador
 */
public class Motocicleta extends Vehiculo {
      private int cilindrada;
 

    // Constructores, getters y setters

    // Otros métodos específicos para motocicletas

   
    public Motocicleta(int cilindrada, String marca, String modelo, String placa, String horaIngreso) {
        super(marca, modelo, placa, horaIngreso);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
