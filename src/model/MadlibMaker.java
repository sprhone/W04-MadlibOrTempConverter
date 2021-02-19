package model;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Feb 18, 2021
 */
public class MadlibMaker {

	private String name1;
	private String name2;
	private String place;
	private String object1;
	private String object2;
	private String ptverb;
	private String imaginaryCreature;
	
	public MadlibMaker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MadlibMaker(String name1, String name2, String place, String object1, String object2, String ptverb,
			String imaginaryCreature) {
		super();
		this.name1 = capitalizeFirstLetter(name1);
		this.name2 = capitalizeFirstLetter(name2);
		this.place = makeLowerCase(place);
		this.object1 = makeLowerCase(object1);
		this.object2 = makeLowerCase(object2);
		this.ptverb = makeLowerCase(ptverb);
		this.imaginaryCreature = makeLowerCase(imaginaryCreature);
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = capitalizeFirstLetter(name1);
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = capitalizeFirstLetter(name2);
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = makeLowerCase(place);
	}

	public String getObject1() {
		return object1;
	}

	public void setObject1(String object1) {
		this.object1 = makeLowerCase(object1);
	}

	public String getObject2() {
		return object2;
	}

	public void setObject2(String object2) {
		this.object2 = makeLowerCase(object2);
	}

	public String getPtverb() {
		return ptverb;
	}

	public void setPtverb(String ptverb) {
		this.ptverb = makeLowerCase(ptverb);
	}

	public String getImaginaryCreature() {
		return imaginaryCreature;
	}

	public void setImaginaryCreature(String imaginaryCreature) {
		this.imaginaryCreature = makeLowerCase(imaginaryCreature);
	}

	@Override
	public String toString() {
		return "MadlibMaker [name1=" + name1 + ", name2=" + name2 + ", place=" + place + ", object1=" + object1
				+ ", object2=" + object2 + ", ptverb=" + ptverb + ", imaginaryCreature=" + imaginaryCreature + "]";
	}
	
	public String capitalizeFirstLetter(String name) {
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		return name;
	}
	
	public String makeLowerCase (String someWord) {
		someWord = someWord.toLowerCase();
		return someWord;
	}
}
