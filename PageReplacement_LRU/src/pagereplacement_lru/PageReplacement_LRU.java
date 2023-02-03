/* Page Replacement Algorithm using LRU*/
package pagereplacement_lru;
import java.util.*;

public class PageReplacement_LRU {

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

        int hits = 0;
        int miss = 0;
        int i;
        int found;
        
        for (int val : page) //iterating through page references
        {
            if (frame.size() == 0) //if the frame size is not  filled at all, add the page..
            {
                frame.add(val);
                miss++;
                continue;
            }
            
            i = 0;
            found = 0;
            
            while (frame.size() != i) //iterate through the frame to check if page already exists in it
            {
                if (val == frame.get(i)) {
                    found = 1; //page found 
                    break;
                }
                i++;
            }

            if (found == 1)// page found
            {
                frame.remove(i); //the first element i.e index 0 is the least recently used page.
                //hence if there is any hit, we remove the page and add the page at the end(append) 
                frame.add(val);
                hits++;
            } 
            else if (found == 0) {
                if (frame.size() < fno) //if the frame size is not  filled, add the page at the end
                {
                    frame.add(val);
                    miss++;                    
                } 
                else if (frame.size() == fno) {
                    frame.remove(0); //the first element i.e index 0 is the least recently used page(TO be replaced)
                    frame.add(val);
                    miss++;
                }
            }
        }
        System.out.println("Hits: " + hits);
        System.out.println("Misses: " + miss);       
    }    
}
