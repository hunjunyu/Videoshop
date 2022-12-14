package model;

import model.vo.CustomerVO;

/** 고객관리 JDBC 연결 */
public interface CustomerDao {
	public void insertCustomer(CustomerVO vo) throws Exception;	// 회원가입
	public void newinfo(CustomerVO vo)throws Exception;
	public CustomerVO selectByTel(String tel) throws Exception;			// 전화번호로 검색
	public CustomerVO selectByName(String name)throws Exception;
	public int updateCustomer(CustomerVO vo) throws Exception;		// 고객정보 수정
}
