import java.util.Stack;

public class Metodos {

    /*Metodo que recibe un numero cualquiera y devuelve su valor factorial, 
    cree un metodo por a aparte para manejar la lógica por separado*/
    public int factorial (int n) {
        
        if(n == 0){
            return 1;    
        }else{
        
            int valorFinal = 1;
            for (int i = 1; i <= n; i++) {
        
                valorFinal = valorFinal * i;
            }
        
            return valorFinal;
        }        
    }

    /*Metodo que va a recibir la matriz y la va a convertir en una pila, a la vez, todos los valores de la pila
     * van a llegar en su factorial
     */
    public Stack<Integer> deVectorAPila (int[] vector){

        Stack <Integer> resultado = new Stack<>();

        for (int i = 0; i < vector.length; i++) {
            resultado.push(factorial(vector[i]));
        }
        
        return resultado;
    }    

    /*Esta matriz sirve nada mas para mostrar la operación efectuada en el metodo anterior (en deVectoarAPila)
     * solo la creé para separar responsabilidades en el programa
     */
    public void mostrarResultado(int[] vector){
        
        Stack <Integer> resultado = deVectorAPila(vector);
        
        System.out.println(resultado);

    }
    
    
}
