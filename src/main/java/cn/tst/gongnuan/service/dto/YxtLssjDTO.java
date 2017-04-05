/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.tst.gongnuan.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 * 收费年度表按公司
 *
 * @author CaoChun
 */
@Entity
public class YxtLssjDTO implements Serializable {
    @Id
    private String id;

    private String jkdId;
    
    private String clusterCoding;
    
    private String dateTime;
    
    private String ab;
    
    private String g;
    
    private String h;
    
    private String k;
    
    private String l;
    
    private String i;
    
    private String j;
    
    private String y;
    
    private String m;
    
    private String n;
    
    private String x;
    
    private String a;
    
    private String s;
    
    private String b;
    
    private String r;
    
    private String c;
    
    private String q;
    
    private String d;
    
    private String e;
    
    private String f;
    
    private String p;
    
    private String o;
    
    private String v;
    
    private String t;

    public YxtLssjDTO() {
    }

    public YxtLssjDTO(String id, String jkdId, String clusterCoding, String dateTime, String ab, String g, String h, String k, String l, String i, String j, String y, String m, String n, String x, String a, String s, String b, String r, String c, String q, String d, String e, String f, String p, String o, String v, String t) {
        this.id = id;
        this.jkdId = jkdId;
        this.clusterCoding = clusterCoding;
        this.dateTime = dateTime;
        this.ab = ab;
        this.g = g;
        this.h = h;
        this.k = k;
        this.l = l;
        this.i = i;
        this.j = j;
        this.y = y;
        this.m = m;
        this.n = n;
        this.x = x;
        this.a = a;
        this.s = s;
        this.b = b;
        this.r = r;
        this.c = c;
        this.q = q;
        this.d = d;
        this.e = e;
        this.f = f;
        this.p = p;
        this.o = o;
        this.v = v;
        this.t = t;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJkdId() {
        return jkdId;
    }

    public void setJkdId(String jkdId) {
        this.jkdId = jkdId;
    }

    public String getClusterCoding() {
        return clusterCoding;
    }

    public void setClusterCoding(String clusterCoding) {
        this.clusterCoding = clusterCoding;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getAb() {
        return ab;
    }

    public void setAb(String ab) {
        this.ab = ab;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }
    
}
