public class regex {
    public static void main(String[] args) {
        String str = "Mak.s.im i.s m..y s.a.n";
        String str2 = str.replaceAll("[.]", "");
        System.out.println(str2);
    }

}
