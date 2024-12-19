package com.pvr.shopping.impl_ording;
import com.pvr.shopping.interfacesample.Order;


public class MobileTools implements Order {
	
	private static MobileTools mobiletools = new MobileTools();
	
	public static void setMobiletools(MobileTools mobiletools) {
		MobileTools.mobiletools = mobiletools;
	}
	
	public static MobileTools getMobiletools() {
		return mobiletools;
	}

	

	private MobileTools() {
		
	}
	
	@Override
	public void ordering() {
		System.out.println("i am buying bluetooth Headphones ....... ");
	}


}
