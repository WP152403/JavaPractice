/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author soonb
 * @version : 1.0
 */
public class Car2 {
	private String company = "현대자동차";
	private String model = "제네시스" ;
	private String color = "검정색";
	private int maxspeed = 225;
	private int price = 50000000;
	
	public Car2() {
	}
	
	// 필요한 경우 다양한 생성자를 추가할 수 있음
	public Car2(String newCompany, String newModel, String newColor, int newMaxspeed, int newPrice){
		company= newCompany;
		model= newModel;
		color= newColor;
		maxspeed= newMaxspeed;
		price= newPrice;
	}
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String newCompany) {
		company= newCompany;
	}
	public void setModel(String newModel) {
		model= newModel;
	}
	public void setColor(String newColor) {
		color= newColor;
	}
	public void setMaxspeed(int newMaxspeed) {
		if(newMaxspeed>=1)
		maxspeed= newMaxspeed;
	}
	public void setPrice(int newPrice) {
		if(newPrice>=1)
		price= newPrice;
	}
	

}
