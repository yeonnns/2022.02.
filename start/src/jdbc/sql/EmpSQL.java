package jdbc.sql;
/*
 	사원들의 정보와 관련된 데이터베이스 작업을 할때 필요한 
 	질의명령을 모아놓았다가
 	요구하면 해당  질의명령을 내보내주는 클래스
 */

public class EmpSQL {
	// 코드변수
	public final int SEL_ALL 		= 1001; // select 의 약자 sel
	public final int SEL_DNOINFO 	= 1002;
	public final int SEL_JOBINFO 	= 1003;
	public final int SEL_JOBLIST 	= 1004;
	
	// 질의명령을 기억하고 있다가 요청하면 반환해주는 함수
	public String getSQL(int code) {
		// 이 함수가 할 일은 질의명령으로된 문자열을 반환해주는 일
		// 질의명령은 한행으로 작성하면 가독성에 문제가 있기 때문에 보통 줄바꿈, 들여쓰기 이용
		// 보통 줄바꿈, 들여쓰기를 이용해서 작성한다.
		
		
		// 반환값을 만들 변수
		StringBuffer buff = new StringBuffer();
		
	
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate ");
			buff.append("FROM ");
			buff.append("	emp ");
			break;
		case SEL_DNOINFO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
			buff.append("FROM ");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");
			buff.append("	AND e.deptno = ? ");
			break;
		case SEL_JOBINFO:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션없음') comm ");
			buff.append("FROM ");
			buff.append("	emp, salgrade ");
			buff.append("WHERE ");
			buff.append("	sal BETWEEN losal AND hisal ");
			buff.append("	AND job = ? ");
			break;
		case SEL_JOBLIST:
			buff.append("SELECT ");
			buff.append("	DISTINCT job ");
			buff.append("FROM ");
			buff.append("	emp ");

			break;
		}
		return buff.toString();
	}
}
	


