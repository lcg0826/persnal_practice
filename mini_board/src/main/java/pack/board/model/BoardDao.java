package pack.board.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import pack.board.controller.BoardBean;

@Repository
public class BoardDao extends SqlSessionDaoSupport implements BoardDaoInter {
	
	@Autowired
	// @Qualifier("sqlSessionFactory")
	public BoardDao(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}


	
	@Override
	public List<Board> selectDataAll() {
		return getSqlSession().selectList("selectDataAll");
	}
	
	@Override
	public int addReadCnt(String num) { // 상세보기 전 조회수 증 가
		return getSqlSession().update("addReadcnt",num);
	}

	@Override
	public Board detail(String num) {
		String sql = "select * from springboard where num=?";

		return getSqlSession().selectOne("selectDetail", num);
	}
	
	public int insert(BoardBean bean) {
		return getSqlSession().insert("insertData", bean);
	}
	
	@Override
	public int update(BoardBean bean) {
		return getSqlSession().update("updateData", bean);
	}
	
	@Override
	public int delete(String num) {
		return getSqlSession().delete("deleteData", num);
	}
	
	@Override
	public List<Board> search(BoardBean bean) {
		return getSqlSession().selectList("selectSearch", bean);
	}

	
}
