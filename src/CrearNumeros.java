import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CrearNumeros {
	Random rand = new Random();
	private int value = 0;
	
	
	public void GenerarNumeros() throws IOException{
		FileWriter writer = new FileWriter("lol.txt");
		for(int i = 0; i < 2000; i++){
			value = rand.nextInt(2000)+1;
			try {
				writer.write(String.valueOf(value));
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
