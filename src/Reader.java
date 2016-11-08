
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Reader {
private Scanner reader;
public void openFile(){
	try{
		reader = new Scanner (new File("newPriceList.txt"));
	}
	catch(Exception e){
		System.out.println("Could not find file");
	}
}
public void readFile(){
	while(reader.hasNext()){
		String a = reader.next();
		
		System.out.printf("%s\n", a);
	}
}
public void productArray(){
	 try{
         BufferedReader buf = new BufferedReader(new FileReader("newPriceList.txt"));
         ArrayList<String> products = new ArrayList<>();
         String nextWord = null;
         String[] productsArray;

         while(true){
             nextWord = buf.readLine();
             if(nextWord == null){  
                 break; 
             }else{
                 productsArray = nextWord.split("\t");
                 for(String each : productsArray){
                     if(!"".equals(each)){
                         products.add(each);
                     }
                 }
             }
         }

         for(String each : products){
             System.out.println(each);
         }

         buf.close();

     }catch(Exception e){
         e.printStackTrace();
     }
}
}
