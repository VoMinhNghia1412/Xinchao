/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab3bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

       
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);

        
        int sum = 0;
        int count = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Trung bình cộng các phần tử chia hết cho 3 là: " + average);
    }
}
