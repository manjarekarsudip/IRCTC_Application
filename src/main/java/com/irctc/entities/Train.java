package com.irctc.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {

	private String trainId;
	
	private String trainNo;
	
	private List <List<Integer>> seats;
	
	private Map<String, String> stationTimes;
	
	private List <String> stations;

	public String getTrainid() {
		return trainId;
	}

	public void setTrainid(String trainid) {
		this.trainId = trainid;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public List<List<Integer>> getSeats() {
		return seats;
	}

	public void setSeats(List<List<Integer>> seats) {
		this.seats = seats;
	}

	public Map<String, String> getStationTimes() {
		return stationTimes;
	}

	public void setStationTimes(Map<String, String> stationTimes) {
		this.stationTimes = stationTimes;
	}

	public List<String> getStations() {
		return stations;
	}

	public void setStations(List<String> stations) {
		this.stations = stations;
	}

	public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, String> stationTimes,
			List<String> stations) {
		super();
		this.trainId = trainId;
		this.trainNo = trainNo;
		this.seats = seats;
		this.stationTimes = stationTimes;
		this.stations = stations;
	}

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTrainInfo() {
		return String.format("Train ID: %s Train No: %s", trainId, trainNo);
	}
	
}
