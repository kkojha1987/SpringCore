package com.kanhaiya.bean;

import java.util.List;
import java.util.Set;

public class OrgInfo {

	private String nameArr[] = new String[2];
	private List<String> employeeNamelist;
	private Set<Integer> empIdsSet;

	public String[] getNameArr() {
		return nameArr;
	}

	public void setNameArr(String[] nameArr) {
		this.nameArr = nameArr;
	}

	public List<String> getEmployeeNamelist() {
		return employeeNamelist;
	}

	public void setEmployeeNamelist(List<String> employeeNamelist) {
		this.employeeNamelist = employeeNamelist;
	}

	public Set<Integer> getEmpIdsSet() {
		return empIdsSet;
	}

	public void setEmpIdsSet(Set<Integer> empIdsSet) {
		this.empIdsSet = empIdsSet;
	}

}
