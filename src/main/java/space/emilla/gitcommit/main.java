package main.java.space.emilla.gitcommit;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).forEach((i) -> 
            System.out.println(Stream.generate(() -> "🍣").limit(i).collect(Collectors.joining(""))));
    }
}