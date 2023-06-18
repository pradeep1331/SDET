package HandsOnDay25;

public class MinimumCommonValue {

    public static void main(String[] args) {

        int [] nums1 = {1,2,3}, nums2 = {2,4};

    }

    public static int Min(int[] numarr1,int[] numarr2){

        int min = Integer.MAX_VALUE;

        int left = 0 ;
        int right = 0;

        while(left < numarr1.length && right < numarr2.length){

            if (numarr1[left] == numarr2[right]){

                min = Math.min(numarr1[left], min);
                left++;
                right++;
            } else if (numarr1[left] != numarr2[right] && numarr1[left] < numarr2[right] ) {

                 left++;

            }else {
                right++;
            }


        }

        if(min == Integer.MAX_VALUE){
            return -1;
        }else{
            return min;
        }


    }


}
