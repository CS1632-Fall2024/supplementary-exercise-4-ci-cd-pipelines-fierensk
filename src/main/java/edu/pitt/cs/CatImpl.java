package edu.pitt.cs;

public class CatImpl implements Cat {

	private int catID;
	private String catName;
	private boolean isRented;

	public CatImpl(int id, String name) {
		this.catID = id;
		this.catName = name;
		this.isRented = false;
	}

	public void rentCat() {
		this.isRented = true;
	}

	public void returnCat() {
		this.isRented = false;
	}

	public void renameCat(String name) {
		this.catName = name;
	}

	public String getName() {
		return this.catName;
	}

	public int getId() {
		return this.catID;
	}

	public boolean getRented() {
		return this.isRented;
	}

	public String toString() {
		return ("ID " + this.catID + ". " + this.catName);
	}

}