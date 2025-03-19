import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Station11 {

    public static void q1(Path inputFile, Path outputFile) {
        // ここから
        try {
            String content = Files.readString(inputFile);
            int i = Integer.parseInt(content);
            i *= 2;
            Files.writeString(outputFile, String.valueOf(i));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ここまで
    }
}
