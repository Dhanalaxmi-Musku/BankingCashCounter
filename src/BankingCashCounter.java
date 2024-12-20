import java.util.Scanner;

public class BankingCashCounter {
	public static void main(String[] args) {
        Queue<Person> queue = new Queue<>();
        Scanner scanner = new Scanner(System.in);
        int cashBalance = 100000;

        while (true) {
            System.out.println("1. Add person to queue");
            System.out.println("2. Process queue");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Deposit (true) or Withdraw (false): ");
                boolean isDeposit = scanner.nextBoolean();
                System.out.print("Enter amount: ");
                int amount = scanner.nextInt();
                queue.enqueue(new Person(name, isDeposit, amount));
            } else if (choice == 2) {
                if (queue.isEmpty()) {
                    System.out.println("Queue is empty");
                } else {
                    Person person = queue.dequeue();
                    if (person.isDeposit) {
                        cashBalance += person.amount;
                        System.out.println(person.name + " deposited " + person.amount + ". Updated balance: " + cashBalance);
                    } else {
                        if (cashBalance >= person.amount) {
                            cashBalance -= person.amount;
                            System.out.println(person.name + " withdrew " + person.amount + ". Updated balance: " + cashBalance);
                        } else {
                            System.out.println("Insufficient funds for " + person.name);
                        }
                    }
                }
            } else if (choice == 3) {
                break;
            }
        }
    }
}
