public class Main {

    public static void main(String[] args) {
        BankOperation bankOperationCredit = new BankOperation(1, 10_000, 347, 0, OperationType.CREDIT);
        BankOperation bankOperationDebit = new BankOperation(2, 10_000, 347, 0, OperationType.DEBIT);
        BankOperation bankOperationMortgage = new BankOperation(3, 10_000, 347, 0, OperationType.MORTGAGE);

        CreditCalculator calculator = new CreditCalculator();




    }
}
