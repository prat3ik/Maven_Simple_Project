import org.apache.commons.lang3.StringUtils;

public class Helloq {

    public static void main(String[] args) {
        System.out.println("Hello to maven dependency project");
        String string_which_is_to_be_reversed = StringUtils.reverse("ABC");
        System.out.println(string_which_is_to_be_reversed);
    }
}
