package cn.tst.gongnuan.bizlogic;

import cn.tst.gongnuan.entity.TUser;
import cn.tst.gongnuan.viewmodel.ExecuteResult;

/**
 * 密码变更
 *
 * @author ps_xy@pscp.co.jp
 */
public interface ChangePasswordBizLogic {

    /**
     * 密码变更
     *
     * @param tUser 登录用户
     * @param newPasswrod 新密码
     * @return 执行结果
     */
    ExecuteResult saveChange(TUser tUser, String newPasswrod);

}
