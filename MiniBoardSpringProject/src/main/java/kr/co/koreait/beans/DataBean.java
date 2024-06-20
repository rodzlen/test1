package kr.co.koreait.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

public class DataBean {
	
	@NotEmpty
	private String data1;
	
	@NotBlank
	private String data2;
	
	@PositiveOrZero
	private int data3;
	
	

	

	public DataBean() {
		this.data1 = "ab12AB";
		this.data2 = "abc012ABC";
		
	}
	
	public int getData3() {
		return data3;
	}

	public void setData3(int data3) {
		this.data3 = data3;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public String getData1() {
		return data1;
	}

	public void setData1(String data1) {
		this.data1 = data1;
	}
	

}
