package org.example.societeTrading;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Trader> traders = Arrays.asList(
                new Trader("Raoul", "Cambridge"),
                new Trader("Mario", "Milan"),
                new Trader("Alan", "Cambridge"),
                new Trader("Brian", "Cambridge")
        );

        Trader brian = traders.get(3);
        Trader raoul = traders.get(0);
        Trader mario = traders.get(1);

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 400),
                new Transaction(brian, 2012, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 410),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(traders.get(2), 2012, 950) // Get Alan from traders list
        );

        System.out.println("===============================");


        List<Transaction> transactions2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .toList();
        transactions2011.forEach(System.out::println);

        System.out.println();


        List<String> cities = traders.stream()
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());

        System.out.println();

        System.out.println(cities);

        traders.stream()
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        Optional<Boolean> traderMilan = Optional.of(traders.stream()
                .anyMatch(city -> city.getCity().equals("Milan")));
        System.out.println(traderMilan);

        Optional<Integer> highestTransaction = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo);

        System.out.println(highestTransaction);

        List<Trader> cambridgeTraders = traders.stream()
                .filter(location -> location.getCity().equals("Cambridge"))
                .toList();
        System.out.println(cambridgeTraders);
    }

}
