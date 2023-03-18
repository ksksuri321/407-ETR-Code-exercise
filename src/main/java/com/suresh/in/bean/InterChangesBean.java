package com.suresh.in.bean;

import java.util.TreeMap;

public class InterChangesBean{
	TreeMap<Integer, Location> locations = new TreeMap<Integer, Location>();

	public TreeMap<Integer, Location> getLocations() {
		return locations;
	}

	public void setLocations(TreeMap<Integer, Location> locations) {
		this.locations = locations;
	}
	}
