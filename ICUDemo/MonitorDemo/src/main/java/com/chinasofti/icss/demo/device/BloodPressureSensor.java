package com.chinasofti.icss.demo.device;

import com.chinasofti.icss.demo.device.interfaces.Sensor;
import com.chinasofti.icss.demo.entity.Patient;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BloodPressureSensor implements Sensor{

	protected Patient patient;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collectBodyTemperature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collectPulseRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collectBreathRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collectBloodPressureH() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collectBloodPressureL() {
		// TODO Auto-generated method stub
		
	}

}
