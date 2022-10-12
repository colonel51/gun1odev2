public class Main {
    public static void main(String[] args) {
       int number1 = 20;
       int number2 = 555;
       int number3 = 2222;
       int biggest = number1;

       if (number1 < number2){
           biggest = number2;
       }
       if (number2 < number3){
           biggest = number3;
       }
       System.out.println("The biggest number is :"+biggest);
    }
}