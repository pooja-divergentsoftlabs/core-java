package stream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Class for stream using filter
 * 
 * @author Pooja Patidar
 *
 */


public class FilterStream {
	
	public static final Logger myLogger = Logger.getLogger("/core-java/src/stream/FilterStream.java");
	
	public static void demo() {
		List<String> names = List.of("Pooja","Avni","Nidhi","Pranay");
		List<String> newnames = names.stream().filter(e->e.endsWith("i")).collect(Collectors.toList());
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO,""+names);
		myLogger.log(Level.INFO,"New Names:"+newnames);
	}

	public static void main(String[] args) {
		
		demo();

	}

}
