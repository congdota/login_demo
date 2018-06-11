package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class JsonAction {
	private String name = "cong";
	private String[] listProvince = {"hanoi", "hcm", "danang", "cantho"};
	private int age = 27;
	private int[] maTinh = {123,343,234,455};
	private List<String> listDistrict = new ArrayList<String>();
	private Map<String, String> village = new HashMap<String, String>();

	public JsonAction(){
		listDistrict.add("Huyen1");
		listDistrict.add("huyen2");
		listDistrict.add("huyen3");
		listDistrict.add("huyen4");
		listDistrict.add("huyen5");

		village.put("xa1", "value1");
		village.put("xa2", "value2");
		village.put("xa3", "value3");
		village.put("xa4", "value4");
		village.put("xa5", "value5");
	}

	public String execute() {
		return Action.SUCCESS;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getListProvince() {
		return listProvince;
	}

	public void setListProvince(String[] listProvince) {
		this.listProvince = listProvince;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int[] getMaTinh() {
		return maTinh;
	}

	public void setMaTinh(int[] maTinh) {
		this.maTinh = maTinh;
	}

	public List<String> getListDistrict() {
		return listDistrict;
	}

	public void setListDistrict(List<String> listDistrict) {
		this.listDistrict = listDistrict;
	}

	public Map<String, String> getVillage() {
		return village;
	}

	public void setVillage(Map<String, String> village) {
		this.village = village;
	}
	
}
