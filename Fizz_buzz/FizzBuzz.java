package Fizz_buzz;

public class FizzBuzz {
    int max;
        public FizzBuzz(int max) {
        this.max = max + 1;
    }
        public void start(){
        int i = 1;
        while(i != max){
            if( i % 5==0 && i % 3 == 0 ){
                System.out.println("fizzbuzz");
            }
            else if(i % 5 == 0){
                System.out.println("buzz");
            }
            else if(i%3 == 0){
                System.out.println("fizz");
            }
            else{
            System.out.println(i);
            }
            i++;
        }
    
    }
    
}
