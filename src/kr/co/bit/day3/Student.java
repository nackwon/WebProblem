package kr.co.bit.day3;

public class Student {
	
	private String no;
	private String mail;
	private String k_score;
	private String e_score;
	private String m_score;
	private String s_score;
	private String h_score;
	private String score;
	private String teacher;
	private String archivement;
	private String region_code;
	
	public String getM_score() {
		return m_score;
	}
	public void setM_score(String m_score) {
		this.m_score = m_score;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getK_score() {
		return k_score;
	}
	public void setK_score(String k_score) {
		this.k_score = k_score;
	}
	public String getE_score() {
		return e_score;
	}
	public void setE_score(String e_score) {
		this.e_score = e_score;
	}
	public String getS_score() {
		return s_score;
	}
	public void setS_score(String s_score) {
		this.s_score = s_score;
	}
	public String getH_score() {
		return h_score;
	}
	public void setH_score(String h_score) {
		this.h_score = h_score;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getArchivement() {
		return archivement;
	}
	public void setArchivement(String archivement) {
		this.archivement = archivement;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public Student(String no, String mail, String k_score, String e_score, String m_score, String s_score, String h_score, String score,
			String teacher, String archivement, String region_code) {
		this.no = no;
		this.mail = mail;
		this.k_score = k_score;
		this.e_score = e_score;
		this.m_score = m_score;
		this.s_score = s_score;
		this.h_score = h_score;
		this.score = score;
		this.teacher = teacher;
		this.archivement = archivement;
		this.region_code = region_code;
	}
	
	
}

