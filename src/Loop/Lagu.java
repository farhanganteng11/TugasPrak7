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
public class Lagu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int N = input.nextInt();

        for (int i = N; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
        }
    }
}
