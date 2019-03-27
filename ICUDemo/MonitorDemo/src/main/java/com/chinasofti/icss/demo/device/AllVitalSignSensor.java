package com.chinasofti.icss.demo.device;

import com.chinasofti.icss.demo.entity.Patient;

public class AllVitalSignSensor extends BloodPressureSensor {

	public AllVitalSignSensor(Patient patient) {
		super(patient);
	}

	@Override
	public void run() {
	}

	@Override
	public void collectBodyTemperature() {
		// TODO Auto-generated method stub
		super.collectBodyTemperature();
	}

	@Override
	public void collectPulseRate() {
		// TODO Auto-generated method stub
		super.collectPulseRate();
	}

	@Override
	public void collectBreathRate() {
		// TODO Auto-generated method stub
		super.collectBreathRate();
	}

}
