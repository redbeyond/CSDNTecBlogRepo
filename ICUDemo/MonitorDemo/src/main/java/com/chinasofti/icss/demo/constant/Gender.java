package com.chinasofti.icss.demo.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Gender {

	MALE("男"), FEMALE("女");
	private final String name;

}
