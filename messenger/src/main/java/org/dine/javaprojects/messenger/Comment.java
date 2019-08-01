package org.dine.javaprojects.messenger;


import java.util.List;

public class Comment {

	long id;
	String comment;
	long msgId; //Message msg
	long likeCount;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public long getMsg() {
		return msgId;
	}
	public void setMsg(long msgId) {
		this.msgId = msgId;
	}
	public long getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}
	

	
	
}
