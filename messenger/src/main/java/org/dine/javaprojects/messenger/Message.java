package org.dine.javaprojects.messenger;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	Message(){
		
	}
	Message(String mto, String mfrom, String msg){
		this.mto=mto;
		this.mfrom=mfrom;
		this.msg=msg;
	}
	long id;
	String mto;
	String mfrom;
	String msg;
	Date dt;
	public String getMto() {
		return mto;
	}
	public void setMto(String mto) {
		this.mto = mto;
	}
	public String getMfrom() {
		return mfrom;
	}
	public void setMfrom(String mfrom) {
		this.mfrom = mfrom;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
