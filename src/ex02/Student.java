package ex02;

public class Student {
	private String name;
	private int score;
	
	public Student(String n, int s) {
		// TODO �ڵ� ������ ������ ����
		this.name = n;
		this.score = s;
	}
	public void info() {
		System.out.println(name+"�� ���� :"+score);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
