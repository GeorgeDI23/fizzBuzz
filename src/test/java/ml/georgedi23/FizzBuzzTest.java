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

    @Test
    public void fizzBuzzAsStringFizzTest(){
        //Given
        int givenInt = 3;
        String expected = "fizz";

        //When
        String actual = fizzBuzzer.fizzBuzzAsString(givenInt);

        //then
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzAsStringBuzzTest(){
        //Given
        int givenInt = 5;
        String expected = "buzz";

        //When
        String actual = fizzBuzzer.fizzBuzzAsString(givenInt);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzAsStringFizzBuzzTest(){
        //Given
        int givenInt = 15;
        String expected = "fizzBuzz";

        //When
        String actual = fizzBuzzer.fizzBuzzAsString(givenInt);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzAsStringNeitherTest(){
        //Given
        int givenInt = 2;
        String expected = "2";

        //When
        String actual = fizzBuzzer.fizzBuzzAsString(givenInt);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void fizzBuzzArrayTest(){
        //Given
        int[] givenIntArray = {1, 2, 3, 5, 8, 9, 12, 15, 30};
        String[] expected = {"1", "2", "fizz", "buzz", "8", "fizz", "fizz", "fizzBuzz", "fizzBuzz"};

        //when
        String[] actual = fizzBuzzer.fizzBuzzArray(givenIntArray);

        //then
        assertArrayEquals(expected, actual);
    }

}
