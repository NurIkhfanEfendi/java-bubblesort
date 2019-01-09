/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat_2_bubblesort;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Lat_2_bubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] bilangan = {4, 9, 1, 20};
        System.out.println("Bilangan sebelum di sorting Bubble sort : "+Arrays.toString(bilangan));
        
        System.out.println("\nProses Bubble sort secara ascending : ");
        for(int a=0;a<bilangan.length;a++){
            
            System.out.println("Iterasi "+(a+1));
            for (int b=0;b<bilangan.length-1;b++){ if (bilangan[b]<bilangan[b+1]){
                int temp = bilangan [b];
                bilangan [b]=bilangan[b+1];
                bilangan [b+1]= temp;
            }
            System.out.println(Arrays.toString(bilangan));
    }
              System.out.println();
        }
        System.out.println("Hasil akhir setelah di sorting : "+Arrays.toString(bilangan));
    }
    
}
