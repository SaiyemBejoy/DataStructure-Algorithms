package data_structure;

public class CharFinderMain {
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);

        var chr = finder.findFirstRepeatingChar("a green apple");
        System.out.println(chr);
    }
}
