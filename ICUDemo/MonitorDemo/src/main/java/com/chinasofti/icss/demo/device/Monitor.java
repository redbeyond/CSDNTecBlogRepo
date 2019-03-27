package com.chinasofti.icss.demo.device;

import java.util.ArrayList;
import java.util.List;

import com.chinasofti.icss.demo.device.interfaces.Sensor;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Monitor {
	private List<Sensor> sensors = new ArrayList<>();

	public void addSensor(Sensor sensor) {

		this.sensors.add(sensor);

	}
}
