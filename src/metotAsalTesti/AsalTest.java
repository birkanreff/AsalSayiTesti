package metotAsalTesti;

import java.util.Scanner;

public class AsalTest {

	
	
	  static boolean asalMi(int number , int i ){
	        if(number<=2){
	            return (number==2) ? true : false ;
	        }
	        if (number==i){
	            return true;
	        }
	        if (number % i == 0 ){
	            return false;
	        }
	        return asalMi(number,i+1);
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int number , i = 2;

	        do {
	            System.out.print("Sayı giriniz : ");
	            number = input.nextInt();
	            if (asalMi(number,i)){
	                System.out.println("Asal sayıdır !");
	            }else {
	                System.out.println("Asal sayı değildir!  ");
	            }
	        }while (number>=0);






	    }
	

}
