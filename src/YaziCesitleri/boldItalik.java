package YaziCesitleri;

public class boldItalik {
    public static final String SET_ITALIC_TEXT = "\033[0;3m";
    public static final String SET_ALTICIZILI_TEXT = "\033[0;4m";
    public static final String SET_BOLD_TEXT = "\033[0;1m";


    public static String bold(String str) {
        return (SET_BOLD_TEXT + str + SET_ITALIC_TEXT);
    }

    public static void main(String[] args) {
        System.out.println(SET_BOLD_TEXT + "Bir Kral Daha" + SET_ITALIC_TEXT);
        System.out.println( SET_ITALIC_TEXT + "Bir Kral Daha" +  SET_ITALIC_TEXT);
        System.out.println( SET_ALTICIZILI_TEXT + "Bir Kral Daha" +  SET_ALTICIZILI_TEXT);

    }
}
