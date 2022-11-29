package com.chainsys.day2;

public class hospital {

	/* hospital name
	 * address
	 * ph.no.
	 * ambulance
	 * dr.count
	 * nurse count
	 * bed count 
	 * bed availability
	 * bed charges
	 * distance from major railway station, bus stand
	 * oxygen cylinder availability, count
	 * blood storage 
	 */
	
	public static void main(String[] args) {
		String name_ofHospital=" \t Zyx speciality Hospitals " , address="no.321,Maduravoyal,Chennai,Tamilnadu", bedCharges="INR. 750/day";
		int no_ofDoctors= 34, no_ofNurses=78, no_ofBed=100, 
		distanceFromRailwaystation=24,DistanceFromBusStand=15, OxygenCylinder=48;
		boolean ambulance=true , bedAvailability=false ,OxygenAvailability=true,BloodStorage=true;
		long phoneNumber= 23456789;
		System.out.println("\n Name of the Hospital: \t"+name_ofHospital+"\n Address of the Hospital:\t "+address+
		"\n Availability of Ambulance: \t"+ambulance+"\n Number of Doctors: \t"+ no_ofDoctors+
		"\n Number of Nurses: \t" +no_ofNurses+"\n Number of Beds: \t"+no_ofBed+"\n Availability of Bed \t"+bedAvailability+
		"\n Charge for Bed \t"+bedCharges+"\n Distance of the Hospital from Major Railway Station (in KM): \t" + distanceFromRailwaystation +
		"\n Distance of the Hospital from major Bus Stand (in KM) : \t"+DistanceFromBusStand+"\n Availaility of Oxygen Cylinder: \t"+OxygenAvailability+
		"\n Count of Oxygen Cylinder:  \t"+OxygenCylinder+"\n Blood Storage Availability: \t"+BloodStorage);
		 
	}

}
