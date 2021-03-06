/* Shell Sort -- 

*/
package ShellSort;


public class Main {
    
    public static void main (String[] args) { 
        
        int[] myArray = { 20, 35, -15, 7, 55, 1, -22};
        
        for (int gap = myArray.length/2; gap > 0; gap/=2) { 
            
            for (int i = gap; i < myArray.length; i++) { 
                int j = i; 
                int newElement = myArray[i];
                
                while (j >= gap && myArray[j-gap] > newElement) { 
                    myArray[j] = myArray[j - gap]; 
                    j -= gap; 
                    
                }
                
                myArray[j] = newElement; 
                
                
            }
        }
    }
    
    
  
}
