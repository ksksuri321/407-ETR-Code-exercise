/**
 * 
 */
package com.suresh.in.bean;

import java.util.ArrayList;

/**
 * @author suresh
 *
 */

public class Location{
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public ArrayList<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}
	private String name;
	private double lat;
	private double lng;
	private ArrayList<Route> routes;
}