package com.ecommerce;

public class OS {
	
	private long OSID;
    private String name;
	public OS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public OS(long oSID, String name) {
//		super();
//		OSID = oSID;
//		this.name = name;
//	}
	
	public OS( String name) {
		super();
		OSID = 0;
		this.name = name;
	}

	public long getOSID() {
		return OSID;
	}

	public void setOSID(long oSID) {
		OSID = oSID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
    
    

}
