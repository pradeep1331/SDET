package HandsOnDay2;

public class AddDigit {
    public static void main(String[] args) {

        lstDgt(38);
        lstDgt(0);
        lstDgt(2);
        lstDgt(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }

    public static void lstDgt(int num) {

        if (num > 10) {

            while (num >= 10) {
                int ans = 0;
                while (num > 0) {
                    ans += num % 10; // 123 12 1 0
                    num = num / 10;  //  12 1
                }
                num = ans;

            }
            System.out.println(num);
        } else {
            System.out.println(num);
        }

    }
}
