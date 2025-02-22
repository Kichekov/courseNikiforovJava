import java.util.Optional;

public class Task_7 {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);
        String result = optional.orElse("Default Value"); // Возвращается "Hello"
        System.out.println(result);
    }
}
