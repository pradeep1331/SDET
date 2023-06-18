package mandatoryHomeWork.week2.day3;

public class MaxPrdTwoNum {

    public static void main(String[] args) {

        int[] gvn = {3,4,5,2};
        int[] gvn1 = {1,5,4,5};
        int[] gvn2 = {3,7};

        System.out.println(returnMax(gvn));
        System.out.println(returnMax(gvn1));
        System.out.println(returnMax(gvn2));

    }

    public static int returnMax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        int maxNum = arr[arr.length-1];
        int secMaxNum = arr[arr.length-2];

        return (maxNum-1)*(secMaxNum-1);


    }

}
