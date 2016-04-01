package Lab6;
import java.util.*;
import java.io.*;
import static lab6.addtree.addTree;
/*
 * @author saleem.bscs13seecs
 */


public class Lab6 {
    
            
//main
     public static void AddTree(File file, Collection<File> all_files) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File child : files) {
                AddTree(child, all_files);
            }
        }else{
            all_files.add(file);
        }
    }
    
    public static void main(String[] args) throws IOException {
    Collection<File> all = new ArrayList<File>();
    
    AddTree(new File("E:\\Microsoft Office 2010"), all);
    
        HashMap<String,ArrayList<String>> indexedfiles = new HashMap();
        Iterator i = all.iterator();
        while(i.hasNext()==true){
            File enterfilesin_map = (File) i.next();
            //get the filename
            String Filename = enterfilesin_map.getName();
            String Filepath = enterfilesin_map.getPath();
            ArrayList<String> Filepath2= new ArrayList<String>();
            Filepath2.add("0");
            Filepath2.add(Filepath);
            //putting files to hashmap
            indexedfiles.put(Filename,Filepath2);}
    printIndex(indexedfiles); // printing 
    searchinfile(indexedfiles);// searching inside files the string
       
    Thread t1=new Thread(new addtree("D:\\"));  
    t1.start(); 
    
    }

    private static void printIndex(HashMap<String, ArrayList<String>> indexedfiles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    }

 