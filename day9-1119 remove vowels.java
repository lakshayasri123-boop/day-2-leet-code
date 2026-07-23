public class Main {
    public static void main(String[] args) {

        String s = "dhaanishkancheepuram";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                ans.append(c);
            }
        }

        System.out.print("Output: " + ans);
    }
}
      
