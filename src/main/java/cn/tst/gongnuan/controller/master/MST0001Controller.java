package cn.tst.gongnuan.controller.master;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import cn.tst.gongnuan.bizlogic.MST0001BizLogic;
import cn.tst.gongnuan.common.SepC;
import cn.tst.gongnuan.common.SepE;
import cn.tst.gongnuan.controller.BusinessBaseController;
import cn.tst.gongnuan.entity.TUser;
import cn.tst.gongnuan.viewmodel.ExecuteResult;
import cn.tst.gongnuan.viewmodel.MST0001ViewModel;
import org.apache.commons.lang3.StringUtils;

/**
 * 违章登记
 *
 * @author 曹春
 */
@ViewScoped
@Named(SepC.ControllerID.MST0001)
public class MST0001Controller extends BusinessBaseController {

    private MST0001ViewModel vm;

    @EJB
    private MST0001BizLogic bizLogic;

    @PostConstruct
    public void init() {
        ///初始化视图模型
        this.vm = new MST0001ViewModel();

        this.bizLogic.loadMST0001ViewModel(vm);
    }

    /**
     * 开始编辑
     */
    public void onStartEditing() {
        vm.setEditingTUser(new TUser());
    }

    /**
     * 取消编辑
     */
    public void onCancelEditing() {
        this.vm.setEditingTUser(null);
    }

    /**
     * 编辑违章记录
     *
     * @param row 选中的行
     */
    public void onEditTUser(TUser row) {
        ///设置编辑的对象
        this.vm.setEditingTUser(row);
    }
     public void onResetPW(TUser row){
         SepE.ExecuteMode mode = SepE.ExecuteMode.UPDATE;
         row.setUsrPasswd("123456");
         vm.setEditingTUser(row);
         ExecuteResult result = bizLogic.saveTUserJiLu(mode, vm);
         if (result.isSuccess()) {
             putInfoMessage("密码重置成功");
             onCancelEditing();
         } else {
             putErrorMessage("密码重置失败");
         }
     }
    
    public void onDeleteTUser(TUser row) {
        ///删除模式
        SepE.ExecuteMode mode = SepE.ExecuteMode.DELETE;
        vm.setEditingTUser(row);

        ///执行更新
        ExecuteResult result = this.bizLogic.saveTUserJiLu(mode, vm);

        if (result.isSuccess()) {
            putInfoMessage("删除成功");
            
            onCancelEditing();
        } else {
            putErrorMessage("删除失败");
        }
    }

    /**
     * 保存违章记录
     */
    public void onSaveTUser() {

        SepE.ExecuteMode mode = StringUtils.isEmpty(this.vm.getEditingTUser().getUsrCode())
            ? SepE.ExecuteMode.INSERT : SepE.ExecuteMode.UPDATE;

        ///执行更新
        ExecuteResult result = this.bizLogic.saveTUserJiLu(mode, vm);

        this.addMessage(result.createMessage());

        if (result.isSuccess()) {
            onCancelEditing();
        }
    }
   
    
    /**
     * 刷新数据
     */
    public void onRefreshData() {

    }

    public MST0001ViewModel getVm() {
        return vm;
    }

    public void setVm(MST0001ViewModel vm) {
        this.vm = vm;
    }
    
}
