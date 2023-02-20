public class EFG {
    public static void main(String[] args) {
     EFG efg = new EFG();
     String s = efg.h(11);
        System.out.println(s);

    }

    private String h(int x){
        try {
            String c = new String("ABC");
            if (x == 10)
                throw new  Exception("asdasd");
            return c;
        }
        catch (Exception ex){

        }
        System.out.println();
        return null;
    }
}
