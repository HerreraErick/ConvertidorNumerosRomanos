/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidornumerosromanos;
import javax.swing.JOptionPane;

/**
 *
 * @author Erick Ushiromiya
 */
public class ConvertidorNumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String LN; 
      int N;
      do {
             LN = JOptionPane.showInputDialog("Introduce un número entre 1 y 1000: ");
             N = Integer.parseInt(LN);
      } while (N < 1 || N > 1000);
      JOptionPane.showMessageDialog(null, N + " en numeros romanos -> " + convertirNumerosRomanos(N));
  }
    
  public static String convertirNumerosRomanos(int numero) {
      int i, mil, centenas, decenas, unidades;
      String romano = "";
      
     //obtenemos cada cifra del número
      mil = numero / 1000;
      centenas = numero / 100 % 10;
      decenas = numero / 10 % 10;
      unidades = numero % 10;

     //mil
      for (i = 1; i <= mil; i++) {
             romano = romano + "M";
      }

     //centenas
      if (centenas == 9) {
          romano = romano + "CM";
      } else if (centenas >= 5) {
                     romano = romano + "D";
                     for (i = 6; i <= centenas; i++) {
                            romano = romano + "C";
                     }
      } else if (centenas == 4) {
                      romano = romano + "CD";
      } else {
                  for (i = 1; i <= centenas; i++) {
                         romano = romano + "C";
                  }
      }

     //decenas
      if (decenas == 9) {
           romano = romano + "XC";
      } else if (decenas >= 5) {
                      romano = romano + "L";
                      for (i = 6; i <= decenas; i++) {
                            romano = romano + "X";
                      }
      } else if (decenas == 4) {
                      romano = romano + "XL";
      } else {
                    for (i = 1; i <= decenas; i++) {
                           romano = romano + "X";
                    }
      }

     //unidades
      if (unidades == 9) {
           romano = romano + "IX";
      } else if (unidades >= 5) {
                      romano = romano + "V";
                      for (i = 6; i <= unidades; i++) {
                             romano = romano + "I";
                      }
      } else if (unidades == 4) {
                      romano = romano + "IV";
      } else {
                  for (i = 1; i <= unidades; i++) {
                         romano = romano + "I";
                  }
      }
      return romano;
    }
    
}
