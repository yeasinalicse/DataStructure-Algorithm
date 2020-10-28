public class Algorithm_java {
    public static void main(String[] args) {
        int[] arrayofValue = {8, 1, 2, 7, 3, 4, 5, 6};
        int searchValue = 7;
        //linear search value
        if (linearSearchByValue(arrayofValue, searchValue) >= 0) {
            System.out.println("Index ->" + linearSearchByValue(arrayofValue, searchValue) + " Value -> " + arrayofValue[linearSearchByValue(arrayofValue, searchValue)]);
        } else {
            System.out.println("search value not found!!!");
        }

        //selection shot
        printArray("Before : ",arrayofValue);
        int[] selectionSortArray = selectionSort(arrayofValue, searchValue);
        printArray("After: ",selectionSortArray);

    }

    public static int linearSearchByValue(int[] arrayofValue, int searchValue) {
        for (int i = 0; i < arrayofValue.length; i++) {
            if (arrayofValue[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }



    public static int[] selectionSort(int[] arrayofValue, int sortingValue) {
        int firstLoop, secondLoop, minIndex, temValue;
        for (firstLoop = 0; firstLoop < sortingValue - 1; firstLoop++) {
            minIndex = firstLoop;
            for (secondLoop = firstLoop + 1; secondLoop < sortingValue; secondLoop++) {
                if (arrayofValue[minIndex] > arrayofValue[secondLoop]) {
                    minIndex = secondLoop;
                }
            }
            if (minIndex != firstLoop) {
                temValue = arrayofValue[firstLoop];
                arrayofValue[firstLoop] = arrayofValue[minIndex];
                arrayofValue[minIndex] = temValue;
            }
            printArray("per change: "+firstLoop+"> ",arrayofValue);


        }
        return arrayofValue;
    }
    static void printArray(String msg,int arr[]) {
        int n = arr.length;
        System.out.print(" "+msg);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
