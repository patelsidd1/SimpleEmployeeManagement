package question1;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {5,1,1,3,8,7, 2, 7, 2, 5, 9, 7, 3};

        int[] unique = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[index++] = arr[i];
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(unique[i] + " ");
        }
    }

}
