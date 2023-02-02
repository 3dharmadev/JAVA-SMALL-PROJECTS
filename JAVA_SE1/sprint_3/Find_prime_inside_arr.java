package java111.sprint_3;

import java.util.ArrayList;
import  java.lang.Integer;

public class Find_prime_inside_arr{
        public ArrayList<Integer> findAndReturnPrimeNumbers(int[] inputArray) {
//write the logic to iterate through the supplied inputArray and return array of prime

            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < inputArray.length; i++) {
                if (searchForPrime(inputArray[i])) arr.add(inputArray[i]);
            }
            return arr;
//if no prime number is found then return the empty array.
        }
        public  boolean searchForPrime(int a){
            int count=0;
            for (int i=1;i<=a;i++){
                if(a%i==0){
                    count++;
                }
            }
            if(count==2) return true;
            else return  false;
        }

        public static void main(String[] args){
//Create the object of Main class
//on the object of Main class call the findAndReturnPrimeNumbers method
//by supplying the following array as the parameter
            int[] arr = {10,12,5,50,11,14,15};
            // int[] arr={1,4,8,9};

            Find_prime_inside_arr obj=new Find_prime_inside_arr();
            ArrayList<Integer> hold=obj.findAndReturnPrimeNumbers(arr);

            if(hold.size()==0){
                System.out.println("Prime number not found in the supplied Array");
            }
            else {
                for (int i:  hold) {
                    System.out.print(i+" ");
                }
            }


//print each element from the returned array of findAndReturnPrimeNumbers method
//if findAndReturnPrimeNumbers method returns an empty array then print the following
//            message:
// "Prime number not found in the supplied Array"
        }
    }

