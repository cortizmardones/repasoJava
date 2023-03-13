package artifactExample.com.integral;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Distintos {

	private static final Logger LOGGER = LogManager.getLogger(Distintos.class);

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
		
		LOGGER.info("Cantidad de elementos en firstList : " + firstList.size());

		// #################################### FORMA NORMAL ####################################
		List<String> secondList = new ArrayList<String>();
		for (String iterator : firstList) {
			if (!secondList.contains(iterator)) {
				secondList.add(iterator);
			}
		}
		LOGGER.info("Cantidad de elementos en secondList : " + secondList.size());

		
		// #################################### FORMA LAMBDA ####################################
		secondList = firstList.stream()
								.distinct()
								.collect(Collectors.toList());
		LOGGER.info("Cantidad de elementos en secondList : " + secondList.size());
		
	}

}
