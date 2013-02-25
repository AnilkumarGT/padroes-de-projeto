package com.padraocapitalstrategy;

import java.util.Date;

public class CapitalStrategy {
	private Date expiry;
	private Date maturity;
	private int commitment;

	public double capital() {
		if(expiry == null && maturity !=null){
			return commitment * duration() * riskFactor();
		}
		if(expiry != null && maturity == null){
			if(getUnusedPercentage() != 1.0){
				return commitment * getUnusedPercentage()*duration()*riskFactor();
			}else {
				return outstandingRiskAmount()*duration()*unusedRiskFactor();
			}
		}
		return 0.0;
	}

	private int unusedRiskFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int outstandingRiskAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double getUnusedPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int riskFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int duration() {
		// TODO Auto-generated method stub
		return 0;
	}
}
