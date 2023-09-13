package pkg060923;
import exercise.Persona;
public class Main {

  
    public static void main(String[] args) {
    
      //creacion de instancias
      Persona person = new Persona("Juliana","Diaz","123");  
      Persona person2 =new Persona("Andrea","Cardenas","789");
      
      //creacion de arreglo
      Persona[] arrayPerson = new Persona [3];
      
      //se le dan datos a los atributos para el arreglo
      arrayPerson[0]= new Persona("Jordan","Minota","1234");
      arrayPerson[1]= new Persona("Cristian","Rojas","12344");
      arrayPerson[2]= new Persona("Isa","Diaz","12343");
      
      //imprimir datos con la funcion GET
      System.out.println("__________________________");
      System.out.println("Datos de persona a");
      System.out.println(person.getNombre());
      System.out.println(person.getApellido());
      System.out.println(person.getDocumento());
      System.out.println("__________________________");
      
      System.out.println("__________________________");
      System.out.println("Datos de persona b");
      System.out.println(person2.getNombre());
      System.out.println(person2.getApellido());
      System.out.println(person2.getDocumento());
      System.out.println("__________________________");
      
      //modificar datos con la funcion SET
      person.setNombre("Julia");
      person.setApellido("Cardenas");
      person.setDocumento("456");
      
      System.out.println("__________________________");
      System.out.println("Datos modificados persona a");
      System.out.println(person.getNombre());
      System.out.println(person.getApellido());
      System.out.println(person.getDocumento());
      System.out.println("__________________________");
      
      //arreglo para imprimir datos del arreglo
      for(int i=0;arrayPerson.length>i;i++){
      System.out.println("__________________________");
      System.out.println("Datos de persona "+(i+1));
      System.out.println(arrayPerson[i].getNombre());
      System.out.println(arrayPerson[i].getApellido());
      System.out.println(arrayPerson[i].getDocumento());
      System.out.println("__________________________"); 
           }
      
      //otra manera de hacer los ciclos
          for(Persona persona : arrayPerson){
          System.out.println("__________________________"); 
          System.out.println(persona.getNombre());
          System.out.println(persona.getApellido());
          System.out.println(persona.getDocumento());
          System.out.println("__________________________"); 
          }
    }
}
