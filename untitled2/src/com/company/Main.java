package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	System.out.println("Kovrina Alena");

        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int array[][] = new int[sz][sz];
        for (int i=0;i<sz;i++){
            for (int j=0; j<sz;j++){

                array[i][j]=((int) (Math.random() * 10));
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<array.length;i++){
            int end = array.length-1;
            int m=0;
            for(int j=0;j<array.length-m;j++){
                while(array[i][end]==0){   //проверка есть ли 0
                    end--; // энд -1
                    m++; // '0' + 1
                }
                if(array[i][j]==0){
                    array[i][j]=array[i][end];
                    array[i][end]=0;
                    end--;
                    m++;
                }
            }

        }
        System.out.println();
        System.out.println();
        for (int i=0;i<sz;i++){
            for (int j=0; j<sz;j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
