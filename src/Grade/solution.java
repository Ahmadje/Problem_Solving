package Grade;
////////// Get user Grade if >= 90 >>> A Grade , if >= 80 >>> B Grade, if >= 70 >>> C Grade , if >= 60 >>> D Grade , Else Print Fail ///////////

public class solution {
    public String getGrade(int n) {
        /**
         Another Solution
         */
//        // ans list
//        if (n >= 90 && n < 100) {
//            System.out.println("A Grade");
        String Mark = (n >= 90 && n < 100) ? "A Grade"
                : (n < 90 && n >= 80) ? "B Grade"
                : (n < 80 && n >= 70) ? "C Grade"
                : (n < 70 && n >= 60) ? "D Grade"
                : (n >= 0 && n < 60) ? "Fail" : "unexpected";

        return Mark;
    }
}