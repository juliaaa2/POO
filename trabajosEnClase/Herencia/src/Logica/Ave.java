/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author IngSis
 */
public class Ave extends Animal {

    String especie;

    public Ave(String nombre, String tipoAlimentacion, int edad,String especie) {
        super(nombre, tipoAlimentacion, edad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipoAlimentacion()+"-"+getEdad()+"-"+getEspecie());
    }
}
