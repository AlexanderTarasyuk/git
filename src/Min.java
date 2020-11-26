import java.io.File;
import java.io.ObjectInputStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Min {

    public static void main(String[] args) {
        ClassLoader classLoader = Min.class.getClassLoader();
        File file = new File(classLoader.getResource("file.txt").getFile());


        System.out.println("helo");
        System.out.println("helo");
        System.out.println("helo");
        System.out.println("helo");
//        IntStream.of(1, 2, 3, 4, 1, 2, 3, 6).collect(Collectors.groupingBy(value -> Integer.valueOf((Integer) value), Collectors.counting()))
//        IntStream.of(1, 2, 3, 4, 1, 2, 3, 6).collect(Collectors.groupingBy(value -> Integer.valueOf((Integer) value), Collectors.counting()))
//        IntStream.of(1, 2, 3, 4, 1, 2, 3, 6).collect(Collectors.groupingBy(value -> Integer.valueOf((Integer) value), Collectors.counting()))
    }
}
