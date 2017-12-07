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
     
        public Sorter () //default constructor
        {
            
        }
 	
 	// ********** accessors **********
        
        public int[] bSort (int[] data) //simple binary sort
        {       
            for (int m = 0; m < data.length - 1; m++) //goes through entire array
                {
                    for (int i = 0; i < data.length - 1; i++) //ges through again, nested
                        {
                            if (data[i + 1] < data[i]) //if the current largest element is larger than the element next to itself
                                {
                                    int n = data[i];
                                    data[i] = data[i+1];
                                    data[i+1] = n; //swap
                                }
                        }
                }
            
            return data; //return sorted array
        }
        
        public int[] sSort (int[] data) //simple selection sort
        {
            int swapped = 0;
            int small = 0;
            
            for (int m = 0; m < data.length; m++) //goes through entire array one element at a time
                {
                    for (int i = swapped; i < data.length; i++) //goes through array starting at last swapped element
                        {
                            if (data[i] < data[small]) //if the smallest value is greater than current element
                                {
                                    small = i;
                                }
                        }
                    int t = data[small];
                    data[small] = data[swapped];
                    data[swapped] = t; //swap small for swapped
            
                    swapped++; //increment swapped
                    small = swapped; //set small equal to swapped
                }
            
            return data;
        }
        
        public int[] qSort (int[] data) //call to quickSort
        {
            return quickSort (0, data.length - 1, data); //call to the actual quicksort method (that needs some different arguments)
        }
        
        public int[] quickSort (int low, int hi, int[] data) //recursive qs sorter
        {
            if (low < hi) //if the range given exists
            {
                int pivotIndex = partition(low, hi, data); //partition the array and return the index of the pivot
                quickSort (pivotIndex + 1, hi, data); //call iself on right side of the list
                quickSort (low, pivotIndex - 1, data); //call itself on the left side of the list
            }
            
            return data; //return sorted array
        }
        
         public int partition (int low, int high, int[] data) //partitions data
    {
        int pivotIndex = high;
        int highRange = high;
        int lowRange = low;
        
        while (lowRange <= highRange) //while range exists
        {
            
            while (data[lowRange] <= data[pivotIndex]) //for all elements of array that belong on the left side of the class and are already there
                {
                    lowRange++;
                }
            while (lowRange < highRange && data[highRange - 1] > data[pivotIndex]) //for all elements of array that belong on the right side of the class and are already there
                {
                    highRange--;
                }
        
            if (lowRange < highRange) //as long as range still exists
                {
                    int n = data[lowRange];
                    data[lowRange] = data[highRange - 1];
                    data[highRange - 1] = n; //these 3 lines swap the places of elements that are in the wrong places
                }
            else //range no longer exists
                {
                    int n = data[highRange];
                    data[highRange] = data[pivotIndex];
                    data[pivotIndex] = n; //move pivot to middle
                    pivotIndex = highRange; //change pivotIndex to match new location of pivot
                    highRange--;
                }
        }
        
        return pivotIndex;
    }
              
        public void printOut (int[] data) //prints array to console for testing ease
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