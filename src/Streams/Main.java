package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("hi", "hello", "janne", "hejdå", "tjo");
        words.forEach(s -> System.out.println(s + "  "));
        words.forEach(System.out::println);

        List<String> excitingWords = words.stream().map(s -> s + "!").collect(Collectors.toList());
        excitingWords.forEach(System.out::println);
        System.out.println("------");

        List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
        eyeWords.forEach(System.out::println);
        System.out.println("------");

        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCaseWords.forEach(System.out::println);

        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        shortWords.forEach(System.out::println);
        System.out.println("------");

        List<String> wordsWithB = words.stream().filter(s -> s.contains("e")).collect(Collectors.toList());
        wordsWithB.forEach(System.out::println);
        System.out.println("------");

        List<String> evenLengthWords = words.stream().filter(s -> (s.length() % 2 == 0)).collect(Collectors.toList());
        evenLengthWords.forEach(s -> System.out.println(s + "\n------"));

        String result1 = firstFunnyString(words, "E");
        System.out.println("Uppercase short word with 'E': " + result1);
        String result2 = firstFunnyString(words, "Q");
        System.out.println("Uppercase short word with 'Q': " + result2);
        
        String[] stringArray = words.stream().toArray(String[]::new);
        for (String string : stringArray) {
            System.out.println(string);
        }
        
        
         
    }

    public static String firstFunnyString(List<String> words, String containedTest) {
        String result
                = words.stream()
                        .map(String::toUpperCase)
                        .filter(s -> s.length() < 4)
                        .filter(s -> s.contains(containedTest))
                        .findFirst().orElse("No match");
        return (result);
    }
}
