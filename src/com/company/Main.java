package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    Scanner s3 = new Scanner(System.in);

        System.out.println("Введіть переш прізвище");
        String fr1 = s1.nextLine();

        System.out.println("Введіть друге прізвище");
        String fr2 = s2.nextLine();

        System.out.println("Введіть третє прізвище");
        String fr3 = s3.nextLine();

        if (fr1.equals(fr1) == fr2.equals(fr2) && fr2.equals(fr2) == fr3.equals(fr3)){
            System.out.println("Ваші прізвища індентичні!");
        }
        else{
            System.out.println("Ваші прізвища не індентичні, або у них різний регістр");
        }
    }
}