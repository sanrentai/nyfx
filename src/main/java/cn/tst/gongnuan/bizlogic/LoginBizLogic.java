package cn.tst.gongnuan.bizlogic;

import java.util.List;
import cn.tst.gongnuan.entity.TUser;
import cn.tst.gongnuan.exception.LoginException;

/**
 *
 * @author andysilver
 */
public interface LoginBizLogic {

    /**
     * 获取登录信息
     *
     * @param loginId loginId
     * @param password password
     * @return
     * @throws cn.tst.gongnuan.exception.LoginException
     */
    TUser searchTUser(String loginId, String password) throws LoginException;

    public List<TUser> getTUserList();
}
