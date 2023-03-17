package com.suresh.in.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.in.bean.CostTripMaster;
import com.suresh.in.bean.DistanceAndCost;
import com.suresh.in.bean.InterChangesBean;
import com.suresh.in.bean.Location;
import com.suresh.in.bean.RequestInput;
import com.suresh.in.bean.TollMaster;
import com.suresh.in.bean.ToolTreeMapMaster;

@RestController
public class Assignment407TripCalculatorController {
	
	@Value("${toll.rate}")
	private Double tollRate;

	@PostMapping("/loaddata")
	public ResponseEntity<String> postJsonToJavaObject(@RequestBody InterChangesBean body)
	{
		if (body.getLocations() != null)
		{
			Map<String, Location> locations = body.getLocations();
			locations.forEach( (k,v) -> {TollMaster.putMasterToll(v.getName(), k);
			ToolTreeMapMaster.putMasterToll(new Integer(k), v.getName());});
			
			locations.forEach( (k,v) -> {
					CostTripMaster.putTripMaster(k+"-"+v.getRoutes().get(0).getToId(), v.getRoutes().get(0).getDistance());
					//System.out.println("Key: " + k + ": Name: " + v.getName() +" : "+v.getRoutes().get(0).getToId()+ " => "+v.getRoutes().get(0).getDistance());
					if (v.getRoutes().size() > 1)
					{
						CostTripMaster.putTripMaster(k+"-"+v.getRoutes().get(1).getToId(), v.getRoutes().get(1).getDistance());
						//System.out.println(v.getRoutes().get(1).getToId()+ " => "+v.getRoutes().get(1).getDistance());
					}
				});
			return new ResponseEntity("Interchanges Data Loaded Successfully", null, HttpStatus.CREATED);
		}
		else
		{
			return new ResponseEntity("Interchanges Data Failed to load", null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/costoftrip")
	public ResponseEntity<DistanceAndCost> costOfTrip(@RequestBody RequestInput body)
	{
		//System.out.println(body.getStartName()+" - "+body.getEndName());
		DistanceAndCost distanceAndCost = new DistanceAndCost();
		String startName = body.getStartName();
		String endName = body.getEndName();
		if(TollMaster.getMasterToll().get(startName) != null &&
				TollMaster.getMasterToll().get(endName) != null)
		{
			int start = Integer.parseInt(TollMaster.getMasterToll().get(startName));
			int end = Integer.parseInt(TollMaster.getMasterToll().get(endName));
			double  distance = 0;
			double cost = 0;
			//System.out.println(start+" - "+end);
			if (start < end)
			{
				for (int i=start; i<=end; i++)
				{
					if (CostTripMaster.getTripMaster().get(i+"-"+(i+1)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i+1));
						//System.out.println(i+"-"+(i+1)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i+1)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i+2)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i+2));
						//System.out.println(i+"-"+(i+2)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i+2)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i+3)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i+3));
						//System.out.println(i+"-"+(i+3)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i+3)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i+4)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i+4));
						//System.out.println(i+"-"+(i+4)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i+4)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i+5)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i+5));
						//System.out.println(i+"-"+(i+5)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i+5)));
					}
					//System.out.println("distance =>  "+distance);
				}
			}
			
			if (start > end)
			{
				for (int i=start; i>end; i--)
				{
					if (CostTripMaster.getTripMaster().get(i+"-"+(i-1)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i-1));
						//System.out.println(i+"-"+(i-1)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i-1)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i-2)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i-2));
						//System.out.println(i+"-"+(i-2)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i-2)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i-3)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i-3));
						//System.out.println(i+"-"+(i-3)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i-3)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i-4)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i-4));
						//System.out.println(i+"-"+(i-4)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i-4)));
					}
					else if (CostTripMaster.getTripMaster().get(i+"-"+(i-5)) != null)
					{
						distance = distance + CostTripMaster.getTripMaster().get(i+"-"+(i-5));
						//System.out.println(i+"-"+(i-5)+" => "+CostTripMaster.getTripMaster().get(i+"-"+(i-5)));
					}
					//System.out.println("distance =>  "+distance);
				}
			}
	
			cost = distance*tollRate;
			distanceAndCost.setDistance(distance);
			distanceAndCost.setCost(cost);
			//System.out.println("distance =>  "+distance);
			//System.out.println("cost =>  "+cost);
			return new ResponseEntity(distanceAndCost, null, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity(distanceAndCost, null, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/tolls")
	public ResponseEntity<TreeMap<Integer, String>> getTollsList()
	{
		if (ToolTreeMapMaster.getMasterToll() != null)
		{
			TreeMap tollsMap = ToolTreeMapMaster.getMasterToll();
			return new ResponseEntity(ToolTreeMapMaster.getMasterToll(), null, HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity(null, null, HttpStatus.NOT_FOUND);
		}

	}
}
