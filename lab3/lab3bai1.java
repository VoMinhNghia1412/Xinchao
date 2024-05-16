/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab3bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên dương: ");
        int N = scanner.nextInt();

        boolean isPrime = true;

        if (N <= 1) {
            isPrime = false; // Không phải số nguyên tố nếu N <= 1
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    isPrime = false; // Không phải số nguyên tố nếu chia hết cho số khác i
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(N + " là số nguyên tố.");
        } else {
            System.out.println(N + " không là số nguyên tố.");
        }
    }
}
