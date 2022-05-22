package githrd.sql;
	// jvm이 기본생성자 호출 
public class MemberSQL {
	public final int SEL_MNOID			= 1001;
	public final int SEL_MNOINFO		= 1002;
	public final int SEL_UPTEL			= 1003;
	public final int SEL_INSERTINFO		= 1004;

	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_MNOID :
			buff.append("SELECT ");
			buff.append("	mno, id ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case SEL_MNOINFO:
			buff.append("SELECT ");
			buff.append("	 mno, name, id, pw, mail, tel, avt, gen, joindate ");
			buff.append("FROM ");
			buff.append("	 member ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			break;
		case SEL_UPTEL:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	tel = ? ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			break;
		case SEL_INSERTINFO:
			buff.append("INSERT INTO ");
			buff.append("	member(mno, name, id, pw, mail, tel, avt, gen) ");
			buff.append("VALUES ");
			buff.append("	?, ?, ?, ?, ?, ?, ?, ? ");
	
		}
		
		return buff.toString();
	}
}
