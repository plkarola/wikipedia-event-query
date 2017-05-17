package wikipedia.event.parser;

/*-
 * #%L
 * wikipedia-event-query
 * %%
 * Copyright (C) 2017 UD
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * #L%
 */
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
