package com.ecommerce;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EProduct {
	
	private long ID;
    private String name;
    private BigDecimal price;
    private Date dateAdded;
    
    private List<Color> colors;
    private Collection<ScreenSizes> screenSizes;    
    private Set<OS> os;
    private Map finance;
	
    public EProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

//	public Collection<ScreenSizes> getScreenSizes() {
	public Collection<ScreenSizes> getScreensizes() {	//s of the size in getScreensizes is now small
														//The link that helped to resolve this error
														//https://forum.hibernate.org/viewtopic.php?p=2354734
		//Developer comment: I think this is a common error that comes with beans where if the first letter 
		//of the property of the bean is in lower case the next letter needs to be in upper case

		return screenSizes;
	}

//	public void setScreenSizes(Collection<ScreenSizes> screenSizes) {
	public void setScreensizes(Collection<ScreenSizes> screenSizes) {   //s of the size in setScreensizes is
														//now small, The link that helped to resolve this error
														//https://forum.hibernate.org/viewtopic.php?p=2354734
		//Developer comment: I think this is a common error that comes with beans where if the first letter 
		//of the property of the bean is in lower case the next letter needs to be in upper case
		
		this.screenSizes = screenSizes;
	}

	public Set<OS> getOs() {
		return os;
	}

	public void setOs(Set<OS> os) {
		this.os = os;
	}

	public Map getFinance() {
		return finance;
	}

	public void setFinance(Map finance) {
		this.finance = finance;
	}
    
    



}
