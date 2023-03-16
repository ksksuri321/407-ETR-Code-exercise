package com.suresh.in.bean;

import java.util.HashMap;
import java.util.Map;

public class CostTripMaster {

	public CostTripMaster() {
		// TODO Auto-generated constructor stub
	}
	public static Map<String, Double> tripMaster = new HashMap<>();
	public static Map<String, Double> getTripMaster () {return tripMaster;};
	public static void putTripMaster(String key, Double value) {tripMaster.put(key, value);}
}
