public class FizzBuzz_AUTOMATED {
    public static void main(String[] args){

        int myFizz = 1;
        // Add a for loop which includes the number of times to check fizz/buzz
        while ( myFizz < 100){

            System.out.println(myFizz);
            if(myFizz % 3 == 0 && myFizz % 5 == 0){
                System.out.println(myFizz);
            } else if(myFizz % 3 == 0 && myFizz % 5 == 0){
                System.out.println("FIZZ-BUZZ");
            } else if(myFizz % 3 == 0){
                System.out.println("FIZZ");
            } else{
                System.out.println("---");
            }
             myFizz++;
        }
    }
}