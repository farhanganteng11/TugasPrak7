/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loop;

/**
 *
 * @author Administrator
 */
public class GanjilGenap {
    public static void main(String[] args) {
        System.out.println("Bilangan Genap dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("\nBilangan Ganjil dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
