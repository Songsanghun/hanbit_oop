package hospital;

public class Doctors extends Member{
	private String docPosition,majorTreat;

	public void setMajorTreat(String majorTreat){
		this.majorTreat = majorTreat;
	}
	public String getMajorTreat(){
		return majorTreat;
	}
	public void setDocPosition(String docPosition){
		this.docPosition = docPosition;
	}
	public String getDocPosition(){
		return docPosition;
	}
	
	@Override
	public String toString() {
		return String.format(
				"의사ID : %s\n"
				+ "담당 진료 과목 : %n"
				+ "성명 : %s\n"
				+ "성별 : %s\n"
				+ "전화번호 : %s\n"
				+ "이메일 : %s\n"
				+ "직급 : %s\n",
				uid,
				majorTreat,
				name,
				getGender(ssn),
				phone,
				email,
				docPosition			
				);
	}
}