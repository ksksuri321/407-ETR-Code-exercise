package com.suresh.in.bean;

import java.util.HashMap;
import java.util.Map;

public class TollMaster {

	public TollMaster() {
		// TODO Auto-generated constructor stub
	}
	public static Map<String, String> masterToll = new HashMap<>();
	public static Map<String, String> getMasterToll () {return masterToll;};
	public static void putMasterToll(String key, String value) {masterToll.put(key, value);}
	
}
