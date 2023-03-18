package com.suresh.in.bean;

import java.util.TreeMap;

public class TollTreeMapMaster {

	public TollTreeMapMaster() {
		// TODO Auto-generated constructor stub
	}
	public static TreeMap<Integer, String> masterToll = new TreeMap<>();
	public static TreeMap<Integer, String> getMasterToll () {return masterToll;};
	public static void putMasterToll(Integer key, String value) {masterToll.put(key, value);}
	
}