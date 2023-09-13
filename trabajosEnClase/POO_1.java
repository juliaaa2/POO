package poo_1;

public class POO_1 {

    public static void main(String[] args) {

        int edad = 11;
        double temp = 34.4;
        char calificacion = 'A';
        boolean activo = true;
        String nombre = "Julia";
        int[] numeros = {1, 2, 3};

        System.out.println("hola " + nombre);

        //instancia de la clase
        POO_1 instance = new POO_1();

      
        //llamada al metodo
          int result = instance.sum(1, 2);
          System.out.println(result);
    }

    public int sum(int num1, int num2) {
        //System.out.println("Result: " + (num1 + num2));
        return (num1+num2);
    }
   
}
