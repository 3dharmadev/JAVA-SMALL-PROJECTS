package java111.sprint_3;

import java.util.ArrayList;
import java.util.Arrays;

class CMD_line_arg{

      public static void main(String[] args) {
            int factorial=1;
          ArrayList<Integer> list=new ArrayList<Integer>();
         for (int i=0; i < args.length;i++) {
               if(args[i].equals("1")||args[i].equals("2")||args[i].equals("3")||args[i].equals("5")||
                       args[i].equals("6")||args[i].equals("7")||
                       args[i].equals("8")||args[i].equals("9")||args[i].equals("0")){
                   int change=Integer.parseInt(args[i]);

                   list.add(change);
               }

          }

     if(args.length==1){
             int k=Integer.parseInt(args[0]);
            for (int i=1;i<=k;i++){
                factorial*=i;
            }
            System.out.println(factorial);
     } else if (list.size()==2) {
        int abs= Math.abs(list.get(0)-list.get(1));
         for (int i=1;i<=abs;i++){
             factorial*=i;
         }
         System.out.println(factorial);
     }
     else{
         System.out.println("Error");
     }


      }
}
