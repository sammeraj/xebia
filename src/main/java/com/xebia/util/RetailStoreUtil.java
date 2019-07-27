package com.xebia.util;

import java.util.Date;

import com.xebia.model.BillDetails;
import com.xebia.model.UserType;

public class RetailStoreUtil {

	public  static Double getNetPayableAmtAfterDiscount(Double grossAmount,String discount){
		
		Double disc=0.0;
		if(discount.contains("%")){
			discount=discount.replace("%", "");
			disc=(Double.valueOf(discount)/100)*grossAmount;
		}else{
			disc=Double.valueOf(discount);
		}
		Double netAmount=grossAmount-disc;
		return netAmount; 
	}
	
	public static BillDetails getBillDetailsBasedOnId(int id){
		
		BillDetails billDetails=new BillDetails();
		// setting the BillDetails object
		billDetails.setBillDate(new Date());
		billDetails.setExistCustTimePeriod(1.5);
		billDetails.setExistingCustomer(false);
		billDetails.setGrossAmount(298.0);
		billDetails.setUserType(UserType.EMPLOYEE);
		return billDetails;
	}
}
