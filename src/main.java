public class main {
    public static void main(String[] args) {
        int limit = 100;
        int count = 0;
        System.out.println("Numbers prime small 100");
        for (int n = 2; n < limit; n++) {
            boolean check = true;
            if (count < n) {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.print(n);
                    System.out.print(",");
                    count++;
                }
            } else
                break;
        }
    }
}
