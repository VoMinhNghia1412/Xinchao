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
public class lab3bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] names = new String[n];

        double[] scores = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            names[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        
        System.out.println("Thông tin sinh viên:");
        for (int i = 0; i < n; i++) {
            String performance;
            if (scores[i] < 5) {
                performance = "Yếu";
            } else if (scores[i] < 6.5) {
                performance = "Trung bình";
            } else if (scores[i] < 7.5) {
                performance = "Khá";
            } else if (scores[i] < 9) {
                performance = "Giỏi";
            } else {
                performance = "Xuất sắc";
            }
            System.out.println("Họ và tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + performance);
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        // Xuất danh sách sinh viên sau khi sắp xếp
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo điểm:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ và tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
        }
    }
}
