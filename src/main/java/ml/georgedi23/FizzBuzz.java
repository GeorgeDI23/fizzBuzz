package ml.georgedi23;

public class FizzBuzz {

    public Boolean fizz(int givenInt){
        if(givenInt % 3 == 0){
            return true;
        }
        return false;
    }

    public Boolean buzz(int givenInt){
        if(givenInt % 5 == 0){
            return true;
        }
        return false;
    }

    public Boolean fizzBuzz(int givenInt){
        if(fizz(givenInt) && buzz(givenInt)){
            return true;
        }
        return false;
    }

    public String fizzBuzzAsString(Integer givenInt){
        if(fizzBuzz(givenInt)){
            return "fizzBuzz";
        } else if(fizz(givenInt)){
            return "fizz";
        } else if(buzz(givenInt)){
            return "buzz";
        } else{
            return givenInt.toString();
        }
    }

    public String[] fizzBuzzArray(int[] givenIntArray){
        String[] fizzBuzzed = new String[givenIntArray.length];
        for(int i = 0; i < givenIntArray.length; i++){
            fizzBuzzed[i] = fizzBuzzAsString(givenIntArray[i]);
        }
        return fizzBuzzed;
    }
}
