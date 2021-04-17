package stream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class of stream with forEach 
 * 
 * @author Pooja Patidar
 *
 */

public class ForEachStream {
	
	public static final Logger myLogger = Logger.getLogger("/core-java/src/stream/ForEachStream.java");
	
	public static void demo() {
		List<String> colors = List.of("Red","Blue","Green","Yellow","Pink");
		colors.stream().forEach(
				
				e->{
					myLogger.setLevel(Level.FINE);
					myLogger.log(Level.INFO, e);
				}				
				);
	}
	public static void main(String[] args) {
		demo();
	}

}
