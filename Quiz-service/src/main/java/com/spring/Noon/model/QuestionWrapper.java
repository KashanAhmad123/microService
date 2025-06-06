/* Question Wrapper is created for user end only because our end user is student and 
 * they required to see only neccessary part of quiz
 * i.e., title & options in a quiz
 */

package com.spring.Noon.model;

import lombok.Data;

@Data
public class QuestionWrapper {
	
	private Integer id;
	private String questionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	
	public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3,
			String option4) {
		super();
		this.id = id;
		this.questionTitle = questionTitle;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	
	

}
