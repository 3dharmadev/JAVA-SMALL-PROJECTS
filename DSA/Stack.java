package DSA301;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }

 public void push(int x){
     if(isFull()){
         System.out.println("overflow\nProgram Terminated");
         System.exit(-1);
     }
     System.out.println("Inserting "+x);
     arr[++top]=x;
 }

 public int pop(){
        if(isEmpty()){
            System.out.println("Underflow\nProgram Terminated");
          System.exit(-1);
        }
     System.out.println("removing "+peek());
        return arr[top--];
 }

 public int peek(){
        if(!isEmpty()){
            return  arr[top];
        }
        else{
            return -1;
        }
 }

 public int size(){
        return  top+1;
 }
 public boolean isEmpty(){
        return top==-1;
 }
 public boolean isFull(){
        return  top==capacity-1;
 }

}
