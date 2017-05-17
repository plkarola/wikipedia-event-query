package wikipedia.event.parser;

import java.io.IOException;

import java.util.List;

import java.time.MonthDay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import wikipedia.event.model.Event;

/**
 * Class for querying events that occurred on a specific day of month. Events
 * are extracted from the English Wikipedia page about a specific day of month.
 */
public class EventExtractor {

	private static Logger	logger = LoggerFactory.getLogger(EventExtractor.class);

	/**
	 * Returns the web page address of the Wikipedia page about the day of
	 * month specified.
	 *
	 * @param monthDay an object that wraps the month of year and the day of
	 *                 month
	 * @return the web page address of the Wikipedia page about the day of
	 *         month specified, as a string
	 */
	private String getWikipediaURL(MonthDay monthDay) {
		return null;
	}

	/**
	 * Returns events that occurred on the day of month specified.
	 *
	 * @param monthDay an object that wraps the month of year and the day of
	 *                 month
	 * @return the list of objects that represent events that occurred on the
	 *         day of month specified
	 * @throws IOException if any I/O error occurs during the execution of the query
	 */
	public List<Event> getEvents(MonthDay monthDay) throws IOException {
		return null;
	}

	/**
	 * Returns events that occurred on the day of month specified.
	 *
	 * @param monthOfYear the month of the year (1&ndash;12)
	 * @param dayOfMonth the day of the month (1&ndash;31)
	 * @return the list of objects that represent events that occurred on the
	 *         day of month specified
	 * @throws IOException if any I/O error occurs during the execution of the query
	 */
	public List<Event> query(int monthOfYear, int dayOfMonth) throws IOException {
		return null;
	}

}
