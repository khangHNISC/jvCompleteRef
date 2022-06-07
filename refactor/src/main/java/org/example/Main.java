package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by khangld5 on $MONTH_NAME_SHORT $DAY, $YEAR
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Play> plays = new HashMap<>();
        plays.put("hamlet", new Play("Hamlet", "tragedy"));
        plays.put("as-like", new Play("As You Like It", "comedy"));
        plays.put("othello", new Play("Othello", "tragedy"));

        List<Performance> perfs = new ArrayList<>();
        perfs.add(new Performance("hamlet", 55));
        perfs.add(new Performance("as-like", 35));
        perfs.add(new Performance("othello", 40));

        Invoice invoice = new Invoice("BigCo", perfs);
        System.out.println(statement(invoice, plays));

    }

    private static String statement(Invoice invoice, Map<String, Play> plays) {
        int totalAmount = 0;
        int volumeCredits = 0;
        String result = "Statement for " + invoice.customer + "\n";

        for (Performance perf : invoice.performances) {
            Play play = plays.get(perf.playId);
            int thisAmount;
            switch (play.type) {
                case "tragedy":
                    thisAmount = 40000;
                    if (perf.audience > 30) {
                        thisAmount += 1000 * (perf.audience - 30);
                    }
                    break;
                case "comedy":
                    thisAmount = 30000;
                    if (perf.audience > 20) {
                        thisAmount += 10000 + 500 * (perf.audience - 20);
                    }
                    thisAmount += 300 * perf.audience;
                    break;
                default:
                    throw new RuntimeException("unknown type " + play.type);
            }

            volumeCredits += Math.max(perf.audience - 30, 0);
            if (play.type.equals("comedy")) volumeCredits += Math.floor((double) perf.audience / 10);

            result += "     " + play.name + ": " + format(Integer.toString(thisAmount / 100)) + " (" + perf.audience + " seats)" + "\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + format(Integer.toString(totalAmount / 100)) + "\n";
        result += "You earned " + volumeCredits + " credits\n";
        return result;
    }

    private static String format(String currency) {
        return "$" + currency + ".00";
    }

    static class Play {
        public Play(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String name;
        public String type;
    }

    static class Invoice {

        public Invoice(String customer, List<Performance> performances) {
            this.customer = customer;
            this.performances = performances;
        }

        public String customer;
        public List<Performance> performances;
    }

    static class Performance {
        public Performance(String playId, int audience) {
            this.playId = playId;
            this.audience = audience;
        }

        public String playId;
        public int audience;
    }
}