package com.training.movie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MovieTicketSystem {
	public static final int MAXTICKETS = 100;
	private Map<Integer, Set<Integer>> bookings;
	private Map<Integer, Integer> availableTickets;

	public MovieTicketSystem() {
		super();
		this.bookings = new HashMap<Integer, Set<Integer>>();
		this.availableTickets = new HashMap<Integer, Integer>();
	}

	public boolean bookTicket(int customerId, int movieId) {
		if (!bookings.containsKey(movieId)) {
			availableTickets.put(movieId, MAXTICKETS);
		}
		if (bookings.containsKey(customerId) && bookings.get(customerId).contains(movieId)) {
			return false;
		}
		if (availableTickets.get(movieId) <= 0)
			return false;
		
		if (!bookings.containsKey(customerId))
			bookings.put(customerId, new HashSet<Integer>());
		bookings.get(customerId).add(movieId);
		availableTickets.put(movieId, availableTickets.get(movieId) - 1);
		return true;
	}

	public boolean cancelTicket(int customerId, int movieId) {
		if (!bookings.containsKey(customerId) || bookings.get(customerId).contains(movieId)) {
			return false;
		}
		bookings.get(customerId).remove(movieId);
		if (bookings.get(customerId).isEmpty()) {
			bookings.remove(customerId);
		}
		availableTickets.put(movieId, availableTickets.get(movieId) + 1);
		return true;
	}
	public boolean isBooked(int customerId, int movieId) {
		return bookings.containsKey(customerId)&& bookings.get(customerId).contains(movieId);
	}
	
	public int getAvailableTickets( int movieId) {
		return availableTickets.getOrDefault(availableTickets, availableTickets.getOrDefault(movieId, MAXTICKETS));
	}

}
