package com.jh.freeboard.dto;

import java.sql.Timestamp;

public class FreeboardDto {

	private int fnum;
	private String fname;
	private String ftilte;
	private String fcontent;
	private Timestamp fdate;
	private int fhit;
	private String fid;
	
	public FreeboardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FreeboardDto(int fnum, String fname, String ftilte, String fcontent, Timestamp fdate, int fhit, String fid) {
		super();
		this.fnum = fnum;
		this.fname = fname;
		this.ftilte = ftilte;
		this.fcontent = fcontent;
		this.fdate = fdate;
		this.fhit = fhit;
		this.fid = fid;
	}

	public int getFnum() {
		return fnum;
	}

	public void setFnum(int fnum) {
		this.fnum = fnum;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFtilte() {
		return ftilte;
	}

	public void setFtilte(String ftilte) {
		this.ftilte = ftilte;
	}

	public String getFcontent() {
		return fcontent;
	}

	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}

	public Timestamp getFdate() {
		return fdate;
	}

	public void setFdate(Timestamp fdate) {
		this.fdate = fdate;
	}

	public int getFhit() {
		return fhit;
	}

	public void setFhit(int fhit) {
		this.fhit = fhit;
	}

	public String getFid() {
		return fid;
	}

	public void setFid(String fid) {
		this.fid = fid;
	}
	
}
