package practice.java;

import java.util.stream.Stream;

public class MapFlatMap {
    public static void main(String[] args) {
        String array[][] = new String[][]{{"z","x"},{"v","u"},{"m","l"},{"c","b"},{"a","d"},{"h","g"}};

        String[] result = Stream.of(array).flatMap(Stream::of).sorted().toArray(String[]::new);

        for(String string : result){
            System.out.print(string+" ");
        }
    }
}