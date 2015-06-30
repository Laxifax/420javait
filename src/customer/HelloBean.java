package customer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped

public class HelloBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2822628029289703967L;
	private String name;
	
	public String getName(){
		return name;
	}
	public void setNAme(String name) {
		this.name = name;
	}
}
