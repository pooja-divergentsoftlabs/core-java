package stream;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Class for stream using map
 * 
 * @author Pooja Patidar
 *
 */

public class MapStream {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/stream/MapStream.java");
	
	public static void demo() {
		List<Integer> number = List.of(2,3,4,5);
		List<Integer> square = number.stream().map(i->i*i).collect(Collectors.toList());
		List<Integer> cube = number.stream().map(i->i*i*i).collect(Collectors.toList());
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO,"Number"+number);
		myLogger.log(Level.INFO,"Square:"+square);
		myLogger.log(Level.INFO,"Cube:"+cube);
		
	}
	
	public static void main(String[] args) {
		demo();
	}

}
