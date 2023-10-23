package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int password;
        boolean isPasswordSucces = false;
        Scanner input = new Scanner(System.in);

        while (!isPasswordSucces) {
            System.out.print("Sifre Giriniz : ");
            password = input.nextInt();
            if (password == 123) {
                System.out.println("Sifre Doğru");
                isPasswordSucces=true;
            } else {
                System.out.println("Sifre yanlış Tekrar giriniz");
            }
        }
    }
}