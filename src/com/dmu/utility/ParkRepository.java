package com.dmu.utility;

import java.util.ArrayList;
import java.util.List;

import com.dmu.entities.Park;

public class ParkRepository {
	private static ParkRepository parkRepository = new ParkRepository();
	private static List<Park> parkList = new ArrayList<>();

	private ParkRepository() {

	}

	public static ParkRepository getParkRepository() {
		return parkRepository;
	}

	public static List<Park> getParkList() {
		return parkList;
	}

	public static void setParkList(List<Park> parkList) {
		ParkRepository.parkList = parkList;
	}

}
