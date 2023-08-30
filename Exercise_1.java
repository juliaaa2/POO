package com.mycompany.exercise_1;


public class Exercise_1 {

    public static void main(String[] args) {

     Exercise_1 ex = new Exercise_1 ();
     
        int result = ex.factorial(8);
        
    }
   public int factorial_r(int n){
       if(n==0 || n==1){
       return 1;
       }else{
       return factorial_r(n-1)*n;
       }
   }
    
    public int factorial ( int tope){
        
     int numFactorial = 1;   

     for(int i=1;i<=tope;i++){
         
        numFactorial= numFactorial*i;
        System.out.println(numFactorial);
         
     }
     
     return numFactorial;    
    }
}
