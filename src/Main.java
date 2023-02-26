import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr[0] + arr[1] + arr[2]); // получила сумму элементов массива
        System.out.println(arr[2] / arr[0]); // получила частное (третий элемент разделен на первый элемент
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        double[] doubleArr = new double[]{1.57, 7.654, 9.986};
        System.out.println(doubleArr[0]);
        System.out.println(doubleArr[1]);
        System.out.println(doubleArr[2]);
        boolean[] booleanArr = new boolean[3];
        System.out.println(booleanArr[1]);
        System.out.println(booleanArr[0]);
        System.out.println(booleanArr[2]);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = new int[5];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " , ");
        }
        double[] doubleArr = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < doubleArr.length; i++) {
            if (i == doubleArr.length - 1) {
                System.out.println(doubleArr[i]);
                break;
            }
            System.out.print(doubleArr[i] + " , ");
        }
        boolean[] booleanArr = new boolean[4];
        for (int i = 0; i < booleanArr.length; i++) {
            if (i == booleanArr.length - 1) {
                System.out.println(booleanArr[i]);
                break;
            }
            System.out.print(booleanArr[i] + " , ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = new int[5];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
        }
        for (int index = arr.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arr[index]);
                break;
            }
            System.out.print(arr[index] + " , ");
        }
        double[] doubleArr = new double[]{1.57, 7.654, 9.986};
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(doubleArr[i]);
                break;
            }
            System.out.print(doubleArr[i] + " , ");
        }

        String[] StringArr = {"ромашка", "василек", "тюльпан" };
        System.out.println(Arrays.toString(StringArr) + " исходный массив");
        for (int i = StringArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(StringArr[i]);
                break;
            }
            System.out.print(StringArr[i] + " , ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[5];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index + 1;
        }
        System.out.println(Arrays.toString(arr) + " исходный массив");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr) + " нечетные числа массива увеличены на 1");

        System.out.println("Задача 4. Другой способ.");
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr2) + " исходный массив");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 != 0) {
                arr2[i] = arr2[i] + 5;
            }
        }
        System.out.println(Arrays.toString(arr2) + " нечетные числа массива увеличены на 5");
    }
}

















