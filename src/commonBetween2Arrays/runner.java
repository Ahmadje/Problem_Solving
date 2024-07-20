package commonBetween2Arrays;
////////////// Get Sum of Grades and break when user enter -1 ///////////////

public class runner {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 6, 2, 3, 7, 9, 0};
        int[] arr2 = new int[]{8, 11, 23, 3, 7, 19, 20, 30};
        int size = 0;
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    int num = arr1[i];
                    arr3[i] = num;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            if(!(arr3[i] ==0))
            System.out.println(arr3[i]);
        }

    }
}

