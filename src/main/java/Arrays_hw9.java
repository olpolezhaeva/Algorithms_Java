public class Arrays_hw9 {
    /**
     * 1. ������� �������� OddEven, ������� ��������� �� ���� ����� �����, ���������� �Odd�,
     * ���� ����� ��������, � �Even�, ���� ����� ������. �� ���� ��������� ������� ��������� ����� �Undefined�.
     * Test Data:
     * -345 ?  �Odd�
     * 0 ?  �Even�
     * 222222 ?  �Even�
     * 2147483647 + 1 ?  �Undefined�
     */
    public String oddEvenAlgorithm(int i) {
        if (i >= Integer.MAX_VALUE || i <= Integer.MIN_VALUE) {
            return "Undefined";
        } else if (i % 2 != 0) {
            return "Odd";
        } else {
            return "Even";
        }
    }

    /**
     * 2  �������� �������� OddIndices, ������� ��������� ������ �����,  � ���������� ������ �������� �������� ��������
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    public int[] oddIndixes(int[] array) {
        //��������� ������� �������� �������� � �������
        if (array.length > 0) {
            int countOdd = 0;
            for (int i = 1; i < array.length; i += 2) {
                countOdd++;
            }

            //�������� ����� ������ ���������� �� �������� ��������
            int[] arrayOfOddIndixes = new int[countOdd];
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    arrayOfOddIndixes[arrayOfOddIndixes.length - countOdd] = array[i];
                    countOdd--;
                }
            }
            return arrayOfOddIndixes;
        }
        return new int[]{};
    }

    /**
     * 3 �������� �������� SumArray, ������� ���������� ����� ���� ����� �������
     * <p>
     * Test Data:
     * {0, 1, 2, 3, 4, 5} ? 15
     * {-7, -3} ? -10
     */

    public int sumArray(int[] array) {
        int sumArray = 0;

        for (int i = 0; i < array.length; i++) {
            sumArray += array[i];
        }
        return sumArray;
    }

    //4. �������� �������� BiggerValue, ������� �� ���� ���������� ���� int ���������� ������� ��������.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999
    public int biggerValue(int x, int y) {
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }

    //5.�������� �������� IsPositiveNumber, ������� ���������� true,
    // ���� ���������  �������� ������ ��� ����� ����, � ���������� false, ���� �������� ������ 0.
    //��������� ������ ������ �� ������ 555, 0 � -555.

    public boolean isPositiveNumber(int x) {
        return x >= 0;
    }

    //6 �������� �������� AreNumbersEqual, ������� ��������� �� ���� 2 ����� int �����, � ����������
    //0, ���� ����� �����
    //-1, ���� ������ ����� ������ �������
    //1, ���� ������ ����� ������ �������

    public int areNumbersEqual(int x, int y) {
        if (x == y) {
            return 0;
        } else if (x < y) {
            return -1;
        } else {
            return 1;
        }
    }

    //7 Given an integer M perform the following conditional actions:
    //If M is multiple of 3 and 5 then return "Good Number".
    //If M is only multiple of 3 and not of 5 then return "Bad Number"
    //If M is only multiple of 5 and not of 3 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"
//    ��� ������ ����� M ��������� ��������� �������� ��������:
//    ���� M ������ 3 � 5, �� ������� "������� �����".
//    ���� M ������ ������ 3, �� �� 5, �� ������� "������ �����".
//    ���� M ������ ������ 5 � �� ������ 3, �� ������������ "������ �����".
//    ���� M �� ������������� �� ������ �� ����������������� �������, �� ������������ "-1".

    public String goodBAdPoorNumber(int m) {
        if (m % 3 == 0 && m % 5 == 0) {

            return "Good Number";
        } else if (m % 3 == 0 && m % 5 != 0) {

            return "Bad Number";
        } else if (m % 5 == 0 && m % 3 != 0) {

            return "Poor Number";
        } else {

            return "-1";
        }
    }

    //8 �������� �������� MinMaxAve, ������� ��������� ������ ����� int[]  � 2 �������� ��������.
    // �������� ���������� ������, ������� �������� ����������� ��������, ������������ ��������,
    // � ������� ����� ���� �������� ����� 2-�� ���������.
    //
    //Test Data:
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) ?  {3, 7, 5}

    public int[] minMaxAve1(int[] array, int k, int j) {
        if (array.length > 0) {
            if (k <= array.length - 1 && j <= array.length - 1 && k <= j && k >= 0 && j >= 0) {

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                int sum = 0;
                int average = 0;
                int[] newArray = new int[3];

//
//                // ������� ������ ������ ������� � �������� ��������
//
//                int count = 0;
//                for (int i = k; i <= j; i++) {
//                    count++;
//                }
//
//                // ������� ������ � �������� ��������
//                int[] newArrayKToJ = new int[count];

                //������� ������ � �������� ��������
                int[] newArrayKToJ = new int[j - k + 1];      //  ������������

//                //��������� ���������� �� ������� ������� � �������� ��������
//
//                for (int i = 0; i < array.length; i++) {
//                    if (k <= j) {    //!!!!indexoutofbounds
//                        newArrayKToJ[i] = array[k];
//                        //������� � ����� ������ ������� ��� �������� k (������)
//                        k++;                                   // ��� �� ������� ������� � ��������� �� ������� �������
//                    }
//                }
//
//                // � ���� ������� ����� ����� min, max, ����� � �������
//
//                for (int i = 0; i < newArrayKToJ.length; i++) {
//                    if (min > newArrayKToJ[i]) {
//                        min = newArrayKToJ[i];
//                    }
//                    if (max < newArrayKToJ[i]) {
//                        max = newArrayKToJ[i];
//                    }
//                    sum += newArrayKToJ[i];
//                }
//                average = sum / newArrayKToJ.length;
                for (int i = k; i <= j; i++) {
                    if (max < array[i]) {
                        max = array[i];
                    }
                    if (min > array[i]) {
                        min = array[i];
                    }
                    sum += array[i];
                }
                average = sum / j - k + 1; //������ � �������� ��������

                //�������� ����� ������ ���������� ���,����,������� ����� ��������

                for (int i = 0; i < newArray.length; i++) {
                    newArray[0] = min;
                    newArray[1] = max;
                    newArray[2] = average;
                }
                return newArray;
            }
            return new int[]{};
        }
        return new int[]{};
    }

    public int[] minMaxAve(int[] array, int k, int j) {
        if (array.length > 0) {
            if (k <= array.length - 1 && j <= array.length - 1 && k <= j && k >= 0 && j >= 0) {

                if (k > j) { //���� ������ ������ ������ �������, ������������� �� �������
                    int temp = k;
                    k = j;
                    j = temp;
                }

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                int sum = 0;
                int average = 0;


                for (int i = k; i <= j; i++) {
                    if (max < array[i]) {
                        max = array[i];
                    }
                    if (min > array[i]) {
                        min = array[i];
                    }
                    sum += array[i];
                }
                average = sum / (j - k + 1);

                return new int[]{min, max, average};
            }
            return new int[]{};
        }
        return new int[]{};
    }


