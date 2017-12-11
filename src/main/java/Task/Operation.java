package Task;

public class Operation {
    private static int countOfObjects; // переменная класса
    private String operationType; // переменная экземпляра
    public Operation(String operationType) {
        this.operationType = operationType;
        countOfObjects++;
    }

    public static int getCountOfObjects() {

        return countOfObjects;
    }

    public String getOperationType() {
        return operationType;
    }




}