public class StringConcatWithBuilder {

    public static void main (String[] args) {
        
        long startTime = System.currentTimeMillis();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 100 * 1000; i++) {
            builder.append("a");
        }

        String message = builder.toString();
        
        long endTime = System.currentTimeMillis();

        System.out.println("    " + (endTime - startTime) + "ms");
    }
}

