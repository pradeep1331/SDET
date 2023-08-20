package TwoPointerrework;

import java.util.Arrays;

public class DividePlayers {

    public static void main(String[] args) {

        int[] skill = {3,2,5,1,3,4};

        System.out.println(dividePlayers(skill));


    }

    public static long dividePlayers(int[] skill) {
        if (skill.length < 2) {
            return -1;
        }

        Arrays.sort(skill);
        int n = skill.length - 1;

        int matcher = skill[0] + skill[n];

        int left = 0;
        int right = n;

        long result = 0;

        while (left < right) {
            if (skill[left] + skill[right] == matcher) {
                result += (long) skill[left] * skill[right];
                left++;
                right--;
            } else {
                return -1;
            }
        }

        if (result == 0) {
            return -1;
        } else {
            return result;
        }
    }
}
