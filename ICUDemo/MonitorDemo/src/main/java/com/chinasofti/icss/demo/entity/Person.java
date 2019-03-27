package com.chinasofti.icss.demo.entity;

import java.util.Date;

import com.chinasofti.icss.demo.constant.Gender;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Person
 * 
 * @author redbeyond
 *
 */
@NoArgsConstructor
@Data
public class Person {
	
	private String id;
	private String name;
	private Date birthday;
	private Gender gender;
	
}
