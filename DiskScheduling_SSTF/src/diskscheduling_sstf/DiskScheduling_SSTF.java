/*Expt 9b - Disk Scheduling Algorithm (Shortest Seek Time First)*/

package diskscheduling_sstf;
import java.util.*;

public class DiskScheduling_SSTF {

    public static void main(String[] args) {
        
        int head;
        int seekTime = 0;
        
        System.out.println("Enter starting head location: ");
        Scanner sc = new Scanner(System.in);
        head = sc.nextInt();

        System.out.println("Enter number of disk locations: ");
        int numberOfDiskLocations = sc.nextInt();
        
        System.out.println("Enter disk range: ");
        int[] disk_location = new int[numberOfDiskLocations];

        for (int i = 0; i < numberOfDiskLocations; i++) {
            disk_location[i] = sc.nextInt();
        }

        int[] visited = new int[numberOfDiskLocations + 1];

        System.out.println("Disk Location \t Seek Time");

        for (int i = 0; i < numberOfDiskLocations; i++) {
            int min = 99999;
            int pos = 0;
            for (int j = 0; j < numberOfDiskLocations; j++) {
                if (Math.abs(disk_location[j] - head) < min) {
                    if (visited[j] == 0) {
                        min = Math.abs(disk_location[j] - head);
                        pos = j;
                    }
                }
            }
            visited[pos] = 1;
            seekTime += Math.abs(disk_location[pos] - head);
            System.out.println(disk_location[pos] + "\t\t " + seekTime);
            head = disk_location[pos];
        }

        System.out.println();
        System.out.println("Total Seek Time :" + seekTime);
        sc.close();
    }    
}
