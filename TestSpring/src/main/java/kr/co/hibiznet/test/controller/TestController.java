package kr.co.hibiznet.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import kr.co.hibiznet.test.service.TestService;

@Controller
@RequestMapping(value="/test")
public class TestController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	TestService testService;
	
	@Autowired 
	private SessionLocaleResolver localeResolver; 
	
	@Autowired 
	private MessageSource messageSource; //message-context.xml 에 선언되어있는 bean id 값

	/**
	 * 조회 처리.
	 * @param locale
	 * @param req
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/selectList.do", method=RequestMethod.GET)
	public String selectList(Locale locale, HttpServletRequest req, Model map) throws Exception{
		
		ModelMap modelMap = new ModelMap();
		List<HashMap<String,Object>> resultList = testService.list(req, modelMap);
		
		map.addAttribute("resultList", resultList);
		//map.addAttribute("siteCount", messageSource.getMessage("msg.test",null, locale));
		
		return "testSelectList";
	}
	/**
	 * 상세 조회 처리.
	 * @param locale
	 * @param req
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/select.do", method=RequestMethod.GET)	
	public String select(Locale locale, HttpServletRequest req, Model map) throws Exception {
		
		ModelMap modelMap = new ModelMap();		
		HashMap<String, Object> result = testService.select(req, modelMap);
		map.addAttribute("result", result);
		
		return "testSelect";
	}
	/**
	 * 수정 처리.
	 * @param locale
	 * @param req
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping( value="/update.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView update(Locale locale, HttpServletRequest req, ModelMap map) throws Exception {
	
		ModelAndView mav = new ModelAndView("jsonView");
		testService.update(req, map);
		
		mav.addObject("result", "OK");
		
		return mav;
		
	}
	/**
	 * 삭제 처리.
	 * @param locale
	 * @param req
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@RequestMapping( value="/delete.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView delete(Locale locale, HttpServletRequest req, ModelMap map) throws Exception {
	
		ModelAndView mav = new ModelAndView("jsonView");
		testService.delete(req, map);
		
		mav.addObject("result", "OK");
		
		return mav;
		
	}	
	
}
