import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // TreeMap Kullanarak Bir Stringin İçindeki Harflerin Frekansını bulma

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Cümlenizi Giriniz : ");
        String cumle = scanner.nextLine();

        Map<Character, Integer> frekans = new TreeMap<>();

        for (int i = 0; i < cumle.length(); i++) {
            char c = cumle.charAt(i);

            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1);
            }
            else {
                frekans.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : frekans.entrySet()){
            System.out.println("Karakter : "+entry.getKey()+" "+entry.getValue()+" kere geçiyor...");
        }
    }
}
