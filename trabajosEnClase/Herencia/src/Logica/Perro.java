/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author IngSis
 */
public class Perro extends Animal {

    private String raza;

    public Perro(String nombre,String tipoAlimentacion,int edad,String raza){
        super(nombre,tipoAlimentacion,edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipoAlimentacion()+"-"+getEdad()+"-"+getRaza());
    }
}
