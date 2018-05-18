package it.polito.tdp.flight.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.flight.db.FlightDAO;

public class Model {
	FlightDAO fdao=null;
	List<Airport> airports;
	List<Airline> airlines;
	List<Route> routes;
	
	AirlineIdMap airlineIdMap;
	AirportIdMap airportIdMap;
	RouteIdMap routeIdMap;
	
	public Model() {
		fdao=new FlightDAO();
		airlineIdMap=new AirlineIdMap();
		airportIdMap=new AirportIdMap();
		routeIdMap=new RouteIdMap();
		
//		airports=new ArrayList<Airport>();
//		airlines=new ArrayList<Airline>();

		List<Airline> airlines = fdao.getAllAirlines(airlineIdMap);
		System.out.println(airlines);

		List<Airport> airports = fdao.getAllAirlines(airportIdMap);
		System.out.println(airports);

		List<Route> routes = fdao.getAllRoutes(airlineIdMap,airportIdMap,routeIdMap);;
		System.out.println(routes);
		
	}
}
