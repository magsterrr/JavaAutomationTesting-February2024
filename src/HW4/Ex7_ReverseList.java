package HW4;

public class Ex7_ReverseList {

    public static void main(String[] args) {

        int[] list = {10, 20, 30, 40, 50};
        int num;

        for (int i = list.length -1; i >= 0; i--) {
            num = list[i];
            System.out.println(num);
        }

    }
}
