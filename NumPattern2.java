public class NumPattern2 {
    public static void main(String[] args) {

        /*
         * 1
         * 12
         * 123
         * 1234
         */
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");

        }
    }

}
