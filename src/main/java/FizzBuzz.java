//xxxx
public class FizzBuzz {

private int num;
    public FizzBuzz(int num) {
        this.num = num;
    }

    public String getResult() {
        String result = "";
        if(isFizzBuzz(num)) {
            result = "FizzBuzz";
        } else if(isFizz(num)) {
            result = "Fizz";
        } else if (isBuzz(num)) {
            result = "Buzz";
        } else {
            result = String.valueOf(num);
        }
        return result;
    }

    private boolean isFizzBuzz(int num) {
        return (num % 3 == 0 && num % 5 == 0);
    }

    private boolean isFizz(int num) {
        return (num % 3 == 0);
    }

    private boolean isBuzz(int num) {
        return (num % 5 == 0);
    }
}
