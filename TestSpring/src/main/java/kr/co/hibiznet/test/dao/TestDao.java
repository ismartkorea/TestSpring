package kr.co.hibiznet.test.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;

@Repository
public class TestDao {
	
    @Inject
    private SqlSession dao;
    
    private static String namespace = "kr.co.hibiznet.test.sql";
	
    /**
     * 
     * @param req
     * @param map
     * @return
     */
	public List<HashMap<String, Object>> selectList(HttpServletRequest req, ModelMap map) {
		
		return dao.selectList(namespace+".LIST");
	}
	/**
	 * 
	 * @param req
	 * @param map
	 * @return
	 */
	public HashMap<String, Object> select(HttpServletRequest req, ModelMap map) {
		
		return dao.selectOne(namespace+".SELECT", map);
	}
	/**
	 * 
	 * @param req
	 * @param map
	 */
	public void save(HttpServletRequest req, ModelMap map) {
		
		dao.insert(namespace+".SAVE", map);
	}
	/**
	 * 
	 * @param req
	 * @param map
	 */
	public void delete(HttpServletRequest req, ModelMap map) {
		
		dao.delete(namespace+".DELETE", map);
	}
	/**
	 * 
	 * @param req
	 * @param map
	 */
	public void update(HttpServletRequest req, ModelMap map) {
		
		dao.update(namespace+".UPDATE", map);
	}

}
