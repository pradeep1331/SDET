package HandsOnDay24;

public class needleandhaystack {

    public static void main(String[] args) {

        String haystack = "sadbutsad", needle = "sad";

        System.out.println(needlehaystack(haystack,needle));

    }

      public static int needlehaystack(String haystack ,String needle ){


          int needleLength= needle.length();
          int haystackLength= haystack.length();
          if(haystackLength<needleLength) return -1;
          StringBuilder pattern = new StringBuilder();
          int count = 0;

          for (int i = 0; i < needleLength; i++) {

              pattern.append(haystack.charAt(i));
          }

          if (pattern.toString().equals(needle)) count++;

          for (int i = needleLength; i < haystackLength; i++) {

              pattern.deleteCharAt(0);
              pattern.append(haystack.charAt(i));
              if (pattern.toString().equals(needle)) count++;
          }

            return count;
      }


}
