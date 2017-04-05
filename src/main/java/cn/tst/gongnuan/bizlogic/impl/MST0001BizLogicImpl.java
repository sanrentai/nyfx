package cn.tst.gongnuan.bizlogic.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import cn.tst.gongnuan.bizlogic.MST0001BizLogic;
import cn.tst.gongnuan.common.SepC;
import cn.tst.gongnuan.common.SepE;
import cn.tst.gongnuan.entity.TUser;
import cn.tst.gongnuan.service.impl.TUserFacade;
import cn.tst.gongnuan.viewmodel.ExecuteResult;
import cn.tst.gongnuan.viewmodel.MST0001ViewModel;

/**
 * 违章登记
 *
 * @author 曹春
 */
@Stateless
public class MST0001BizLogicImpl extends BaseBizLogic implements MST0001BizLogic {

    private final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(MST0001BizLogicImpl.class);

    @EJB
    private TUserFacade tUserDao;

    @Override
    public void loadMST0001ViewModel(MST0001ViewModel vm) {
        refreshTUser(vm);
    }

    @Override
    public void refreshTUser(MST0001ViewModel vm) {
        /// 所有用户信息
        List<TUser> tUserList = tUserDao.findAll();
        vm.setTUserList(tUserList);
    }

    @Override
    public ExecuteResult saveTUserJiLu(SepE.ExecuteMode mode, MST0001ViewModel vm) {

        ExecuteResult result = new ExecuteResult(mode);

        try {

            TUser target = vm.getEditingTUser();

            switch (mode) {
                case INSERT:
                    tUserDao.create(target);
                    break;
                case UPDATE:
                    /// 更新库存数
                    tUserDao.edit(target);
                    break;
                case DELETE:
                    tUserDao.remove(target);
                    break;
            }
            refreshTUser(vm);
            result.setSuccess(true);
        } catch (Exception e) {
            result.anylizeException(e);
            result.setSuccess(false);
            e.printStackTrace();
            LOG.error(e);
        }
        return result;
    }

}
