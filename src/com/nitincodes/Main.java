package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*create a class car, having properties manufacturer and price and print the manufacturer which is selling
	the most expensive car.
	 */
        Scanner sc = new Scanner(System.in);
        Car arr[] = new Car[3];
        for(int i=0;i< arr.length;i++){
            arr[i] = new Car();
            arr[i].manufacturer = sc.next();
            arr[i].price = sc.nextInt();
            int max = arr[0].price;
            if(arr[i].price>max){
                max = arr[i].price;
                System.out.println(arr[i].manufacturer+" is selling the expensive car whose price is "+max);
            }

        }



    }
}
    class Car{
    String manufacturer;
    int price;
    }

