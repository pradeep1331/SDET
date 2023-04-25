package HandsOnDay2;

public class AddDigit {
    public static void main(String[] args) {

        lstDgt(38);
        lstDgt(0);
        lstDgt(2);

    }

    public static void lstDgt(int num) {

        if (num > 10) {

            while (num > 10) {
                int ans = 0;
                while (num > 0) {
                    ans += num % 10;
                    num = num / 10;
                }
                num = ans;

            }
            System.out.println(num);
        } else {
            System.out.println(num);
        }

    }
}
