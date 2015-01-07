package kata;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class KataRange {

    public static final String PREFIX_START = "[";
    public static final String SUFFIX_END = "]";
    private String input;
    public KataRange(String input) {
        this.input = input;
    }

    public boolean isStartWithInclusive() {
        return input.startsWith(PREFIX_START);
    }

    public boolean isEndWithInclusive() {
        return input.endsWith(SUFFIX_END);
    }

    public int getStartRange() {
        int result = Integer.parseInt(String.valueOf(input.charAt(1)));
        if(!isStartWithInclusive()) {
            result++;
        }

        return result;
    }
}
