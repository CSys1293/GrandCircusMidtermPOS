import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Reader {

	public static ArrayList<Product> FileReading() {
		BufferedReader br = null;
		String line = "";
		ArrayList<Product> products = new ArrayList<Product>();
		try {

			br = new BufferedReader(new FileReader("newPriceList.txt"));
			while ((line = br.readLine()) != null) {

				String[] item = line.split(",");
				for(int i =0; i < item.length; i++){
//					item[i] = item[i].trim();
				}

				products.add(new Product(item[0], item[1], Double.parseDouble(item[2])));

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return products;
	}
}