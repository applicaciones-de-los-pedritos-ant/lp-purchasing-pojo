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
@Table(name="UnitPODetail")

public class UnitPODetail implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
        
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nQuantity")
    private Number nQuantity;
    
    @Column(name = "nUnitPrce")
    private Number nUnitPrce;
    
    @Column(name = "nReceived")
    private Number nReceived;
    
    @Column(name = "nCancelld")
    private Number nCancelld;
       
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;
    
    @Column(name = "nQuantity")
    private Number nQtyOnHnd;

    LinkedList laColumns = null;
    
    public UnitPODetail(){
        this.sTransNox = "";
        this.nEntryNox = -1;
        this.sStockIDx = "";
        this.nQuantity = 0;
        this.nQtyOnHnd = 0;
        this.nUnitPrce = 0.00;
        this.nReceived = 0;
        this.nCancelld = 0;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("nEntryNox");
        laColumns.add("sStockIDx");
        laColumns.add("nQuantity");
        laColumns.add("nUnitPrce");
        laColumns.add("nReceived");
        laColumns.add("nCancelld");
        laColumns.add("dModified");
        laColumns.add("nQtyOnHnd");

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
    
    public void setQtyReceived(Number nReceived){
        this.nReceived = nReceived;
    }
    public Number getQtyReceived(){
        return nReceived;
    }
    
    public void setQtyCancelled(Number nCancelld){
        this.nCancelld = nCancelld;
    }
    public Number getQtyCancelled(){
        return nCancelld;
    }
        
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    public void setQtyOnHnd(Number nQtyOnHnd){
        this.nQtyOnHnd = nQtyOnHnd;
    }
    public Number getQtyOnHnd(){
        return nQtyOnHnd;
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
        if (!(object instanceof UnitPODetail)) {
            return false;
        }
        UnitPODetail other = (UnitPODetail) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.purchasing.pojo.UnitPODetail[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return nEntryNox;
            case 3: return sStockIDx;
            case 4: return nQuantity;
            case 5: return nUnitPrce;
            case 6: return nReceived;
            case 7: return nCancelld;
            case 8: return dModified;
            case 9: return nQtyOnHnd;
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
        return "PO_Detail";
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
            case 4: nQuantity = (Number) foValue; break;
            case 5: nUnitPrce = (Number) foValue; break;
            case 6: nReceived = (Number) foValue; break;
            case 7: nCancelld = (Number) foValue; break;
            case 8: dModified = (Date) foValue; break;
            case 9: nQtyOnHnd = (Number) foValue; break;
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
