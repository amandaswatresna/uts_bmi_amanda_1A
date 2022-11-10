/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bmimanda;
import java.util.Scanner;
public class Bmimanda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("Masukan Berat :");
        berat = input.nextInt();
        System.out.println("Masukan Tinggi :");
        tinggi = input.nextInt();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("bmi mu adlah "+ bmi);
        
        if (bmi<18.5){
        System.out.println("KURUS");
                }
        else if (bmi<24.9){
             System.out.println("NORMAL");
                }
        else if (bmi<28.9){
            System.out.println("GEMUK");
                }
        else {
                System.out.println("OBESITAS");
                }
    }
}