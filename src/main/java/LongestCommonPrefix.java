import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    public static void main(String[] args) {

//        String[] strArr = {"table2blog","tableworld","tablebean","tabletemp"};

//        String[] strArr={"java2blog","javaworld","javabean","javatemp"};
//        String[] strArr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] strArr =  {"apple", "ape", "zebra"};

        Arrays.sort(strArr);

        int len = Math.min(strArr[0].length(), strArr[strArr.length-1].length());

        int i = 0;

        while (i < len && strArr[0].charAt(i) == strArr[strArr.length-1].charAt(i))
            i++;

        String prefix = strArr[0].substring(0, i);

        System.out.println("Longest common prefix is: " + prefix );


        String str = "abcdzdyrtertetdtw4ergdfg3453ergdfdrterdfgsrwe23543ersdsdvdbcbfdghdfgdxcvxcdfgsdsddffghd";
        String reversed = str.chars()
                .mapToObj(c -> (char)c)
                .parallel()
                .reduce("",
                        (s,c) -> c+""+s,
                        (s1,s2) -> s1+"!"+s2);

        System.out.println(Stream
                .of(str)
                .map(s->new StringBuilder(s).reverse())
                .collect(Collectors.joining("")));

        List<char[]> a = Stream.of(str.toCharArray()).sorted().collect(Collectors.toList());
        System.out.println(Arrays.toString(a.toArray()));
//        Arrays.stream()
//        System.out.println(reversed);




    }

}
