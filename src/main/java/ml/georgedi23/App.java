package ml.georgedi23;

import java.util.Arrays;

/**
 * FizzBuzz implementation
 * Fizz for 3
 * Buzz for 5
 */
public class App 
{
    public static void main( String[] args )
    {
        FizzBuzz fizzBuzzer = new FizzBuzz();
        int[] givenArray = new int[100];
        for(int i = 0; i < 100; i++){
            givenArray[i] = i+1;
        }

        String[] fizzBuzzedArray = fizzBuzzer.fizzBuzzArray(givenArray);
        System.out.println(Arrays.toString(fizzBuzzedArray));
    }
}