//9.�������� �������� Intersection, ������� ��������� �� ���� 2 ������� ����� ����� � ���������� ������ ����� ���������.
//
//Test Data:
//{1, 2, 4, 5, 89}, {8, 9, 4, 2} ? {2, 4}
//{1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} ? {8, 9}
//{1, 2, 4, 5, 89}, {8, 9, 45} ? {}

    public int[] intersection(int[] arr1, int[] arr2) {
        if (arr1.length > 0 && arr2.length > 0) {
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                int a = arr1[i];
                for (int j = 0; j < arr2.length; j++) {
                    if (a == arr2[j]) {
                        count++;
                    }
                }
            }

            int[] newArray = new int[count];
            for (int i = 0; i < arr1.length; i++) {
                int a = arr1[i];
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) {
                        if (a == arr2[j]) {
                            newArray[newArray.length - count] = arr2[j];
                            count--;
                        }
                    }
                }
            }
            return newArray;
        }
        return new int[]{};
    }

    //10 �������� �������� PeakElement,  ������� ��������� �� ���� ������ ����� �����
    // � ���������� �������� ������� ��������� (��������, ������� ������ ����� �������).
    //Test Data:
    //{3, 2, 7, 5, 1, 9, 23, 1} ? {3, 7, 23}
//    public int[] peakElement(int[] arr) {
//
//        int[] result = new int[]{};
//
//        if (arr.length != 0 || arr != null) {
//
//            int countArray = 0;
//
//            if (arr[0] > arr[1]) {
//                countArray++;
//            }
//            if (arr[arr.length - 1] > arr[arr.length - 2]) {
//                countArray++;
//            }
//
//            for (int i = 1; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
//                    countArray++;
//                }
//            }
//            System.out.println(countArray);
//
//            result = new int[countArray];
//            countArray = 0;
//            if (arr[0] > arr[1]) {
//                result[0] = arr[0];
//                countArray++;
//            }
//            if (arr[arr.length - 1] > arr[arr.length - 2]) {
//                result[result.length - 1] = arr[arr.length - 1];
//            }
//
//            for (int i = 1; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
//                    result[countArray] = arr[i];
//                    countArray++;
//                }
//            }
//
//        }
//        return result;
//    }


}
































