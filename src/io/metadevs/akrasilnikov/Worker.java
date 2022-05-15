package io.metadevs.akrasilnikov;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {
    private ArrayList<Visitor> visitors;
    private String name;
    private int lowBound = 1000;
    private int upperBound = 5000;

    public Worker(String name, ArrayList<Visitor> visitors) {
        this.name = name;
        this.visitors = visitors;
    }

    public Worker(String name, int lowBound, int upperBound, ArrayList<Visitor> visitors) {
        this.name = name;
        this.lowBound = lowBound;
        this.upperBound = upperBound;
        this.visitors = visitors;
    }

    public void run() {
        while (!visitors.isEmpty()) {

            try {
                synchronized (visitors) {
                    visitors.remove(0);
                }
                // System.out.println(visitors.get(0));
                String name = Thread.currentThread().getName();
                int number = visitors.size() + 1;
                System.out.printf("%s принял заказ № %d. %n", name, number);
                System.out.printf("    %s выполняет заказ № %d ...%n", name, number);

                int orderTime = getRND(lowBound, upperBound);
                TimeUnit.MILLISECONDS.sleep(orderTime);

                System.out.printf("        %s выполнил заказ № %d за %d (минуты).%n", name, number, orderTime / 1000);

            } catch (InterruptedException e) {
                System.out.println("Поток был прерван!");
            }

        }
    }

    public static int getRND(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
