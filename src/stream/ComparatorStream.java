package stream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for stream using comparator for getting maximum and minimum value
 * 
 * @author Pooja Patidar
 *
 */

public class ComparatorStream {
	
	public static final Logger myLogger = Logger.getLogger("/core-java/src/stream/ComparatorStream.java");
	
	public static void demo() {
		
		List<Integer> number = List.of(21,2,16,13,14);
		Integer min = number.stream().min((x,y)->x.compareTo(y)).get(); //for getting minimum value
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO, "minimum number is:"+min);
		
		Integer max = number.stream().max((x,y)->x.compareTo(y)).get(); ///for getting maximum value
		myLogger.log(Level.INFO, "maximum number is:"+max);
		
		
	}
	
	public static void main(String[] args) {
		demo();
	}

}
