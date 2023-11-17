/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programamaven;

/**
 *
 * @author Administrador
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String horaIngreso;
    String horaSalida;

    public Vehiculo(String marca, String modelo, String placa, String horaIngreso) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
    }
   
    public double calcularGanancia(){
    
        if (this.horaSalida == null){
        return 2000;
        }
        String horaIng = this.horaIngreso;
        String horaSal = this.horaSalida;
        //se busca extraer las horas
        String [] partesHoraI = horaIng.split(":");
        int horasI= Integer.parseInt(partesHoraI[0]);
        //se busca extraer las horas
       String [] partesHoraS = horaSal.split(":");
       int horasS = Integer.parseInt(partesHoraS[0]);
        return 2000+((horasS-horasI)*200);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
}
