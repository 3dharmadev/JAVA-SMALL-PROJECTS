package DSA301;

import java.util.HashMap;

public class String_Freq {
    public static void main(String[] args) {
        display(4,"aman");
    }
    public static  void display(int N,String str){
        //   let obj={};
//   for(let i=0;i<N;i++){
//       let char=str[i];
//       if(obj[char]==undefined){
//           obj[char]=1;
//       }
//       else{
//           obj[char]++;
//       }
//   }


        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            Character st=str.charAt(i);
            if(map.containsKey(st)) {
               // System.out.println(st+"contain");
                map.put(st,map.get(st)+1);
            }
            else {
               // System.out.println(st);
                map.put(st,1);
            }
        }
      //  System.out.println(map);

        String alphabet="abcdefghijklmnopqrstuvwxyz";
         for(int i=0;i<alphabet.length();i++){

       Character x = alphabet.charAt(i);
          if(map.containsKey(x)){
               System.out.println(x+"->"+map.get(x));
         }
      }
     }
    }

