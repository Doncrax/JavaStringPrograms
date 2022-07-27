import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToString {
    public static void main(String[] args) {
        String[] strArray = {"My", "name", "is", "Loyed", "Eldon", "Crasta", "."};

        String str1 = convertArrayToStringUsingToString(strArray);
        System.out.println("To String Method " +str1);
        String str2 = convertArrayToStringUsingAppend(strArray);
        System.out.println("String Builder Append " +str2);
        String str3 = convertArrayToStringUsingJoin(strArray);
        System.out.println("Join Method : " +str3);
        String str4 = convertArrayToStringUsingCollectorsJoining(strArray);
        System.out.println("Collectors Joining : " +str4);

    }

    //Using Arrays.toString Method.
    public static String convertArrayToStringUsingToString(String[] strArray){
        String str = Arrays.toString(strArray);
        return str;
    }

    public static String convertArrayToStringUsingAppend(String[] strArray){
        StringBuilder sBuilder = new StringBuilder();
        for(int i = 0; i< strArray.length; i++){
             sBuilder.append(strArray[i]);
        }
        return sBuilder.toString();
    }

    public static String convertArrayToStringUsingJoin(String[] strArray){
        String str = String.join(" ", strArray);
        return str;
    }

    public static String convertArrayToStringUsingCollectorsJoining(String[] strArray){
        String str = Arrays.stream(strArray).collect(Collectors.joining());
        return str;
    }
}
