package com.lcy.bean;
/**
 * 
 * @author lcy
 * 描述人员管理的类（测试）
 *
 */
@SuppressWarnings("serial")
public class People implements java.io.Serializable {
	//Fields属性
	private Integer id;	
	private String name;
	private String sex;
	
	//Constructors
	/**default constrctor **/
	public People() {
		
	}
	
	/**full constrctor **/
	public People(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
	//Property accessors属性访问器
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
