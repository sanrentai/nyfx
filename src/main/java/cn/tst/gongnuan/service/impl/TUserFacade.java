/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.service.impl;

import javax.ejb.Stateless;
import cn.tst.gongnuan.entity.TUser;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.apache.log4j.Logger;

/**
 *
 * @author 曹春
 */
@Stateless
public class TUserFacade extends AbstractFacade<TUser> {

    private static final Logger LOG = Logger.getLogger(TUser.class.getName());

    public TUserFacade() {
        super(TUser.class);
    }
    
    public TUser findLoginInfo(String loginId, String password) {
        
        // ログインＩＤとパスワードにて、ＤＢから認証情報を取得する。
        Query qe = this.getEntityManager().createNamedQuery("TUser.findByUsrCodeAndUsrPasswd");
        qe.setParameter("usrCode", loginId);
        qe.setParameter("usrPasswd", password);
        LOG.info(qe.toString());
        List<TUser> result = qe.getResultList();
        return result.isEmpty() ? null : result.get(0);
    }

}
