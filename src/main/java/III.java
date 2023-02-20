public class III {
    public static void main(String[] args) throws Exception{
    new III().x();
    }

    private void x() throws Exception{
        int o = 9/0;
        try {
            int i = 9/0;
        }
        finally {
            System.out.println("In Finally");
        }
        System.out.println("Outside finally");
    }
}
