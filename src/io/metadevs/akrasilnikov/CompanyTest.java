package io.metadevs.akrasilnikov;

class CompanyTest {

    public static void main(String[] args) {
        Company macDonald = new Company();

        for (int i = 0; i < 5; i++) {
            macDonald.visitors.add(new Visitor());
        }
        Worker workerA = new Worker("Alex", macDonald.visitors);
        Thread workerAlex = new Thread(workerA, "Алекс");
        workerAlex.start();

        Worker workerB = new Worker("Bob",1000,2000, macDonald.visitors);
        Thread workerBob = new Thread(workerB, "Боб");
        workerBob.start();

        System.out.println("Macdonald's начал работу\n");
        try {
            workerAlex.join();
            workerBob.join();
        } catch (InterruptedException exception) {
            System.out.println("Поток был прерван");
        }
        System.out.println("\nMacdonald's закончил работу");
    }
}
