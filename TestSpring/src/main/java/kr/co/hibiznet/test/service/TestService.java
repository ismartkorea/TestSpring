package kr.co.hibiznet.test.service;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;

/**
 * 
 * @author jeong
 *
 */
public interface TestService {
	
	/**
	 * 
	 * @param req
	 * @param map
	 * @throws Exception
	 */
	public void save(HttpServletRequest req, ModelMap map) throws Exception;
	/**
	 * 
	 * @param req
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public List<HashMap<String, Object>> list(HttpServletRequest req, ModelMap map) throws Exception;
	/**
	 * 
	 * @param req
	 * @param map
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> select(HttpServletRequest req, ModelMap map) throws Exception;
	/**
	 * 
	 * @param req
	 * @param map
	 * @throws Exception
	 */
	public void delete(HttpServletRequest req, ModelMap map) throws Exception;
	/**
	 * 
	 * @param req
	 * @param map
	 * @throws Exception
	 */
	public void update(HttpServletRequest req, ModelMap map) throws Exception;
}
