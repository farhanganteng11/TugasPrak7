/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loop;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Tabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = input.nextInt();
        
        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 dan 10.");
            return;
        }

        System.out.print("    "); 
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i); 
        }
        System.out.println();

        System.out.print("   +");
        for (int i = 1; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println("+");

        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i); 
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j); 
            }
            System.out.println();
        }
    }
}
