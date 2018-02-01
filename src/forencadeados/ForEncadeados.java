/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forencadeados;

/**
 *
 * @author meumd
 */
public class ForEncadeados {

    /**
     * @param args the command line arguments Exercicio Apostila Java Caelum
     * Imprima a seguinte tabela, usando for's encadeados: 
     * 1 
     * 2 4
     * 3 6 9
     * 4 8 12 16
     * n n*2 n*3 ... n*n
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        int y = 0;
        
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {
            //       1      1   1
            //       1      1   2
                y = i * j;
            //  1 = 1 * 1
            //  2 = 2 * 1
            //  4 = 2 * 2
                System.out.print(y + " ");
            //                   1
            //                   2 4
            }
            System.out.println(" ");
        }    
    }

}
