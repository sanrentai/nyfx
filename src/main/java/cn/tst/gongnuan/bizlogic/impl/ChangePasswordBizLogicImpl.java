package cn.tst.gongnuan.bizlogic.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import cn.tst.gongnuan.bizlogic.ChangePasswordBizLogic;
import cn.tst.gongnuan.common.SepE;
import cn.tst.gongnuan.entity.TUser;
import cn.tst.gongnuan.service.impl.TUserFacade;
import cn.tst.gongnuan.viewmodel.ExecuteResult;

/**
 *
 * @author andysilver
 */
@Stateless
public class ChangePasswordBizLogicImpl extends BaseBizLogic implements ChangePasswordBizLogic {

    @EJB
    private TUserFacade loginService;

    @Override
    public ExecuteResult saveChange(TUser tUser, String newPasswrod) {

        ExecuteResult result = new ExecuteResult(SepE.ExecuteMode.UPDATE);

        ///设置新密码
        tUser.setUsrPasswd(newPasswrod);

        ///更新密码
        loginService.edit(tUser);

        result.setSuccess(true);

        return result;
    }

}
