public class CheckIfStringsAreSame {
    public static void main(String[] args) {
        String str1 = "My Name Is Loyed!";
        String str2 = "My name is Loyed!";

        //Considers Alphabet Case
        System.out.println(str1.equals(str2));

        //Ignores Alphabets case
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
