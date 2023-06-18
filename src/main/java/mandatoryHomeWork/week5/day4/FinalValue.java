package mandatoryHomeWork.week5.day4;

public class FinalValue {

    public static void main(String[] args) {

        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(FinalValueOPR(operations));
    }

           // ++X and X++ increments the value of the variable X by 1
           // --X and X-- decrements the value of the variable X by 1

    public static int FinalValueOPR(String[] operations) {
        if (operations.length == 0) {
            return 0;
        }
        int output = 0;
        for (String action : operations) {
            switch (action) {
                case "++X" -> ++output;
                case "X++" -> output++;
                case "--X" -> --output;
                case "X--" -> output--;
            }
        }
        return output;
    }
}
