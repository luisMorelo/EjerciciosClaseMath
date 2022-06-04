
package ClaseMath;

/**
 *
 * @author Luis Morelo 
 */
public class Ejercicio4 {
    public static void main(String[] args){
        double num1 = 1 + (Math.random()*50);
        double num2 = 1 + (Math.random()*50);
        
        num1=Math.ceil(num1);
        num2=Math.round(num2);
        
        double numMayor = Math.max(num2, num1);
        
        System.out.println("El numero mayor es: "+numMayor);
    }
}
