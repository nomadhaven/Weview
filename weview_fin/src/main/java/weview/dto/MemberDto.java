package weview.dto;

import java.io.Serializable;
import java.util.Date;

/*
CREATE TABLE MEMBER(
	SEQ NUMBER(10) PRIMARY KEY,
	ID VARCHAR2(50) UNIQUE,
	PWD VARCHAR2(50) NOT NULL,
	NAME VARCHAR2(50) NOT NULL,
	EMAIL VARCHAR2(50) UNIQUE,
	NICKNAME VARCHAR2(50) UNIQUE,
	 CREATEDATE DATE,
    PROFILE INTEGER
);


INSERT INTO MEMBER(SEQ, ID, PWD, NAME, EMAIL, NICKNAME)
VALUES(1,'aaa','111','최철','test@gmail.com','테스트');


*/


public class MemberDto implements Serializable{	// = 직렬화
	
	/*
	private int seq;
	private String id;
	private String pass;
	private String name;
	private String email;
	private String nickname;
	private String pwd;
	*/
	
	private int seq_member;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String nickname;
	private Date createdate;
	
	
	
	public MemberDto() {
	}


	public MemberDto(int seq_member, String id, String pwd, String name, String email, String nickname, Date createdate
			) {
		super();
		this.seq_member = seq_member;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.nickname = nickname;
		this.createdate = createdate;
		
	}
	
	//정보 수정
	public MemberDto(int seq_member, String id, String pwd, String nickname) {
		super();
		this.seq_member = seq_member;
		this.id = id;
		this.pwd = pwd;
		this.nickname = nickname;	
		
	}


	public int getSeq_user() {
		return seq_member;
	}


	public void setSeq_user(int seq_member) {
		this.seq_member = seq_member;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public Date getCreatedate() {
		return createdate;
	}


	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}



	@Override
	public String toString() {
		return "MemberDto [seq_member=" + seq_member + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email
				+ ", nickname=" + nickname + ", createdate=" + createdate + "]";
	}
	
	
}
