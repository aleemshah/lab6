/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author aleem
 */
public class addtree implements Runnable {
      String startingPath;
    public addtree(String StartingPath){
		startingPath = StartingPath;
	}
    
   
        public void run() {
            public static void searchinfile(HashMap MyFiles) throws IOException{
        //for user input
        Scanner in = new Scanner(System.in);
         
        while(true){
            System.out.println("Enter the keyword you want to search in files(Press 0 to exit): ");
            String s = in.nextLine();
            //exit method
            if(s.equals("0")){
                return;
            }
            
            //to traverse the map
            Set set = MyFiles.entrySet();
            Iterator i = set.iterator();
            
            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                ArrayList<String> val = (ArrayList)me.getValue();
                String chk;
                chk = val.get(0);
                File file = new File(val.get(1));
                
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = br.readLine()) != null) {
                        if(line.contains(s)){
                          System.out.println("The string exists in file: "+"\t"+val);
                        }
                }
     
            }   
        }
    }
        }
          

        
    }
