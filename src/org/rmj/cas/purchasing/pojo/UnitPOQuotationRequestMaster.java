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
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="UnitPOQuotationRequestMaster")

public class UnitPOQuotationRequestMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
    
    @Column(name = "sDestinat")
    private String sDestinat;
    
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
    @Column(name = "dExpPurch")
    @Temporal(TemporalType.DATE)
    private Date dExpPurch;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
    
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "sPrepared")
    private String sPrepared;
    
    @Basic(optional = false)
    @Column(name = "dPrepared")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPrepared;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitPOQuotationRequestMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.dTransact = null;
        this.sDestinat = "";
        this.sReferNox = "";
        this.sRemarksx = "";
        this.dExpPurch = null;
        this.nEntryNox = -1;
        this.sInvTypCd = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.sPrepared = "";
        this.dPrepared = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("sDestinat");
        laColumns.add("sReferNox");
        laColumns.add("sRemarksx");
        laColumns.add("dExpPurch");
        laColumns.add("nEntryNox");
        laColumns.add("sInvTypCd");
        laColumns.add("cTranStat");
        laColumns.add("sPrepared");
        laColumns.add("dPrepared");
        laColumns.add("sModified");
        laColumns.add("dModified");

    }
    
    public void setTransNox(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNox(){
        return sTransNox;
    }
    
    public void setBranchCd(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCd(){
        return sBranchCd;
    }
    
    public void setDateTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getDateTransact(){
        return dTransact;
    }
    
    public void setDestinat(String sDestinat){
        this.sDestinat = sDestinat;
    }
    public String getDestinat(){
        return sDestinat;
    }
    
    public void setReferNox(String sReferNox){
        this.sReferNox = sReferNox;
    }
    public String getReferNox(){
        return sReferNox;
    }
    
    public void setRemarks(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarks(){
        return sRemarksx;
    }
    
    public void setDateExpctdPurch(Date dExpPurch){
        this.dExpPurch = dExpPurch;
    }
    public Date getDateExpctdPurch(){
        return dExpPurch;
    }
    
    public void setEntryNox(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNox(){
        return nEntryNox;
    }
    
    public void setInvTypeCd(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypeCd(){
        return sInvTypCd;
    }
    
    public void setTranStat(String cTranStat){
        this.cTranStat = cTranStat;
    }
    public String getTranStat(){
        return cTranStat;
    }
    
    public void setPreparedBy(String sPrepared){
        this.sPrepared = sPrepared;
    }
    public String getPreparedBy(){
        return sPrepared;
    }
    
    public void setDatePrepared(Date dPrepared){
        this.dPrepared = dPrepared;
    }
    public Date getDatePrepared(){
        return dPrepared;
    }
    
    public void setModifiedBy(String sModified){
        this.sModified = sModified;
    }
    public String getModifiedBy(){
        return sModified;
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
        if (!(object instanceof UnitPOQuotationRequestMaster)) {
            return false;
        }
        UnitPOQuotationRequestMaster other = (UnitPOQuotationRequestMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.purchasing.pojo.UnitPOQuotationRequestMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return sDestinat;
            case 5: return sReferNox;
            case 6: return sRemarksx;
            case 7: return dExpPurch;
            case 8: return nEntryNox;
            case 9: return sInvTypCd;
            case 10: return cTranStat;
            case 11: return sPrepared;
            case 12: return dPrepared;
            case 13: return sModified;
            case 14: return dModified;
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
        return "PO_Quotation_Request_Master";
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
            case 2: sBranchCd = (String) foValue; break;
            case 3: dTransact = (Date) foValue; break;
            case 4: sDestinat = (String) foValue; break;
            case 5: sReferNox = (String) foValue; break;
            case 6: sRemarksx = (String) foValue; break;
            case 7: dExpPurch = (Date) foValue; break;
            case 8: nEntryNox = (int) foValue; break;
            case 9: sInvTypCd = (String) foValue; break;
            case 10: cTranStat = (String) foValue; break;
            case 11: sPrepared = (String) foValue; break;
            case 12: dPrepared = (Date) foValue; break;
            case 13: sModified = (String) foValue; break;
            case 14: dModified = (Date) foValue; break;
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
