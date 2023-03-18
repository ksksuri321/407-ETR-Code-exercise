package com.suresh.in.bean;

import java.util.TreeMap;

public class TollMaster {

	public TollMaster() {
		// TODO Auto-generated constructor stub
	}
	public static TreeMap<String, Integer> masterToll = new TreeMap<>();
	public static TreeMap<String, Integer> getMasterToll () {return masterToll;};
	public static void putMasterToll(String key, Integer value) {masterToll.put(key, value);}
	
}
