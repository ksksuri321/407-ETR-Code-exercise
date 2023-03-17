package com.suresh.in.bean;

import java.util.TreeMap;
import java.util.Map;

public class ToolTreeMapMaster {

	public ToolTreeMapMaster() {
		// TODO Auto-generated constructor stub
	}
	public static TreeMap<Integer, String> masterToll = new TreeMap<>();
	public static TreeMap<Integer, String> getMasterToll () {return masterToll;};
	public static void putMasterToll(Integer key, String value) {masterToll.put(key, value);}
	
}