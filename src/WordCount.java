import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

    static final String FILE_PATH = "src/Text";

    public static void main(String[] args) {
        System.out.println(getWordCount(FILE_PATH));
    }

    public static Map<String, Integer> getWordCount(String filePath){
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        try {
            List<String> text = Files.lines(Paths.get(FILE_PATH))
                    .flatMap(str -> Stream.of(str.toLowerCase().split("[ ,.!?():;\r\n0-9]")))
                    .filter(s -> s.length() > 0).collect(Collectors.toList());
            for (int i = 0; i < text.size(); i++) {
                int count = 0;
                for (String s : text) {
                    if (text.get(i).equals(s)) {
                        count++;
                    }
                }
                wordCountMap.put(text.get(i), count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCountMap;
    }

}
