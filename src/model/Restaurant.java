package model;

public class Restaurant {
	
	private String name;
	private int nit;
	private String administratorName;
	
	public Restaurant(String n,int ni,String an) {
		name = n;
		nit = ni;
		administratorName = an;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public String getAdministratorName() {
		return administratorName;
	}

	public void setAdministratorName(String administratorName) {
		this.administratorName = administratorName;
	}

}
