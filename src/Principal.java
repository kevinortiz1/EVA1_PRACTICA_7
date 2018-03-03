/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     * CREAR UN ARREGLO CON 50 ELEMENTOS, LLENARLO CON VALORES ALEATORIOS ENTRE 1
       Y 100, E IMPRIMIR EL VALOR MÁS PEQUEÑO Y MÁS GRANDE EN EL ARREGLO (Y SU
       POSICIÓN)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iArre[] = new int [50];
        for (int i = 0; i < iArre.length; i++) {
            iArre[i] = (int) (Math.random() * 100 ) + 1;
        }
        //IMPRIMIR EL ARREGLO
          System.out.println("IMPRIMIR EL ARREGLO");
          for (int i = 0; i < iArre.length; i++) {
              System.out.print("[" + iArre[i] + "]");
        }
          System.out.println("");
        //IMPRIMIR VALOR MAS PEQUEÑO
        int iMin = 0;
        int iPosMin = 0;
        for (int i = 0; i < iArre.length; i++) {
            if (i == 0) {
                iMin = iArre[i];
            } else {
                if (iMin >= iArre[i]) {
                    iMin = iArre[i];
                    iPosMin = i;
                }
            }
        }
        System.out.println("VALOR MAS PEQUEÑO ES " + iMin + " Y ESTA EN LA POSICIÓN " + (iPosMin + 1));
        //IMPRIMIR VALOR MAS GRANDE
        int iMax = 0;
        int iPosMax = 0;
        for (int i = 0; i < iArre.length; i++) {
            if (i == 0) {
                iMax = iArre[i];
            } else {
                if (iMax <= iArre[i]) {
                    iMax = iArre[i];
                    iPosMax = i;
                }
            }
        }
        System.out.println("VALOR MAS GRANDE ES " + iMax + " Y ESTA EN LA POSICIÓN " + (iPosMax + 1));
        
    }
    
}
