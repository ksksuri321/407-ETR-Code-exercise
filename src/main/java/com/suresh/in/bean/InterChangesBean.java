package com.suresh.in.bean;

import java.util.HashMap;
import java.util.Map;

public class InterChangesBean{
	Map<String, Location> locations = new HashMap<String, Location>();

	public Map<String, Location> getLocations() {
		return locations;
	}

	public void setLocations(Map<String, Location> locations) {
		this.locations = locations;
	}
	}
