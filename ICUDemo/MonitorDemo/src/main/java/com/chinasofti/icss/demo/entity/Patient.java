package com.chinasofti.icss.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Patient
 * 
 * @author redbeyond
 *
 */
@NoArgsConstructor
@Data
public class Patient extends Person {
	
	private double bodyTemperature;
	private int pulseRate;
	private int breathRate;
	private int bloodPressureH;
	private int bloodPressureL;
	
	public void simulate() {
	}
}
