package test.sql;

/**
 * 
 * @author 김소연
 * @since 2022.05.03
 * @version v.1.0
 */
public class MemberSQL {
	public final int SEL_MEMBER_INFO = 1001;

	// 코드 입력 받으면 그에 맞는 질의명령 반환 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch (code) {
		case SEL_MEMBER_INFO:
			buff.append("SELECT ");
			buff.append("	id, name, mail ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	isshow = 'Y' ");
			buff.append("	mno = ? ");
			break;
		}
		return buff.toString();
	}
}
