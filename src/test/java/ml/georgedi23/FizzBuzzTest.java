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

        //When
        boolean actual = fizzBuzzer.fizz(givenInt);

        //Then
        assertTrue(actual);
    }

    @Test
    public void fizzNoFizzTest(){
        //Given
        int givenInt = 5;

        //When
        boolean actual = fizzBuzzer.fizz(givenInt);

        //Then
        assertFalse(actual);
    }

    @Test
    public void buzzTest(){
        //Given
        int givenInt = 5;

        //When
        boolean actual = fizzBuzzer.buzz(givenInt);

        //Then
        assertTrue(actual);
    }

    @Test
    public void buzzNoBuzzTest(){
        //Given
        int givenInt = 3;

        //When
        boolean actual = fizzBuzzer.buzz(givenInt);

        //Then
        assertFalse(actual);
    }

    @Test
    public void fizzNBuzzTest(){
        //Given
        int givenInt = 15;

        //When
        boolean actual = fizzBuzzer.fizzBuzz(givenInt);

        //Then
        assertTrue(actual);
    }

    @Test
    public void fizzNBuzzJustFizzTest(){
        //Given
        int givenInt = 3;

        //When
        boolean actual = fizzBuzzer.fizzBuzz(givenInt);

        //Then
        assertFalse(actual);
    }

    @Test
    public void fizzNBuzzJustBuzzTest(){
        //Given
        int givenInt = 5;

        //When
        boolean actual = fizzBuzzer.fizzBuzz(givenInt);

        //Then
        assertFalse(actual);
    }

    @Test
    public void fizzNBuzzNoFizzBuzzTest(){
        //Given
        int givenInt = 2;

        //When
        boolean actual = fizzBuzzer.fizzBuzz(givenInt);

        //Then
        assertFalse(actual);
    }
}
