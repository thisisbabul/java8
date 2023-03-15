package stream;

import java.util.Arrays;

public class LongestString {
    public static void main(String[] args) {
        String[] countries = {"Bangladesh", "India", "Pakistan", "Canada", "Sowdi Arabia"};
        String longestCountry = Arrays.stream(countries)
                .reduce((country1, country2) -> country1.length() > country2.length() ? country1 : country2)
                .get();
        System.out.println(longestCountry);
    }
}
