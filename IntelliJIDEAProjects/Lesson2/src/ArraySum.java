import java.util.regex.Pattern;

import MyException.*;

public class ArraySum {
    public int sum;

    public void parseAndSumArrayInt(String[][] strArr) throws MyArrayException {
        checkSizeArray(strArr);
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr.length; j++) {
                if (checkParseArray(strArr[i][j], i, j)) {
                    sum += Integer.parseInt(strArr[i][j]);
                }
            }
        }
    }


    private void checkSizeArray(String[][] strArr) throws MySizeArrayException {
        if (strArr.length != 4) {
            throw new MySizeArrayException();
        }

        for (String[] subArr : strArr) {
            if (subArr.length != 4) {
                throw new MySizeArrayException();
            }
        }
    }

    private boolean checkParseArray(String string, int inx1, int inx2) throws MyArrayDataException {
        if (!Pattern.matches("\\d", string)) {
            throw new MyArrayDataException(inx1, inx2, string);
        }
        return true;
    }
}



