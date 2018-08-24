package demo.exception;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GeoCache {
	private int acc_id;
	private String acc_name;
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAcc_name() {
		return acc_name;
	}
	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}
	public GeoCache(int acc_id, String acc_name) {
		this.acc_id = acc_id;
		this.acc_name = acc_name;
	}
	public GeoCache() {
		this.acc_id = 10;
		this.acc_name = "abcd";
	}
}



  
