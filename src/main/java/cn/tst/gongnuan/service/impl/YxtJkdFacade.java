/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.service.impl;

import javax.ejb.Stateless;
import cn.tst.gongnuan.entity.YxtJkd;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;
import org.apache.log4j.Logger;

/**
 *
 * @author 曹春
 */
@Stateless
public class YxtJkdFacade extends AbstractFacade<YxtJkd> {

    private static final Logger LOG = Logger.getLogger(YxtJkd.class.getName());

    public YxtJkdFacade() {
        super(YxtJkd.class);
    }

}
