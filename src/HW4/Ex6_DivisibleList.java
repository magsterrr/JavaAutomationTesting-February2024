package HW4;

public class Ex6_DivisibleList {

    public static void main(String[] args) {
         int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
         int num;

        for (int i = 0; i < list.length; i++) {
            num = list[i];

            if (num > 150) {
                break;
            }
            if ((num % 5) == 0) {
                System.out.println(num);
            }
        }
    }
}
