import java.util.*;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class jobSequencing {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };

        int n = jobs.length;
        int[] result = new int[n];
        boolean[] slot = new boolean[n];

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobs[i].id;
                    break;
                }
            }
        }

        System.out.println("Job sequence:");
        for (int i = 0; i < n; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
    }
}