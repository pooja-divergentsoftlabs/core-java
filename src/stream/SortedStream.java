package stream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Class for stream using sorted for sorting the given numbers
 * 
 * @author Pooja Patidar
 *
 */

public class SortedStream {
	
	public static final Logger myLogger = Logger.getLogger("/core-java/src/stream/SortedStream.java");
	
	public static void demo() {
		List<Integer> numbers = List.of(21,2,16,13,14);
		List<Integer> sortednumbers = numbers.stream().sorted().collect(Collectors.toList());
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO,"Numbers:"+numbers);
		myLogger.log(Level.INFO,"Sorted Numbers:"+sortednumbers);
	}
	
	public static void main(String[] args) {
		demo();
	}

}
