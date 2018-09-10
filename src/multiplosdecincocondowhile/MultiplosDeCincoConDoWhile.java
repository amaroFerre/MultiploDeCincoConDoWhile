/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplosdecincocondowhile;

/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.
 *
 * @author Amarico
 */
public class MultiplosDeCincoConDoWhile {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here

    // Creo una variable de tipo entero, con el valor de -5
    int numero = -5;

    // Creo el bucle do-while
    do {
      // Al numero que le hemos dado un valor de -5 le voy sumando cinco
      numero = numero + 5;

      System.out.println(numero);

      // Al número le sumo 5 hasta que numero sea igual o mayor que 100
    } while (numero < 100);

  }

}
