// **********************************************************************
// Programmer:	Joshua R. Thatcher
// Class:		CS40S
//
// Assignment:	A2
//
// Description:	Throwaway client code for searcher and sorter (classes) testing
//
//
//	Input:		Text file named "SortingTestData.txt"
//
//  Output:		Shows that sorters and searchers are working
// ***********************************************************************
package a2searchsort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;

public class A2SearchSort /*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[]) throws IOException
	{  // begin main
	// ***** declaration of constants *****
	// ***** declaration of variables *****
            String strin;
            int[] data;
            int length;
            int control = 0;
	// ***** create objects *****
            BufferedReader fin = new BufferedReader (new FileReader ("SortingTestData.txt"));
            Sorter sort;
            Searcher search;
		
	// ***** create input stream *****
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Joshua R. Thatcher");
		System.out.println("Class:       CS40S");
		System.out.println("Assignment:  A2");
		System.out.println("**********************************");
		
	// ***** get input *****
            strin = fin.readLine ();
            length = Integer.parseInt (strin);
            strin = fin.readLine ();
            data = new int[length];
            
            while (strin != null)
            {
                data[control] = Integer.parseInt(strin);
                strin = fin.readLine ();
                control++;
            }
            
            sort = new Sorter ();
            search = new Searcher ();
	
	// ***** processing *****
            System.out.println ("\n\n");
            sort.printOut (data);
            System.out.println ("\n\n");
            
            sort.printOut(sort.qSort(data));
            
            System.out.println ("\n\n");
            search.printOut (data);
            System.out.println ("\n\n");
            
            System.out.println (search.bSearch (data, 65));
            
	// ***** output *****
        
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class