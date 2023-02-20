import java.util.Arrays;

public class SubstringExample {
    public static void main(String[] args) {
        String s = "Ram ";
//        System.out.println(Arrays.toString(s.split(" ")));

        int i = s.indexOf(" ");
        System.out.println(i);
        String  ss = i!=-1 ? s.substring(0,i) : s;
        String sss = i!=-1 ? s.substring(i+1) : "";
        System.out.println("f:  " + ss.trim());
        System.out.println("l:" + sss.trim());


    }
}
