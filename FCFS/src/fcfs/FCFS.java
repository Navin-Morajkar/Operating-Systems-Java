/* Experiment 2a - CPU Scheduling Algorithms (First Come First Serve) */
package fcfs;
import java.util.*;

public class FCFS {
    
    public static void main(String[] args) {
            
        int processID[]=new int[20];
        int burstTime[]=new int[20];
        int waitingTime[]=new int[20];
        
        int total=0;
        float average;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("\nEnter the number of processes : ");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)

        {
            System.out.println();
            System.out.print("Enter the process ID of process "+(i+1)+" : "); 
            processID[i]=sc.nextInt();
            System.out.print("Enter the burst time of process "+(i+1)+" : "); 
            burstTime[i]=sc.nextInt();
        }  
        
        waitingTime[0]=0;

        for(int i=1;i<n;i++)
        {
            waitingTime[i]=waitingTime[i-1]+burstTime[i-1];
            total=total+waitingTime[i];
        }
        
        average=(float)total/n;

        System.out.println("\nProcess_ID\tBurst_time\tWait_time");
        
        for(int i=0;i<n;i++)
        {
            System.out.println(processID[i]+"\t\t"+burstTime[i]+"\t\t"+waitingTime[i]);
        }
        System.out.println("\nTotal wait time: "+total+"\nAverage wait time: "+average);

    }   
}
