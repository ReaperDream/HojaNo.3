import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Sorting {
	
	 ArrayList<Integer> lista = new ArrayList<Integer>();
	 File file = new File("numeros.txt");
	 BufferedReader reader;
	
	public static void main(String[] args) throws IOException {
		new Sorting();
	}
	
	public Sorting() throws IOException{
		try {
		    reader = new BufferedReader(new FileReader(file));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
		        lista.add(Integer.parseInt(text));
		        insertionSort(lista);
		        System.out.println(lista);
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}
	}
	
	public void insertionSort(ArrayList<Integer> lista){    
    int i,j;
    Integer key;
    ArrayList<Integer> inputArray=lista;

    for (j=1; j<inputArray.size(); j++) {
            key = inputArray.get(j);
            i = j - 1;
                while (i >= 0)
                {
                    if (key.compareTo(inputArray.get(i)) > 0) {
                    break;
                }
             int element=inputArray.get(i+1);             
             inputArray.set(i+1,inputArray.get(i));          
             inputArray.set(i,element);                      
             i--;
         }
         int element=inputArray.get(i+1);
         element = key;
    }
  }
};