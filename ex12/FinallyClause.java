public class FinallyClause {
    static int count = 0;
    public static void main(String[] args) {
        while (true) {
            try {
                if (++count == 2) throw new Exception();
                if (count == 3) break;
                System.out.println("(" + count + ") No exception");
            } catch (Exception e) {
                System.out.println("(" + count + ") Exception occurred");
            } finally {
                System.out.println("(" + count + ") in finally clause");
            }
        } // end while
    System.out.println("Main program ends");
    }
}
