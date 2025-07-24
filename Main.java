import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(sc.nextLine());

        Rank[] Rarr = new Rank[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter: rollNo name mark1 mark2 mark3");
            String res = sc.nextLine();
            String[] parts = res.split(" ");

            int rollNo = Integer.parseInt(parts[0]);
            String name = parts[1];
            int mark1 = Integer.parseInt(parts[2]);
            int mark2 = Integer.parseInt(parts[3]);
            int mark3 = Integer.parseInt(parts[4]);

            Rarr[i] = new Rank(rollNo, name, mark1, mark2, mark3);
        }

        Arrays.sort(Rarr);

        System.out.println("\n--- Student Rankings ---");
        System.out.printf("%-5s %-10s %-10s %-10s\n", "Rank", "RollNo", "Name", "Total");

        for (int i = 0; i < n; i++) {
            Rank r = Rarr[i];
            System.out.printf("%-5d %-10d %-10s %-10d\n", (i + 1), r.rollNo, r.name, r.total);
        }

        sc.close();
    }
}
