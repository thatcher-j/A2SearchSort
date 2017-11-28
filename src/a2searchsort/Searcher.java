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
     
        public Searcher ()
        {
            
        }
 	
 	// ********** accessors **********
        
        public int lSearch (int[] data, int key)
        {
            int i = 0;
            int length = data.length;
            
            while (i < length && data[i] != key )
            {
                i++;
            }
            
            if (i == length)
            {
                i = -1;
            }
            
            return i;
        }
        
       public int bSearch (int[] data, int key)
        {
            int hi = data.length;
            int low = 0;
            int index = -1;
            
            while (low < hi - 1)
            {
                if (data[((low + hi)/2)] > key)
                {
                    hi = ((low + hi)/2);
                }
                else if (data[((low + hi)/2)] < key)
                {
                    low = ((low + hi)/2);
                }
                else
                {
                    index = ((low + hi)/2);
                    low = 1;
                    hi = 0;
                }
            }
            
            return index;
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