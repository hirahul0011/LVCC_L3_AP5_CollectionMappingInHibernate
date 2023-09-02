package com.ecommerce;

public class ScreenSizes {
	
	private long SCREENID;
    private String size;
	
    public ScreenSizes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//    public ScreenSizes(long sCREENID, String size) {
//		super();
//		SCREENID = sCREENID;
//		this.size = size;
//	}
    
    public ScreenSizes( String size) {
		super();
		SCREENID = 0;
		this.size = size;
	}

	public long getSCREENID() {
		return SCREENID;
	}

	public void setSCREENID(long sCREENID) {
		SCREENID = sCREENID;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
    
    
    
    

}
