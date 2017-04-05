package cn.tst.gongnuan.controller.test;

import org.apache.log4j.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import cn.tst.gongnuan.bizlogic.TST0001BizLogic;
import cn.tst.gongnuan.common.SepC;
import cn.tst.gongnuan.controller.BusinessBaseController;
import cn.tst.gongnuan.service.dto.YxtLssjDTO;
import cn.tst.gongnuan.viewmodel.TST0001ViewModel;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.DateAxis;
import org.primefaces.model.chart.LineChartModel;

/**
 * 物资信息查看
 *
 * @author CaoChun
 */
@ViewScoped
@Named(SepC.ControllerID.TST0001)
public class TST0001Controller extends BusinessBaseController {

    private static final Logger LOG = Logger.getLogger(TST0001Controller.class.getName());

    @EJB
    private TST0001BizLogic bizLogic;

    /**
     * 物资信息查看视图模型
     */
    private TST0001ViewModel vm;

    @PostConstruct
    public void init() {
        vm = new TST0001ViewModel();
        bizLogic.loadTST0001ViewModel(vm);

    }

    private void createModels()  throws ParseException  {
        createYiCiWangWenDuModel();
    }

    private void createYiCiWangWenDuModel() throws ParseException {
        LineChartModel yiCiWangWenDuModel = initYiCiWangWenDuModel();
        yiCiWangWenDuModel.setTitle("一次网温度曲线图");
        yiCiWangWenDuModel.setLegendPosition("se");
        yiCiWangWenDuModel.setShowPointLabels(true);
        //动态
        yiCiWangWenDuModel.setAnimate(true);
        //缩放
        yiCiWangWenDuModel.setZoom(true);
        DateAxis axis = new DateAxis("时间");
        axis.setTickAngle(-50);
        yiCiWangWenDuModel.getAxes().put(AxisType.X, axis);
        Axis yAxis = yiCiWangWenDuModel.getAxis(AxisType.Y);
        yAxis.setLabel("温度°C");
        yAxis.setMin(0);
        vm.setYiCiWangWenDuModel(yiCiWangWenDuModel);
    }

    private LineChartModel initYiCiWangWenDuModel() throws ParseException {
        LineChartModel model = new LineChartModel();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ChartSeries gongWen = new ChartSeries();
        gongWen.setLabel("供水温度");
        ChartSeries huiWen = new ChartSeries();
        huiWen.setLabel("回水温度");
        for (YxtLssjDTO item : vm.getShuJuList()) {
            Date d = sdf.parse(item.getDateTime());
            LOG.info(item.getDateTime().substring(10, 19));
            gongWen.set(d, new BigDecimal(item.getG()));
            huiWen.set(d, new BigDecimal(item.getH()));
        }

        model.addSeries(gongWen);
        model.addSeries(huiWen);

        return model;
    }

    public void chaXun()  throws ParseException  {
        bizLogic.chaXun(vm);
        createModels();
    }

    //*****************************************************************
    //                        Getter Setter
    //*****************************************************************
    public TST0001ViewModel getVm() {
        return vm;
    }

    public void setVm(TST0001ViewModel vm) {
        this.vm = vm;
    }

}
