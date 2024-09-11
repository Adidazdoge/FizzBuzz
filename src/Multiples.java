class Multiples {

    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 1000; i++) {
            boolean div3 = i % 3 == 0;
            boolean div5 = i % 5 == 0;
            if (div3) {
                ans++;
            }
            else if (div5) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}
