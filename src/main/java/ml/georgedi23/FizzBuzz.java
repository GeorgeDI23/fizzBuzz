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

    public String fizzBuzzAsString(int givenInt){
        return null;
    }
}
