package homework.helperclass;

public class IPAddress implements Comparable<IPAddress> {
	private long ipFrom;
	private long ipTo;
	private String countryCode;
	private String countryName;
	private String regionName;
	private String cityName;

	public long getIpFrom() {
		return ipFrom;
	}


	public void setIpFrom(long ipFrom) {
		this.ipFrom = ipFrom;
	}


	public long getIpTo() {
		return ipTo;
	}


	public void setIpTo(long ipTo) {
		this.ipTo = ipTo;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	public String getRegionName() {
		return regionName;
	}


	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	@Override
	public int compareTo(IPAddress newAddress) {
		if (this.ipFrom > newAddress.ipFrom) {
			return 1;
		} else if (this.ipFrom < newAddress.ipFrom){
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		String printOut = ("\n" + this.ipFrom + "\t|\t" + 
							this.ipTo + "\t|\t" + 
							this.countryCode + "\t|\t" +  
							this.countryName + "\t|\t" + 
							this.regionName + "\t|\t" + 
							this.cityName + "\t|");
		return printOut;
	}
	
}
