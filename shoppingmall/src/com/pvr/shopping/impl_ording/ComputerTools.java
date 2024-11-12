package com.pvr.shopping.impl_ording;
import com.pvr.shopping.interfacesample.Order;

public class ComputerTools implements Order {
	
	private static ComputerTools computertools = new ComputerTools();
	
	public static void setComputertools(ComputerTools computertools) {
		ComputerTools.computertools = computertools;
	}
	
	public static ComputerTools getComputertools() {
		return computertools;
	}
	
	private ComputerTools () {
		
	}
	 @Override
	public void ordering() {
		System.out.println("i am buying a harddisk .....");
	}

}
