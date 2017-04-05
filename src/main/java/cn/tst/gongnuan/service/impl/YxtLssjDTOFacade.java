/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.service.impl;

import cn.tst.gongnuan.entity.TUser;
import cn.tst.gongnuan.service.dto.YxtLssjDTO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import org.apache.log4j.Logger;

/**
 *
 * @author 曹春
 */
@Stateless
public class YxtLssjDTOFacade extends AbstractFacade<TUser> {

    private static final Logger LOG = Logger.getLogger(TUser.class.getName());

    public YxtLssjDTOFacade() {
        super(TUser.class);
    }

    public List<YxtLssjDTO> getByJkdId(String jkdId, Date ddate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dString = sdf.format(ddate) + "%";
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" rownum as id, ");
        sb.append(" CLUSTERCODING, ");
        sb.append(" DATETIME, ");
        sb.append(" AB, G, ");
        sb.append(" H, K, ");
        sb.append(" L, I, ");
        sb.append(" J, Y, ");
        sb.append(" M, N, ");
        sb.append(" X, A, ");
        sb.append(" S, B, ");
        sb.append(" R, C, ");
        sb.append(" Q, D, ");
        sb.append(" E, F, ");
        sb.append(" P, O, ");
        sb.append(" V, T ");
        sb.append(" FROM YXT_LSSJ ");
        sb.append(" WHERE 1=1 ");
        sb.append(" AND JKD_ID=?1 ");
        sb.append(" AND DATETIME LIKE ?2 ");
        sb.append(" ORDER BY DATETIME DESC ");
        Query query = getEntityManager().createNativeQuery(sb.toString(), YxtLssjDTO.class);
        LOG.info(sb.toString());
        LOG.info(jkdId);
        LOG.info(dString);
        query.setParameter(1, jkdId);
        query.setParameter(2, dString);
        List<YxtLssjDTO> result = query.getResultList();

        return result;
    }

}
