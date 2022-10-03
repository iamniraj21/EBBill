public class ElectricityBill {
	
	private String consumerNumber;
	private String consumerName;
	private String consumerAddress;
	private int unitsConsumed;
	private double billAmount;
	
	public String getConsumerNumber() {
		return consumerNumber;
	}
	
	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
	}
	
	public String getConsumerName() {
		return consumerName;
	}
	
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	
	public String getConsumerAddress() {
		return consumerAddress;
	}
	
	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}
	
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	
	public double getBillAmount() {
		return billAmount;
	}
	
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public void calculateBillAmount() {
		int tempunits= unitsConsumed;
		double bill=0;
		
		if (tempunits<=100) {
			bill=0;
		}
		
		if (tempunits >100 && tempunits <=300) {
			bill=(tempunits-100) * 1.5;
		}
		if (tempunits >300 && tempunits <=600) {
			bill=200 * 1.5 + (tempunits-300) * 3.5;
		}
		if (tempunits > 600 && tempunits <=1000) {
			bill=200 * 1.5 +300 * 3.5 + (tempunits-600) * 5.5;
		}
		if(tempunits > 1000) {
			bill= 200 * 1.5 +300 * 3.5 + 400 * 5.5 + (tempunits - 1000) * 7.5;
		}
		
		setBillAmount(bill);
	}	
  
		
		
		
		
		
		/*
		billAmount = 0;
		int tempUnits = unitsConsumed;
		
		if (tempUnits > 100) {
			tempUnits -= 100;
			
			if (tempUnits > 200) {
				tempUnits -= 200;
				billAmount += 200 * 1.5;
				
				if (tempUnits > 300) {
					tempUnits -= 300;
					billAmount += 300 * 3.5;
					
					if (tempUnits > 400) {
						tempUnits -= 400;
						billAmount += 400 * 5.5;
						billAmount += 400 * 7.5;
					}
						else {
							billAmount += tempUnits*5.5;
						}}
				
					else {
						billAmount += tempUnits*3.5;
					}
			}else {
				billAmount +=tempUnits * 1.5;
			*/				}			
		
	


