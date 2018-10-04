package kr.co.hibiznet.test.service;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import kr.co.hibiznet.test.dao.TestDao;

/**
 * 
 * @author jeong
 *
 */
@Service
public class TestServiceImpl {
	
	@Inject
	TestDao dao;
	
	/**
	 * 
	 * @param req
	 * @param map
	 * @throws Exception
	 */
    public void save(HttpServletRequest req, ModelMap map) throws Exception {
        dao.save(req, map);
 
    }
    /**
     * 
     * @param req
     * @param map
     * @return
     * @throws Exception
     */
    public List<HashMap<String, Object>> list(HttpServletRequest req, ModelMap map) throws Exception {
        
        
        return dao.selectList(req, map);
    }
    /**
     * 
     * @param req
     * @param map
     * @return
     * @throws Exception
     */
    public HashMap<String, Object> select(HttpServletRequest req, ModelMap map) throws Exception {
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
    	resultMap = dao.select(req, map);
        
        return resultMap;
    }
    /**
     * 
     * @param req
     * @param map
     * @throws Exception
     */
    public void delete(HttpServletRequest req, ModelMap map) throws Exception {
        dao.delete(req, map);
    }
    /**
     * 
     * @param req
     * @param map
     * @throws Exception
     */
    public void update(HttpServletRequest req, ModelMap map) throws Exception {
        
        dao.update(req, map);
    }	

}
