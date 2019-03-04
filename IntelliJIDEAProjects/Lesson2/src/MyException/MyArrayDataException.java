package MyException;

public class MyArrayDataException extends MyArrayException{
    public MyArrayDataException(int inx1, int inx2, String string) {
        super(String.format("\nНевозможно преобразовать значение эелемента массива [%d][%d]: `%s` в Int!", inx1, inx2, string));
    }
}
