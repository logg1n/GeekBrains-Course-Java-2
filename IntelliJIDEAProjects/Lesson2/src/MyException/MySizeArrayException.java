package MyException;

public class MySizeArrayException extends MyArrayException {
    public MySizeArrayException() {
        super("\nРазмерность массива не в входит в допустимое значение!");
    }

}

