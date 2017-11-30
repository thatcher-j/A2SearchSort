/* **********************************************************
 * Programmer:	Joshua R. Thatcher
 * Class:		CS40S
 * 
 * Assignment:	A2
 *
 * Description:	Class with bubble sort, selection sort, and quick sort methods,
 *              Built to A2 client specifications
 * 
 * *************************************************************
 */

package a2searchsort;
 
 // import files here as needed
 
 
 public class Sorter
 {  // begin class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
 	
 	// ********** constructors ***********
     
        public Sorter ()
        {
            
        }
 	
 	// ********** accessors **********
        
        public int[] bSort (int[] data)
        {       
            for (int m = 0; m < data.length - 1; m++)
                {
                    for (int i = 0; i < data.length - 1; i++)
                        {
                            if (data[i + 1] < data[i])
                                {
                                    int n = data[i];
                                    data[i] = data[i+1];
                                    data[i+1] = n;
                                }
                        }
                }
            
            return data;
        }
        
        public int[] sSort (int[] data)
        {
            int swapped = 0;
            int small = 0;
            
            for (int m = 0; m < data.length; m++)
                {
                    for (int i = swapped; i < data.length; i++)
                        {
                            if (data[i] < data[small])
                                {
                                    small = i;
                                }
                        }
                    int t = data[small];
                    data[small] = data[swapped];
                    data[swapped] = t;
            
                    swapped++;
                    small = swapped;
                }
            
            return data;
        }
        
        public int[] qSort (int[] data)
        {
            return quickSort (0, data.length - 1, data);
        }
        
        public int[] quickSort (int low, int hi, int[] data)
        {
            if (low < hi)
            {
                int pivotIndex = partition(low, hi, data);
                quickSort (pivotIndex + 1, hi, data);
                quickSort (low, pivotIndex - 1, data);
            }
            
            return data;
        }
        
         public int partition (int low, int high, int[] data)
    {
        int pivotIndex = high;
        int highRange = high;
        int lowRange = low;
        
        while (lowRange <= highRange)
        {
            
            while (data[lowRange] <= data[pivotIndex])
                {
                    lowRange++;
                }
            while (lowRange < highRange && data[highRange - 1] > data[pivotIndex])
                {
                    highRange--;
                }
        
            if (lowRange < highRange)
                {
                    int n = data[lowRange];
                    data[lowRange] = data[highRange - 1];
                    data[highRange - 1] = n;
                }
            else
                {
                    int n = data[highRange];
                    data[highRange] = data[pivotIndex];
                    data[pivotIndex] = n;
                    pivotIndex = highRange;
                    highRange--;
                }
        }
        
        return pivotIndex;
    }
              
        public void printOut (int[] data)
        {
            System.out.println ("\n\n");
            
            for (int i = 0; i < data.length; i++)
            {
            System.out.println (data[i]);
            }
            
            System.out.println ("\n\n");
        }
 	
 	// ********** mutators **********
 
 }  // end class