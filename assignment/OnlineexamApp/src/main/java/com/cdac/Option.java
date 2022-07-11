package com.cdac;

public class Option {

	private String option;
	private boolean isRightAnswer;

	/**
	 * @param option
	 * @param isRightAnswer
	 */
	public Option(String option, boolean isRightAnswer) {
		super();
		this.option = option;
		this.isRightAnswer = isRightAnswer;
	}

	/**
	 * @return the option
	 */
	public String getOption() {
		return option;
	}

	/**
	 * @param option the option to set
	 */
	public void setOption(String option) {
		this.option = option;
	}

	public boolean isRightAnswer() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setRightAnswer(boolean isRightAnswer) {
		this.isRightAnswer = isRightAnswer;
	}

}
