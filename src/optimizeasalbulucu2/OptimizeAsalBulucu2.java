/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optimizeasalbulucu2;

import java.util.Scanner;

/**
 *
 * @author necat
 */
public class OptimizeAsalBulucu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıç sayısını girin: ");
        int baslangic = Math.max(scanner.nextInt(), 2); // Başlangıç sayısını 2'den küçükse 2 olarak ayarla

        System.out.print("Bitiş sayısını girin: ");
        int bitis = scanner.nextInt();

        System.out.printf("%d  ile  %d  sayıları arasındaki asal sayılar:",baslangic,bitis);

        if (baslangic <= 2) {
            System.out.print("2 "); 
        }

        for (int i = (baslangic % 2 == 0 ? baslangic + 1 : baslangic); i <= bitis; i += 2) {
            if (isAsal(i)) {
                System.out.print(i + " ");
            }
        } // 2 den sonra yalnizca tek olan sayilari kontrol et    
    }

    // Bir sayının asal olup olmadığını kontrol eden metod
    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    
    }
    
}
