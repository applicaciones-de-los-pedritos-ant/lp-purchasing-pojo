package org.rmj.cas.purchasing.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="UnitPOReturnDetail")

public class UnitPOReturnDetail implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
        
    @Column(name = "nEntryNox")
    private int nEntryNox;
        
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "cUnitType")
    private String cUnitType;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Column(name = "nUnitPrce")
    private Number nUnitPrce;
    
    @Column(name = "nFreightx")
    private Number nFreightx;
    
    @Basic(optional = false)
    @Column(name = "dExpiryDt")
    @Temporal(TemporalType.DATE)
    private Date dExpiryDt; 
       
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitPOReturnDetail(){
        this.sTransNox = "";
        this.nEntryNox = -1;
        this.sStockIDx = "";
        this.cUnitType = "1"; /*0-Demo; 1-Regular; 2-Repo*/
        this.nQuantity = 0;
        this.nUnitPrce = 0.00;
        this.nFreightx = 0.00;
        this.dExpiryDt = java.util.Calendar.getInstance().getTime();
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("cUnitType");
        laColumns.add("nQuantity");
        laColumns.add("nUnitPrce");
        laColumns.add("nFreightx");
        laColumns.add("dExpiryDt");
        laColumns.add("dModified");
    }
    
    public void setTransNox(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNox(){
        return sTransNox;
    }
       
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    
    public void setStockID(String sStockIDx){
        this.sStockIDx = sStockIDx;
    }
    public String getStockID(){
        return sStockIDx;
    }
    
    public void setUnitType(String cUnitType){
        this.cUnitType = cUnitType;
    }
    public String getUnitType(){
        return cUnitType;
    }
    
    public void setQuantity(Number nQuantity){
        this.nQuantity = nQuantity;
    }
    public Number getQuantity(){
        return nQuantity;
    }
    
    public void setUnitPrice(double nUnitPrce){
        this.nUnitPrce = nUnitPrce;
    }
    public Number setUnitPrice(){
        return nUnitPrce;
    }
    
    public void setFreightCharge(double nFreightx){
        this.nFreightx = nFreightx;
    }
    public Number getFreightCharge(){
        return nFreightx;
    }
    
    public void setDateExpiry(Date dExpiryDt){
        this.dExpiryDt = dExpiryDt;
    }
    public Date getDateExpiry(){
        return dExpiryDt;
    }
        
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTransNox != null ? sTransNox.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitPOReturnDetail)) {
            return false;
        }
        UnitPOReturnDetail other = (UnitPOReturnDetail) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.purchasing.pojo.UnitPOReturnDetail[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return nEntryNox;
            case 3: return sStockIDx;
            case 4: return cUnitType    ;
            case 5: return nQuantity;
            case 6: return nUnitPrce;
            case 7: return nFreightx;
            case 8: return dExpiryDt;
            case 9: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "PO_Return_Detail";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sTransNox = (String) foValue; break;
            case 2: nEntryNox = (int) foValue; break;
            case 3: sStockIDx = (String) foValue; break;
            case 4: cUnitType = (String) foValue; break;
            case 5: nQuantity = (Number) foValue; break;
            case 6: nUnitPrce = (Number) foValue; break;
            case 7: nFreightx = (Number) foValue; break;
            case 8: dExpiryDt = (Date) foValue; break;
            case 9: dModified = (Date) foValue; break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
