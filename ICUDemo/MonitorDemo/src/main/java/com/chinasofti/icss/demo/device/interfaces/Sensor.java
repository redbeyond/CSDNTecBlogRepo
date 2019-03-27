package com.chinasofti.icss.demo.device.interfaces;

/**
 * Sensor
 * 
 * @author redbeyond
 *
 */
public interface Sensor extends Runnable {
	/**
	 * 收集体温数据
	 */
	void collectBodyTemperature();
	
	/**
	 * 收集脉率数据
	 */
	void collectPulseRate();
	
	/**
	 * 收集呼吸速率数据
	 */
	void collectBreathRate();
	
	/**
	 * 收集血压（收缩压）数据
	 */
	void collectBloodPressureH();
	
	/**
	 * 收集血压（舒张压）数据
	 */
	void collectBloodPressureL();
	
}
