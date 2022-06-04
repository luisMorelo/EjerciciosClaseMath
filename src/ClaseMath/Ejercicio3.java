
package ClaseMath;

/**
 *
 * @author Luis Morelo
 */
public class Ejercicio3 {
    public static void main(String[] args){
        double nota1 =(int) (0 +(Math.random()*10));
        double nota2 =(int) (0 +(Math.random()*10));
        double nota3 =(int) (0 +(Math.random()*10));
        double nota4 =(int) (0 +(Math.random()*10));
        double nota5 =(int) (0 +(Math.random()*10));
        double promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        System.out.println("El promedio de las notas es: "+promedio);
    }
}
