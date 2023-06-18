package mandatoryHomeWork.week5.day1;

import java.util.ArrayList;
import java.util.List;

public class unabletoeatLunvh {

    public static void main(String[] args) {

       int[] students = {1,1,0,0}, sandwiches = {0,1,0,1};

        countStudents(students,sandwiches);

    }

    public static int countStudents(int[] students, int[] sandwiches) {

        int j = 0;
        int count = 0;
        List<Integer> arr = new ArrayList<>();

        for (int student : students) {
            arr.add(student);
        }


        while (j <= sandwiches.length - 1) {

            if (arr.get(0) == sandwiches[j]) {
                arr.remove(0);
                j++;
                count = 0;
            } else if (arr.get(0) != sandwiches[j]) {
                arr.add(arr.get(0));
                arr.remove(0);
                count++;
            }

            if (j == sandwiches.length || count == arr.size()) {
                return count;
            }


        }

        return 0;
    }
}
