import java.util.Arrays;

public class IocTask {
    public static void main(String[] args) {
        float[] arr = {11.6f, 2.2f, 4.3f};
        String[] arrS = {"dsfds4", "ds2", "5ssadf"};

        int[] newIntFloat = sort(newIntArr(newFloatArr(arr)));
        int[] newIntString = sort(newStringArrNum(arrS));
        System.out.println(Arrays.toString(newIntFloat));
        System.out.println(Arrays.toString((newIntString)));

        int index = 0;
        for (int i = 0; i < newIntFloat.length; i++) {
            if (newIntFloat[i] > newIntString[i]) {
                System.out.println(index + " Наибольшее число " + newIntFloat[i]);
            } if (newIntFloat[i] < newIntString[i]) {
                System.out.println(index + " Наибольшее число " + newIntString[i]);
            } if (newIntFloat[i] == newIntString[i]){
                System.out.println(index + " Числа равны");
            }
            index++;
        }
    }

    public static float[] newFloatArr(float[] arr) {
        float[] newArr = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] - (int) arr[i];
        }
        return newArr;
    }

    public static int[] newIntArr(float[] arrF) {
        int[] newIntArr = new int[arrF.length];
        for (int i = 0; i < arrF.length; i++) {
            newIntArr[i] = (int) (arrF[i] * 10);
        }
        return newIntArr;
    }

    public static int[] newStringArrNum(String[] arrS) {
        String[] newArrNum = new String[arrS.length];
        int[] newInt = new int[arrS.length];
        for (int i = 0; i < arrS.length; i++) {
            newArrNum[i] = arrS[i].replaceAll("[A-Za-z]", "");
            newInt[i] = Integer.parseInt(newArrNum[i]);
        }
        return newInt;
    }

    private static int[] sort(int[] arr) {
        int[] sortArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortArr[i] = arr[i];
        }
        for (int i = 0; i < sortArr.length; i++) {
            for (int j = 0; j < sortArr.length; j++) {
                if (sortArr[i] >= sortArr[j]) {
                    int x = sortArr[i];
                    sortArr[i] = sortArr[j];
                    sortArr[j] = x;
                }
            }
        }
        return sortArr;
    }
}
