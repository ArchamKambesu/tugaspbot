/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbot;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public abstract class MuiltiPlication implements  Runnable{
     private int number;
     
     public MuiltiPlication(int number){
         this.number=number;
     }
     public void run(){
         for (int i = 0; i < 10; i++) {
             System.out.printf("%s:%d*%d=%d\n",Thread.currentThread().getName(),number,i,i*number); 
         }
     }
     public static void main(String[] args) {
         System.out.println("Program Menghitung Ganjil/Genap");
        Scanner input = new Scanner(System.in);
        int bil;
        int i;
        int a;
        System.out.print("Masukan Banyak Bilangan  : ");
        bil = input.nextInt();
        for (i = 1; i <= bil; i++) {
            System.out.println("Masukan Bil :");
            a = input.nextInt();

            if (a % 2 == 0) {
                System.out.println("Genap");
            } else if (a % 2 == 1) {
                System.out.println("Ganjil");

             MuiltiPlication mul = new MuiltiPlication(i) {};
             Thread thread = new Thread(mul);
             thread.start();
             }
             
         }
     }
}
    


