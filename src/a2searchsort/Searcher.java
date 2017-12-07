/* **********************************************************
 * Programmer:	Joshua R. Thatcher
 * Class:		CS40S
 * 
 * Assignment:	A2
 *
 * Description:	Class with linear and binary search methods to be operated upon
 *              An integer array; built to client specifications in A2
 * 
 * *************************************************************
 */

package a2searchsort;
 
 // import files here as needed
 
 
 public class Searcher
         
 {  // begin class
 	
 	// *********** class constants **********
 	
 	// ********** instance variable **********
 	
 	// ********** constructors ***********
     
        public Searcher () //default constructor
        {
            
        }
 	
 	// ********** accessors **********
        
        public int lSearch (int[] data, int key) //linear search for use on an unordered list
        {
            int i = 0;
            int length = data.length;
            
            while (i < length && data[i] != key ) //searches all indexes in array for key
            {
                i++;
            }
            
            if (i == length) //if the key is  not found, return -1
            {
                i = -1;
            }
            
            return i;
        }
        
       public int bSearch (int[] data, int key) //binary search for use on an ordered list
        {
            int hi = data.length;
            int low = 0;
            int index = -1;
            
            while (low < hi - 1) //while low is less than hi, with -1 to prevent infinite looping
            {
                if (data[((low + hi)/2)] > key) //if midpoint greater than key
                {
                    hi = ((low + hi)/2); //hi is now the midpoint
                }
                else if (data[((low + hi)/2)] < key) //else if midpoint less than key
                {
                    low = ((low + hi)/2); //low is now the midpoint
                }
                else //if the midpoint is the key
                {
                    index = ((low + hi)/2); //sets index (of key) equal to midpoint
                    low = 1;
                    hi = 0; //^this and line above to terminate loop
                }
            }
            
            return index;
        }
        
        public void printOut (int[] data) //print out the array to console for testing
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