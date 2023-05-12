public class DataType {
    public static void main(String[] args) {
        System.out.println(DataType.gd(20));
        System.out.println(DataType.gd(702));
        System.out.println(DataType.gd(0));
    }

    public static String gd(int code) {
        Integer[] arrayDate = {702, 1082, 1083, 1114, 1184, 1266, 12403};
        Integer[] arrayNumeric = {20, 21, 23, 24, 26, 700, 701, 790, 1700, 2202, 2203, 2204, 2205, 2206, 3734, 3769, 12396};

        for (int i = 0; i < arrayDate.length; i++) {
            if (arrayDate[i] != null) {
                if (arrayDate[i] == code) {
                    return "DATE";
                }
            }
        }

        for (int j = 0; j < arrayNumeric.length; j++) {
            if (arrayNumeric[j] != null) {
                if (arrayNumeric[j] == code) {
                    return "NUMERIC";
                }
            }
        }
        return "STRING";
    }
}


