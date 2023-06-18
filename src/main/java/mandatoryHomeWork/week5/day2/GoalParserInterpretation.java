package mandatoryHomeWork.week5.day2;

public class GoalParserInterpretation {

    public static void main(String[] args) {

        System.out.println(gparser("G()(al)"));

    }

    public static String gparser(String gvn){



        String gvn1 = gvn.replaceAll("\\(\\)","o");


        return gvn1.replaceAll("\\(al\\)","al");

    }
}
