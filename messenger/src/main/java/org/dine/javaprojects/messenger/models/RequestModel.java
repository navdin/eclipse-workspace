package org.dine.javaprojects.messenger.models;

import java.util.Date;

public class RequestModel {

	RequestModel(){
		
	}
	
	RequestModel(long likeBySim, long dislikeBySim, long sim, long msgFromSim, Date msgDt, long commentFromSim, String commentTime){
		this.msgFromSim=msgFromSim;
		this.msgDt=msgDt;
		this.commentFromSim=commentFromSim;
		this.commentTime=commentTime;
		this.sim=sim;
		this.likeBySim=likeBySim;
		this.dislikeBySim=dislikeBySim;
	}
	long msgFromSim;
	Date msgDt;
	long commentFromSim;
	String commentTime;
	long sim;
	long likeBySim;
	long dislikeBySim;
	
	
	
	public long getLikeBySim() {
		return likeBySim;
	}
	public void setLikeBySim(long likeBySim) {
		this.likeBySim = likeBySim;
	}
	public long getDislikeBySim() {
		return dislikeBySim;
	}
	public void setDislikeBySim(long dislikeBySim) {
		this.dislikeBySim = dislikeBySim;
	}
	public long getMsgFromSim() {
		return msgFromSim;
	}
	public void setMsgFromSim(long msgFromSim) {
		this.msgFromSim = msgFromSim;
	}
	public Date getMsgDt() {
		return msgDt;
	}
	public void setMsgDt(Date msgDt) {
		this.msgDt = msgDt;
	}
	public long getCommentFromSim() {
		return commentFromSim;
	}
	public void setCommentFromSim(long commentFromSim) {
		this.commentFromSim = commentFromSim;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public long getSim() {
		return sim;
	}
	public void setSim(long sim) {
		this.sim = sim;
	}
	

	
}
