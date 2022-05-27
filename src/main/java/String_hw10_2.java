public class String_hw10_2 {
    //15 Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    //Test Data:
    //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    //(Без форматирования)

    public static int[] stringToNumbers(String str) {

        String[] arrayStr = str.substring(0, str.length()).split(",");
        int[] array = new int[arrayStr.length];

        for (int i = 0; i < arrayStr.length; i++) {
            array[i] = (Integer.parseInt(arrayStr[i]));
        }
        return array;
    }

    //16 Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers,StringToNumbersAndSpaces
    //Каждый алгоритм принимает строку,  и удаляет ненужные символы:


    public static String stringToLetters(String str) {
        if (str != null || str.length() > 0) {

            char[] chars = str.toCharArray();
            String newStr = "";
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(str.charAt(i))) {
                    newStr += chars[i];
                }
            }
            return newStr;
        }
        return new String();
    }

    public static String stringToLettersAndSpaces(String str) {
        if (str != null || str.length() > 0) {
            char[] chars = str.toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(str.charAt(i)) || (Character.isWhitespace(str.charAt(i)))) {
                    count++;
                }
            }
            char[] chars1 = new char[count];
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(str.charAt(i)) || (Character.isWhitespace(str.charAt(i)))) {
                    chars1[chars1.length - count] = chars[i];
                    count--;
                }
            }
            return  String.valueOf(chars1);
        }
        return new String();
    }

    public static String stringToNumbers16(String str ){
        if (str != null || str.length() > 0) {
            char[] chars = str.toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if(Character.isDigit(str.charAt(i))) {
                    count++;
                }
            }
            char[] chars1 = new char[count];
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(str.charAt(i))) {
                    chars1[chars1.length - count] = chars[i];
                    count--;
                }
            }
            return  String.valueOf(chars1);
        }
        return new String();
    }

    public static String stringToNumbersAndSpaces(String str){
        if (str != null || str.length() > 0) {
            char[] chars = str.toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(str.charAt(i)) || (Character.isWhitespace(str.charAt(i)))) {
                    count++;
                }
            }
            char[] chars1 = new char[count];
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(str.charAt(i)) || (Character.isWhitespace(str.charAt(i)))) {
                    chars1[chars1.length - count] = chars[i];
                    count--;
                }
            }
            return  String.valueOf(chars1);
        }
        return new String();
    }

//    Напишите алгоритм CountWords, который принимает на вход текст и слово,
//    и считает все вариации этого слова в тексте:
//            “As of March 2022, Java 18 is the latest version,
//            while Java 17, 11 and 8 are the current long-term
//            support (LTS) versions. Oracle released the last
//            zero-cost public update for the legacy version Java
//            8 LTS in January 2019 for commercial java use,
//            although it will otherwise still support Java 8 with
//            public updates for personal use indefinitely. Other
//            vendors have begun to offer zero-cost builds of
//            OpenJDK 8 and 11 that are still receiving security
//            and other upgrades.”,
//            “Java” → 5
//
//            “As of March 2022, Java 18 is the latest version,
//            while Java 17, 11 and 8 are the current long-term
//            support (LTS) versions. Oracle released the last
//            zero-cost public update for the legacy version Java 8
//            LTS in January 2019 for commercial java use, although
//            it will otherwise still support Java 8 with public
//            updates for personal use indefinitely. Other vendors
//            have begun to offer zero-cost builds of OpenJDK 8 and 11
//            that are still receiving security and other upgrades.”,
//            “version” → 2




}