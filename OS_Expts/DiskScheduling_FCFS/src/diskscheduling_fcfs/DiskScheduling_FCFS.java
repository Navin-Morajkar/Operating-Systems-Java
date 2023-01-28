/*Expt 9a - Disk scheduling Algorithm (FCFS)*/
package diskscheduling_fcfs;
import java.util.Scanner;

public class DiskScheduling_FCFS {

    public static void main(String[] args) {
        
        int nc, i, initial_head_pos, cur_track, total=0; 
        Scanner sc=new Scanner(System.in); 
        
        System.out.println("Enter no. of cylinders requests: "); 
        nc=sc.nextInt(); 
        
        int requests[]=new int[nc]; 
        int hm[]=new int[nc]; 
        
        System.out.println("Enter the cylinder request numbers: "); 
        for(i=0;i<nc;i++) 
            requests[i]=sc.nextInt();
        
        System.out.println("Enter initial head position: "); 
        initial_head_pos=sc.nextInt(); 
        cur_track=initial_head_pos;
        
        for(i=0;i<nc;i++) {
            if(requests[i] > cur_track) { 
                hm[i]=requests[i]-cur_track; 
                cur_track = requests[i]; 
                System.out.println("At Position\t"+cur_track); 
            } 
            else {
                hm[i]=cur_track-requests[i]; 
                cur_track=requests[i]; 
                System.out.println("At Position\t"+cur_track); 
            }
            
            total=total+hm[i];
        } 
             
        System.out.println("The total head movement: " + total); 
    }
}