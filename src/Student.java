
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        List<String> reg = Arrays.asList("181685983", "181685982", "181685981", "181685984", "181685985");
        Collections.sort(reg);

        for (String no : reg) {
            System.out.println(no);
        }
    }
}