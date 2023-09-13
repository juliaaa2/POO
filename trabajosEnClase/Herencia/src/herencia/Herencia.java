
package herencia;
import Logica.Caballo;
import Logica.Perro;
import Logica.Gato;
import Logica.Vaca;
import Logica.Ave;

public class Herencia {

    
    public static void main(String[] args) {
        Perro perro = new Perro("Teddy","Croquetas",10,"Chihuahua");
        Gato gato = new Gato("Pelusa","Especial",8,"Siames");
        Caballo caballo = new Caballo("Jhonny","Pasto",21,"Fino");
        Vaca vaca = new Vaca("Lola","Sal",5,"Sueca Roja");
        Ave ave = new Ave("Paco", "Pistachos",1,"Loro");

        //-->Nos muestra los detalles del objeto
        perro.mostrar();
        System.out.println("--------------------------------------------------");
        gato.mostrar();
        System.out.println("--------------------------------------------------");
        caballo.mostrar();
        System.out.println("--------------------------------------------------");
        vaca.mostrar();
        System.out.println("--------------------------------------------------");
        ave.mostrar();
        System.out.println("--------------------------------------------------");

    }
    
}
