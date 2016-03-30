package com.builder.www;

import java.util.*;

public class Builder {
	List<sender> lsend=new ArrayList<sender> ();
	public void produceEmail(int i){
		for (int j = 0; j < i; j++) {
			lsend.add(new Mailsender());
		}
	}
	public void produceMessage(int i){
		for (int j = 0; j < i; j++) {
			lsend.add(new Messagesend());
		}
	}
}
