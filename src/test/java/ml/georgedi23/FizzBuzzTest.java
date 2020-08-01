package ml.georgedi23;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzzer;
    int[] input;

    @Before
    public void init(){
        fizzBuzzer = new FizzBuzz();
        input = new int[100];
        for(int i = 0; i < 100; i++){
            input[i] = i+1;
        }
    }
    @Test
    public void fizzTest(){
        //Given
        int givenInt = 3;
        String expected = "fizz";


        //When
        String actual = fizzBuzzer.fizz(givenInt);

        //Then
        assertEquals(expected, actual);

    }


}