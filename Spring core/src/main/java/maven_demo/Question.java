package maven_demo;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question{
	private int questionId;
	private String question;
	private List<String> answers;
	private Set<String> answers1;
	private Map<Integer,String> answers2;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Set<String> getAnswers1() {
		return answers1;
	}
	public void setAnswers1(Set<String> answers1) {
		this.answers1 = answers1;
	}
	public Map<Integer, String> getAnswers2() {
		return answers2;
	}
	public void setAnswers2(Map<Integer, String> answers2) {
		this.answers2 = answers2;
	}
	public void Details()
	{
		System.out.println(getQuestionId()+":"+getQuestion());
		System.out.println("answers in List form"+answers);
		System.out.println("answers in Set form"+answers1);
		System.out.println("answers in Map form"+answers2);
	}
}


