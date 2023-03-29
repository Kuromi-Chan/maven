package org.example;

public class Tester {

	public String Name;
	public String SurName;
	public int ExperienceInYears;
	public String EnglishLevel;
	public double Salary;


	public Tester() {

	}

	public Tester(String name) {
		this.Name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.SurName = surname;
	}

	public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
		this(name, surname);
		this.ExperienceInYears = experienceInYears;
		this.EnglishLevel = englishLevel;
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Name: " + Name + "\nSurname: " + SurName + "\nExperience in years: " +
			ExperienceInYears + "\nEnglish Level: " + EnglishLevel + "\nSalary: " + Salary;
	}


	public int testMethod(int a, int b) {
		return a + b;
	}

	public double testMethod(double a, double b) {
		return a + b;
	}

	public int testMethod(int a, int b, int c) {
		return a + b + c;
	}

	public static String print() {
		return "Hello, this is a static method!";
	}
}
