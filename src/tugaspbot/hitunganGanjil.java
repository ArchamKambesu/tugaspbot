/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbot;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author hp
 */
public class hitunganGanjil {
    public String bil;

public void setName(String newName){
    bil = newName;
}
    public String getName(){
        return bil;
        
    }
   
public static void main(String[] args) {
ExecutorService service=Executors.newFixedThreadPool(6);
for (int i = 1; i < 6; i++){
    service.submit(new NewClass(1));
    hitunganGanjil bil=new hitunganGanjil();
    bil.setName("Bilangan Ganjil");
    for (int angka = 1; angka <100; angka=angka+2){
        System.out.println(angka+bil.getName());
        
    }
}
System.out.println("****Submit task dibuat*****");
service.shutdown();

try{
    service.awaitTermination(1, TimeUnit.DAYS);
}catch(InterruptedException e){
    e.printStackTrace();
}
System.out.println("halo halo halo");

}

}



    

