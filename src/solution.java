public class solution {
    //////////////////// if user Enter number between 1-5 print Working day, if 6-7 print Weekend, Else print Invalid //////////////

    public String fizzBuzz(int day) {
        /**
         Another Solution
         */
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Working day");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Invalid");
//        }
//        return day;
//    }

        String status = (day <= 5 && day >= 1) ? "Working day" : (day <= 7 && day >= 6) ? "Weekend" : "Invalid";
        return status;
    }

}
