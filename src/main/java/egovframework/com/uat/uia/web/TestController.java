package egovframework.com.uat.uia.web;

import egovframework.com.cmm.ComDefaultCodeVO;
import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.annotation.IncludedInfo;
import egovframework.com.cmm.service.EgovCmmUseService;
import egovframework.com.uat.uia.service.EgovLoginService;
import egovframework.com.uss.umt.service.EgovUserManageService;
import egovframework.com.uss.umt.service.UserDefaultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);
    /** EgovLoginService */
    @Resource(name = "loginService")
    private EgovLoginService loginService;

    /** EgovCmmUseService */
    @Resource(name = "EgovCmmUseService")
    private EgovCmmUseService cmmUseService;

    /** userManageService */
    @Resource(name = "userManageService")
    private EgovUserManageService userManageService;

    @IncludedInfo(name = "많은 쿼리 테스트", listUrl = "/test/nologin/manyQuery.do", order = 10, gid = 10)
    @RequestMapping(value = "/test/nologin/manyQuery.do")
    public String testnologinmanyQuery() throws Exception {

        loginService.actionLogin(new LoginVO("01"));
        loginService.actionLogin(new LoginVO("02"));
        loginService.actionLogin(new LoginVO("03"));
        loginService.actionLogin(new LoginVO("04"));
        loginService.actionLogin(new LoginVO("05"));
        loginService.actionLogin(new LoginVO("06"));
        loginService.actionLogin(new LoginVO("07"));
        loginService.actionLogin(new LoginVO("08"));
        loginService.actionLogin(new LoginVO("09"));
        loginService.actionLogin(new LoginVO("10"));
        loginService.actionLogin(new LoginVO("11"));
        loginService.actionLogin(new LoginVO("12"));
        loginService.actionLogin(new LoginVO("13"));
        loginService.actionLogin(new LoginVO("14"));
        loginService.actionLogin(new LoginVO("15"));
        loginService.actionLogin(new LoginVO("16"));
        loginService.actionLogin(new LoginVO("17"));
        loginService.actionLogin(new LoginVO("18"));
        loginService.actionLogin(new LoginVO("19"));
        loginService.actionLogin(new LoginVO("20"));

        ComDefaultCodeVO comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("1");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("2");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("3");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("4");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("5");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("6");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("7");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("8");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("9");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("10");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);

        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("11");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("12");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("13");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("14");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("15");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("16");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("17");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("18");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("19");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);
        comDefaultCodeVO = new ComDefaultCodeVO();
        comDefaultCodeVO.setCodeId("20");
        cmmUseService.selectCmmCodeDetail(comDefaultCodeVO);


        UserDefaultVO userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(1);
        userDefaultVO.setFirstIndex(1);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(2);
        userDefaultVO.setFirstIndex(2);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(3);
        userDefaultVO.setFirstIndex(3);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(4);
        userDefaultVO.setFirstIndex(5);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(6);
        userDefaultVO.setFirstIndex(6);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(7);
        userDefaultVO.setFirstIndex(7);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(8);
        userDefaultVO.setFirstIndex(8);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(9);
        userDefaultVO.setFirstIndex(9);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(10);
        userDefaultVO.setFirstIndex(10);
        userManageService.selectUserList(userDefaultVO);

        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(11);
        userDefaultVO.setFirstIndex(11);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(12);
        userDefaultVO.setFirstIndex(12);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(13);
        userDefaultVO.setFirstIndex(13);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(14);
        userDefaultVO.setFirstIndex(15);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(16);
        userDefaultVO.setFirstIndex(16);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(17);
        userDefaultVO.setFirstIndex(17);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(18);
        userDefaultVO.setFirstIndex(18);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(19);
        userDefaultVO.setFirstIndex(19);
        userManageService.selectUserList(userDefaultVO);
        userDefaultVO = new UserDefaultVO();
        userDefaultVO.setRecordCountPerPage(20);
        userDefaultVO.setFirstIndex(20);
        userManageService.selectUserList(userDefaultVO);

        return "egovframework/com/uat/uia/EgovLoginUsr";
    }
}
