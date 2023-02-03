/*Expt 7 - Bankers Algorithm */
package bankersalgorithm;
import java.util.Scanner;

public class BankersAlgorithm {
    
    private int need[][],allocated[][],max[][],available[][],np,nr;

    private void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of processes and resources : ");
        np=sc.nextInt();  //no. of process
        nr=sc.nextInt();  //no. of resources
        
        need=new int[np][nr];  //initializing arrays
        max=new int[np][nr];
        allocated=new int[np][nr];
        available=new int[1][nr];

        System.out.println("Enter Allocation matrix -->");
        for(int i=0;i<np;i++)
            for(int j=0;j<nr;j++)
                allocated[i][j]=sc.nextInt();  //allocation matrix

        System.out.println("Enter Max matrix -->");
        for(int i=0;i<np;i++)
            for(int j=0;j<nr;j++)
                max[i][j]=sc.nextInt();  //max matrix

        System.out.println("Enter available matrix -->");
        for(int j=0;j<nr;j++)
            available[0][j]=sc.nextInt();  //available matrix

        sc.close();
    }
    
    private int[ ][ ] calc_need()
    {
        for(int i=0;i<np;i++)
            for(int j=0;j<nr;j++)  //calculating need matrix
                need[i][j]=max[i][j]-allocated[i][j];
        return need;
    }

    private boolean check(int i)
    {
        //checking if all resources for ith process can be allocated
        for(int j=0;j<nr;j++) 
            if(available[0][j]<need[i][j])
                return false;
        return true;
    }
    
    public void isSafe()
    {
        input();
        calc_need();
        boolean done[]=new boolean[np];
        int j=0;

        while(j<np)
        {  //until all process allocated
            boolean allocated=false;
            
            for(int i=0;i<np;i++)
                if(!done[i] && check(i)){  //trying to allocate
                    for(int k=0;k<nr;k++)
                        available[0][k]=available[0][k]-need[i][k]+max[i][k];

                    System.out.println("Allocated process : "+i);
                    allocated=done[i]=true;
                    j++;
                }

            if(!allocated) break;  //if no allocation
        }
        
        if(j==np)  //if all processes are allocated
            System.out.println("\nSafely allocated");
        else
            System.out.println("All processes cannot be allocated safely");
    }

    public static void main(String[] args) {
        BankersAlgorithm b = new BankersAlgorithm();
        b.isSafe();
    }  
}
