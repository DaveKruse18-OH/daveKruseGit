package com.techelevator;

public class HomeworkAssignment {
	private int earnedMarks = 0;
	private int possibleMarks = 0;
	private String submitterName = null;
	private String letterGrade = null;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade() {
		String ret = null;				// Letter grade earned.
		double earnedGrade = ((double) earnedMarks / (double) possibleMarks) * 100d;
		if (earnedGrade >= 90d) {
			ret = "A";
		} else if ((earnedGrade >= 80d) && (earnedGrade <= 89d)) {
			ret = "B";
		} else if ((earnedGrade >= 70d) && (earnedGrade <= 79d)) {
			ret = "C";
		} else if ((earnedGrade >= 60d) && (earnedGrade <= 69d)) {
			ret = "D";
		} else {
			ret = "F";
		}
		return ret;
	}
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	
	public String getSubmitterName() {
		return submitterName;
	}
	
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
}
