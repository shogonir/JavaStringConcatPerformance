public class StringConcatWithOperator {

    public static void main (String[] args) {
        
        long startTime = System.currentTimeMillis();

        String message = "";

        for (int i = 0; i < 100 * 1000; i++) {
            message += "a";
        }
        
        long endTime = System.currentTimeMillis();

        System.out.println("    " + (endTime - startTime) + "ms");
    }
}

