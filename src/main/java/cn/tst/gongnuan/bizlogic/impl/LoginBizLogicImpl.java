package cn.tst.gongnuan.bizlogic.impl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import cn.tst.gongnuan.bizlogic.LoginBizLogic;
import cn.tst.gongnuan.common.BizConfig;
import cn.tst.gongnuan.common.SecurityUtils;
import cn.tst.gongnuan.controller.login.AccountManager;
import cn.tst.gongnuan.entity.TUser;
import cn.tst.gongnuan.exception.LoginException;
import cn.tst.gongnuan.service.impl.TUserFacade;

/**
 *
 * @author andysilver
 */
@Stateless
public class LoginBizLogicImpl implements LoginBizLogic {

    @Inject
    private BizConfig bizConfig;

    @EJB
    private TUserFacade yuanGongService;      ///员工
    
    @Inject
    protected AccountManager am;

    @Override
    public TUser searchTUser(String loginId, String password) throws LoginException {
        ///获取LoginInfo
        TUser tUser = null;
        tUser = yuanGongService.findLoginInfo( loginId, password);
        ///不存在login信息
        if (tUser == null) {
            return null;
        }
//        LoginInfo result=new LoginInfo();
//        ///员工信息
//        result.setLoginId(tUser.getEmpId());
        return tUser;
    }

    @Override
    public List<TUser> getTUserList() {
        return yuanGongService.findAll();
    }


}
