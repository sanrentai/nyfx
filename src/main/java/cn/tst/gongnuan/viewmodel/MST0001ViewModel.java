package cn.tst.gongnuan.viewmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import cn.tst.gongnuan.entity.TUser;

/**
 * 违章登记视图模型
 *
 * @author 曹春
 */
public class MST0001ViewModel extends BaseViewModel {

    
    ///编辑中的系统用户
    private TUser editingTUser;

    ///车辆违章一览
    private List<TUser> tUserList;

    public MST0001ViewModel() {
    }

    public TUser getEditingTUser() {
        return editingTUser;
    }

    public void setEditingTUser(TUser editingTUser) {
        this.editingTUser = editingTUser;
    }

    public List<TUser> getTUserList() {
        return tUserList;
    }

    public void setTUserList(List<TUser> tUserList) {
        this.tUserList = tUserList;
    }

}
