import java.io.File;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Min {

    public static void main(String[] args) {
        ClassLoader classLoader= Min.class.getClassLoader();
        File file =new File(classLoader.getResource("file.txt").getFile());

    }
}
