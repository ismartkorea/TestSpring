package kr.co.hibiznet.test.vo;

import java.util.Date;

public class TestVO {

	private String id;
	private int    no;
	private String name;
	private String title;
	private String content;
	private int    viewCount;
	private Date regDate;
	private String regUser;
	private Date upDate;
	private String upUser;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getRegUser() {
		return regUser;
	}
	public void setRegUser(String regUser) {
		this.regUser = regUser;
	}
	public Date getUpDate() {
		return upDate;
	}
	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}
	public String getUpUser() {
		return upUser;
	}
	public void setUpUser(String upUser) {
		this.upUser = upUser;
	}
	
	@Override
	public String toString() {
		return "TestVO [id=" + id + ", no=" + no + ", name=" + name + ", title=" + title + ", content=" + content
				+ ", viewCount=" + viewCount + ", regDate=" + regDate + ", regUser=" + regUser + ", upDate=" + upDate
				+ ", upUser=" + upUser + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
		result = prime * result + ((regUser == null) ? 0 : regUser.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((upDate == null) ? 0 : upDate.hashCode());
		result = prime * result + ((upUser == null) ? 0 : upUser.hashCode());
		result = prime * result + viewCount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestVO other = (TestVO) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		if (regDate == null) {
			if (other.regDate != null)
				return false;
		} else if (!regDate.equals(other.regDate))
			return false;
		if (regUser == null) {
			if (other.regUser != null)
				return false;
		} else if (!regUser.equals(other.regUser))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (upDate == null) {
			if (other.upDate != null)
				return false;
		} else if (!upDate.equals(other.upDate))
			return false;
		if (upUser == null) {
			if (other.upUser != null)
				return false;
		} else if (!upUser.equals(other.upUser))
			return false;
		if (viewCount != other.viewCount)
			return false;
		return true;
	}
	

	
	
}
