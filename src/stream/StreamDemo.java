package stream;

import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Example for stream (code without stream and with stream)
 * 
 * @author Pooja Patidar
 *
 */

public class StreamDemo {

	public final static Logger myLogger = Logger.getLogger("/core-java/src/stream/StreamDemo.java");

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(13);
		list.add(2);
		list.add(21);
		list.add(16);

		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO, "" + list);

		List<Integer> listeven = new ArrayList();

		for (Integer i : list) {
			if (i % 2 == 0) {
				listeven.add(i);
			}
		}

		myLogger.log(Level.INFO, "" + listeven);

		// using stream
		Stream<Integer> stream = list.stream();
		List<Integer> newlisteven = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		myLogger.log(Level.INFO, "" + newlisteven);

		List<Integer> greaternumberlist = list.stream().filter(i -> i > 15).collect(Collectors.toList());
		myLogger.log(Level.INFO, "" + greaternumberlist);

	}
}
