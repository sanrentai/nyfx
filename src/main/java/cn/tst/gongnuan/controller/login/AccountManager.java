package cn.tst.gongnuan.controller.login;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import cn.tst.gongnuan.common.SepC;
import cn.tst.gongnuan.entity.TUser;

@Named
@SessionScoped
public class AccountManager implements Serializable {

    private EntityManager em = null;

    private final Map<String, EntityManager> emMap = new HashMap<>();

    /// 登录信息
    TUser tUser = new TUser();

    private boolean loginIsSuccess;
    private String multiLoginMsg;

    public void setMultiLoginMsg(String msg) {
        this.multiLoginMsg = msg;
    }

    public String getMultiLoginMsg() {
        return multiLoginMsg;
    }

    public TUser getTUser() {
        return tUser;
    }

    public void setTUser(TUser tUser) {
        this.tUser = tUser;
    }

    public boolean isLoginIsSuccess() {
        return loginIsSuccess;
    }

    public void setLoginIsSuccess(boolean loginIsSuccess) {
        this.loginIsSuccess = loginIsSuccess;
    }

    public EntityManager getEntityManager(String persistenceUnitName) {
        return emMap.get(persistenceUnitName);
    }

    public EntityManager getEntityManager() {

        String persistenceUnitName;

        persistenceUnitName = SepC.PERSISTENCE_UNIT;
        em = getEntityManager(persistenceUnitName);

        return em;
    }

}
