/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.bizlogic.impl;

import java.util.List;
import javax.ejb.Stateless;
import cn.tst.gongnuan.viewmodel.TST0001ViewModel;
import org.apache.log4j.Logger;
import cn.tst.gongnuan.bizlogic.TST0001BizLogic;
import cn.tst.gongnuan.entity.YxtJkd;
import cn.tst.gongnuan.service.dto.YxtLssjDTO;
import cn.tst.gongnuan.service.impl.YxtJkdFacade;
import cn.tst.gongnuan.service.impl.YxtLssjDTOFacade;
import javax.ejb.EJB;

/**
 * 出库入库统计实现类
 *
 * @author CaoChun
 */
@Stateless
public class TST0001BizLogicImpl extends BaseBizLogic implements TST0001BizLogic {

    private static final Logger LOG = Logger.getLogger(TST0001BizLogicImpl.class.getName());

    @EJB
    private YxtJkdFacade jkdDao;
    
    @EJB
    private YxtLssjDTOFacade shuJuDao;

    @Override
    public void loadTST0001ViewModel(TST0001ViewModel vm) {
        List<YxtJkd> findAll = jkdDao.findAll();
        vm.setYxtJkdList(findAll);
    }

    @Override
    public void chaXun(TST0001ViewModel vm) {
        List<YxtLssjDTO> shuJuList=shuJuDao.getByJkdId(vm.getJkdId(), vm.getChaXunRiQi());
        vm.setShuJuList(shuJuList);
    }
}
