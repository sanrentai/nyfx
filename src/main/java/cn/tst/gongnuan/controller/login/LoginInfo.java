package cn.tst.gongnuan.controller.login;

import java.util.List;
import java.util.Map;
import cn.tst.gongnuan.entity.TUser;

/**
 * 業務画面の共通利用するログイン者の情報
 *
 * @author owner
 */
public class LoginInfo {

    private String loginId;

    private boolean isFirstTimeLogin;

    private boolean isLockUser;
    
    private TUser tUser;

    /**
     * デフォルトコンストラクター
     */
    public LoginInfo() {
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public boolean isIsLockUser() {
        return isLockUser;
    }

    public void setIsLockUser(boolean isLockUser) {
        this.isLockUser = isLockUser;
    }

    public boolean isIsFirstTimeLogin() {
        return isFirstTimeLogin;
    }

    public void setIsFirstTimeLogin(boolean isFirstTimeLogin) {
        this.isFirstTimeLogin = isFirstTimeLogin;
    }

    public TUser getTUser() {
        return tUser;
    }

    public void setTUser(TUser tUser) {
        this.tUser = tUser;
    }

    public String getLoginUserName() {
        return this.tUser.getUsrName();
    }

}
