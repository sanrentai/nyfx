/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.viewmodel;

import cn.tst.gongnuan.entity.YxtJkd;
import cn.tst.gongnuan.service.dto.YxtLssjDTO;
import java.util.Date;
import java.util.List;
import org.primefaces.model.chart.LineChartModel;

/**
 *
 * @author CaoChun
 */
public class TST0001ViewModel extends BaseViewModel {

   private List<YxtLssjDTO> shuJuList;
   
   private List<YxtJkd> yxtJkdList;
   
   private String jkdId;
   
   private Date chaXunRiQi;
   
   private LineChartModel yiCiWangWenDuModel;

    public TST0001ViewModel() {
        chaXunRiQi=new Date();
    }

    public List<YxtLssjDTO> getShuJuList() {
        return shuJuList;
    }

    public void setShuJuList(List<YxtLssjDTO> shuJuList) {
        this.shuJuList = shuJuList;
    }

    public List<YxtJkd> getYxtJkdList() {
        return yxtJkdList;
    }

    public void setYxtJkdList(List<YxtJkd> yxtJkdList) {
        this.yxtJkdList = yxtJkdList;
    }

    public String getJkdId() {
        return jkdId;
    }

    public void setJkdId(String jkdId) {
        this.jkdId = jkdId;
    }

    public Date getChaXunRiQi() {
        return chaXunRiQi;
    }

    public void setChaXunRiQi(Date chaXunRiQi) {
        this.chaXunRiQi = chaXunRiQi;
    }

    public LineChartModel getYiCiWangWenDuModel() {
        return yiCiWangWenDuModel;
    }

    public void setYiCiWangWenDuModel(LineChartModel yiCiWangWenDuModel) {
        this.yiCiWangWenDuModel = yiCiWangWenDuModel;
    }
   
}
