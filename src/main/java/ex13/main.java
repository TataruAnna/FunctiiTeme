package ex13;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {
        List<Transaction> transactions1 = Arrays.asList(new Transaction(1,2, State.PROCESSING), new Transaction(2,3,State.CANCELED));
        List<Transaction> transactions2 = Arrays.asList(new Transaction(1,4, State.CANCELED), new Transaction(2,5,State.FINISHED));
        List<Account> accountList = Arrays.asList(new Account("1",40,transactions1), new Account("2", 100, transactions2));

        System.out.println(getSumOfCanceledTransactions(accountList,50 ));

        Optional<Integer> sumOptional = accountList.stream()
                .filter(account->account.getBalance()>30) // fiecare cont care vine pe banda sa fie pastrat doar daca balanta acelui cont este mai mare decat 30
                .flatMap(account -> account.getTransactionList().stream())
                .filter(transaction -> transaction.getState().equals(State.CANCELED))
                .map(transaction -> transaction.getAmount())
                .reduce((sum, amount) ->sum+amount); // returneaza un Optional

        System.out.println(sumOptional.get());

    }

    public static Integer getSumOfCanceledTransactions(List<Account> accounts, Integer minBalance){

        int sum = 0;

        for(Account account: accounts){
            if(account.getBalance()>minBalance){
                for(Transaction transaction: account.getTransactionList()){
                    if(transaction.getState().equals(State.CANCELED)){
                        sum+=transaction.getAmount();
                    }
                }
            }
        }
        return sum;
    }
}
