package Workingday_OR_Weekend;

public class solution {
    public String fizzBuzz(int day) {
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
