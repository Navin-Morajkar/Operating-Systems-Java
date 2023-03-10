/* Expt 8a - Page Replacement Algorithm using FIFO*/
package pagereplacement_fifo;
import java.util.*;

public class PageReplacement_FIFO {

    public static void main(String[] args) {
        
        ArrayList<Integer> frame = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the frame size: ");
        int fno = sc.nextInt();

        System.out.println("Enter the number of pages: ");
        int pno = sc.nextInt();
        int[] page = new int[pno];

        System.out.println("Enter page references: ");
        for (int i = 0; i < pno; i++) {
            page[i] = sc.nextInt();
        }
        int found;
        int i;
        int hit = 0;
        int miss = 0;
        
        for (int val : page) {
            if (frame.size() == 0) //adding the first frame
            {
                frame.add(val);
                miss++;
                continue;
            }

            found = 0;
            i = 0;
            
            //iterating through frames until page found
            while (frame.size() != i) {
                if (frame.get(i) == val) 
                { //if page found--> found=1 || if Page not found --> found=0
                    found = 1;
                    break;
                }
                i++;
            }

            if (found == 1) //page found
                hit++;
                
            else if (found == 0) //page not found
            {
                if (frame.size() < fno) //if all frames not filled yet
                {
                    frame.add(val); //apppending the value to the frame 
                    miss++;                    
                } 
                else { //if frame is full
                    frame.remove(0); //remove the first element 
                    frame.add(val); //appending the page reference 
                    miss++;
                }
            }
        }
        System.out.println("Hits: " + hit);
        System.out.println("Misses: " + miss);
    }
}
