package artifactExample.com.integral;

import java.util.ArrayList;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Filtrar {
	
	private static final Logger LOGGER = LogManager.getLogger(Filtrar.class);

	public static void main(String[] args) {

		ArrayList<String> firstList = new ArrayList<String>();
		firstList.add("Name");
		firstList.add("ItemQualifier");
		firstList.add("DataType");
		firstList.add("DataAttribute");
		firstList.add("SourceInputValue");
		firstList.add("SourceInputHexValue");
		firstList.add("DestInputValue");
		firstList.add("DestInputHexValue");
		firstList.add("SourceOutputValue");
		firstList.add("SourceOutputHexValue");
		firstList.add("Name");
		firstList.add("DestOutputValue");
		firstList.add("DestOutputHexValue");
		firstList.add("Skipped");
		firstList.add("TestPassed");
		firstList.add("SourceInputHexValue");
		firstList.add("ItemQualifier");
		firstList.add("SourceInputHexValue");
		firstList.add("DestOutputValue");
		firstList.add("Name");

		//#################################### FORMA NORMAL ####################################
		long cantidad = 0;
		for (String iterator : firstList) {
			if (iterator.equalsIgnoreCase("Name")) {
				cantidad++;
			}
		}
		LOGGER.info("La cantidad de veces que se repite la palabra 'name' es : " + cantidad);
		
		
		//#################################### FORMA LAMBDA ####################################
		cantidad = firstList.stream()
								.filter(j -> j.equalsIgnoreCase("Name"))
								.count();
		LOGGER.info("La cantidad de veces que se repite la palabra 'name' es : " + cantidad);

	}

}
