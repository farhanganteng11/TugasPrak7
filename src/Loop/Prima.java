/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loop;

/**
 *
 * @author Administrator
 */
public class Prima {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nBilangan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
