package ex11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Account account1 = new Account("1", 40);
        Account account2 = new Account("1", 1000);
        Account account3= new Account("1", 9000);
        List<Transaction> transactions = Arrays.asList(new Transaction(1,20,account1), new Transaction(2,5,account1), new Transaction(3,6,account2));
        System.out.println(getSumOfTransactionsByAccountNumber(transactions));

        Map<String,Integer> sumOfTransactionsByAccountNumber = transactions.stream()
                .collect(Collectors.groupingBy(transaction -> transaction.getAccount().getAccountNumber(), Collectors.summingInt(transaction-> transaction.getAmount())));
        System.out.println(sumOfTransactionsByAccountNumber);

    }
    public static Map<String, Integer> getSumOfTransactionsByAccountNumber(List<Transaction> transactions){
        Map<String, Integer> sumOfTransactionsByAccountNumber = new HashMap<>();
        for(Transaction transaction : transactions){
            String transactionAccountNumber = transaction.getAccount().getAccountNumber();
            if(sumOfTransactionsByAccountNumber.containsKey(transactionAccountNumber)){
                sumOfTransactionsByAccountNumber.put(transactionAccountNumber, transaction.getAmount() + sumOfTransactionsByAccountNumber.get(transactionAccountNumber));
            }
        }
        return sumOfTransactionsByAccountNumber;
    }

}
