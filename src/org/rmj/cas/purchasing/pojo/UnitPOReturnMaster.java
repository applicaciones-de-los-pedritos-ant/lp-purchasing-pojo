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
@Table(name="UnitPOReturnMaster")

public class UnitPOReturnMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "sDeptIDxx")
    private String sDeptIDxx;
    
    @Column(name = "cDivision")
    private String cDivision;
    
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
    
    @Column(name = "sCompnyID")
    private String sCompnyID;
    
    @Column(name = "sSupplier")
    private String sSupplier;
        
    @Column(name = "nTranTotl")
    private Number nTranTotl;
    
    @Column(name = "nVATRatex")
    private Number nVATRatex;
    
    @Column(name = "nTWithHld")
    private Number nTWithHld;
    
    @Column(name = "nDiscount")
    private Number nDiscount;
    
    @Column(name = "nAddDiscx")
    private Number nAddDiscx;
        
    @Column(name = "nFreightx")
    private Number nFreightx;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
    @Column(name = "nAmtPaidx")
    private Number nAmtPaidx;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sPOTransx")
    private String sPOTransx;
         
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
    
    @Column(name = "sApproved")
    private String sApproved;
    
    @Basic(optional = false)
    @Column(name = "dApproved")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dApproved;
    
    @Column(name = "sAprvCode")
    private String sAprvCode;    
    
    @Column(name = "sPostedxx")
    private String sPostedxx;
    
    @Basic(optional = false)
    @Column(name = "dPostedxx")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPostedxx;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitPOReturnMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.dTransact = null;
        this.sCompnyID = "";
        this.sSupplier = "";
        this.nTranTotl = 0.00;
        this.nVATRatex = 0.00;
        this.nTWithHld = 0.00;
        this.nDiscount = 0.00;
        this.nAddDiscx = 0.00;
        this.nFreightx = 0.00;
        this.sRemarksx = "";
        this.nAmtPaidx = 0.00;
        this.sSourceNo = "";
        this.sSourceCd = "";
        this.sPOTransx = "";
        this.nEntryNox = -1;
        this.sInvTypCd = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.sPrepared = "";
        this.dPrepared = null;
        this.sApproved = "";
        this.dApproved = null;
        this.sAprvCode = "";
        this.sPostedxx = "";
        this.dPostedxx = null;
        this.sDeptIDxx = "";
        this.cDivision = "3";

        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("sCompnyID");
        laColumns.add("sSupplier");
        laColumns.add("nTranTotl");
        laColumns.add("nVATRatex");
        laColumns.add("nTWithHld");
        laColumns.add("nDiscount");
        laColumns.add("nAddDiscx");
        laColumns.add("nFreightx");
        laColumns.add("sRemarksx");
        laColumns.add("nAmtPaidx");
        laColumns.add("sSourceNo");
        laColumns.add("sSourceCd");
        laColumns.add("sPOTransx");
        laColumns.add("nEntryNox");
        laColumns.add("sInvTypCd");
        laColumns.add("cTranStat");
        laColumns.add("sPrepared");
        laColumns.add("dPrepared");
        laColumns.add("sApproved");
        laColumns.add("dApproved");
        laColumns.add("sAprvCode");
        laColumns.add("sPostedxx");
        laColumns.add("dPostedxx");
        laColumns.add("sDeptIDxx");
        laColumns.add("cDivision");
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
    
    public void setDeptIDxx(String sDeptIDxx){
        this.sDeptIDxx = sDeptIDxx;
    }
    public String getDeptIDxx(){
        return sDeptIDxx;
    }
    
    public void setDivision(String cDivision){
        this.cDivision = cDivision;
    }
    public String getDivision(){
        return cDivision;
    }
    
    public void setDateTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getDateTransact(){
        return dTransact;
    }
    
    public void setCompanyID(String sCompnyID){
        this.sCompnyID = sCompnyID;
    }
    public String getCompanyID(){
        return sCompnyID;
    }
    
    public void setSupplier(String sSupplier){
        this.sSupplier = sSupplier;
    }
    public String getSupplier(){
        return sSupplier;
    }
    
    public void setTranTotal(Number nTranTotl){
        this.nTranTotl = nTranTotl;
    }
    public Number getTranTotal(){
        return nTranTotl;
    }
    
    public void setVATRate(Number nVATRatex){
        this.nVATRatex = nVATRatex;
    }
    public Number getVATRate(){
        return nVATRatex;
    }
    
    public void setTaxWHeld(Number nTWithHld){
        this.nTWithHld = nTWithHld;
    }
    public Number getTaxWHeld(){
        return nTWithHld;
    }
    
    public void setDiscountRate(Number nDiscount){
        this.nDiscount = nDiscount;
    }
    public Number getDiscountRate(){
        return nDiscount;
    }
    
    public void setAdditionalDisc(Number nAddDiscx){
        this.nAddDiscx = nAddDiscx;
    }
    public Number getAdditionalDisc(){
        return nAddDiscx;
    }
    
    public void setFreightCharge(Number nFreightx){
        this.nFreightx = nFreightx;
    }
    public Number getFreightCharge(){
        return nFreightx;
    }
    
    public void setRemarks(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarks(){
        return sRemarksx;
    }
    
    public void setAmountPaid(Number nAmtPaidx){
        this.nAmtPaidx = nAmtPaidx;
    }
    public Number getAmountPaid(){
        return nAmtPaidx;
    }
    
    public void setSourceNo(String sSourceNo){
        this.sSourceNo = sSourceNo;
    }
    public String getSourceNo(){
        return sSourceNo;
    }
    
    public void setSourceCd(String sSourceCd){
        this.sSourceCd = sSourceCd;
    }
    public String getSourceCd(){
        return sSourceCd;
    }
    
    public void setPOTrans(String sPOTransx){
        this.sPOTransx = sPOTransx;
    }
    public String getPOTrans(){
        return sPOTransx;
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
    
    public void setApprovedBy(String sApproved){
        this.sApproved = sApproved;
    }
    public String getApprovedBy(){
        return sApproved;
    }
    
    public void setDateApproved(Date dApproved){
        this.dApproved = dApproved;
    }
    public Date getDateApproved(){
        return dApproved;
    }
    
    public void setApprovalCode(String sAprvCode){
        this.sAprvCode = sAprvCode;
    }
    public String getApprovalCode(){
        return sAprvCode;
    }
    
    public void setPostedBy(String sPostedxx){
        this.sPostedxx = sPostedxx;
    }
    public String getPostedBy(){
        return sPostedxx;
    }
    
    public void setDatePosted(Date dPostedxx){
        this.dPostedxx = dPostedxx;
    }
    public Date setDatePosted(){
        return dPostedxx;
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
        if (!(object instanceof UnitPOReturnMaster)) {
            return false;
        }
        UnitPOReturnMaster other = (UnitPOReturnMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.purchasing.pojo.UnitPOReturnMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return sCompnyID;
            case 5: return sSupplier;
            case 6: return nTranTotl;
            case 7: return nVATRatex;
            case 8: return nTWithHld;
            case 9: return nDiscount;
            case 10: return nAddDiscx;
            case 11: return nFreightx;
            case 12: return sRemarksx;
            case 13: return nAmtPaidx;
            case 14: return sSourceNo;
            case 15: return sSourceCd;
            case 16: return sPOTransx;
            case 17: return nEntryNox;
            case 18: return sInvTypCd;
            case 19: return cTranStat;
            case 20: return sPrepared;
            case 21: return dPrepared;
            case 22: return sApproved;
            case 23: return dApproved;
            case 24: return sAprvCode;
            case 25: return sPostedxx;
            case 26: return dPostedxx;
            case 27: return sDeptIDxx;
            case 28: return cDivision;
            case 29: return sModified;
            case 30: return dModified;
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
        return "PO_Return_Master";
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
            case 4: sCompnyID = (String) foValue; break;
            case 5: sSupplier = (String) foValue; break;
            case 6: nTranTotl = (Number) foValue; break;
            case 7: nVATRatex = (Number) foValue; break;
            case 8: nTWithHld = (Number) foValue; break;
            case 9: nDiscount = (Number) foValue; break;
            case 10: nAddDiscx = (Number) foValue; break;
            case 11: nFreightx = (Number) foValue; break;
            case 12: sRemarksx = (String) foValue; break;
            case 13: nAmtPaidx = (Number) foValue; break;
            case 14: sSourceNo = (String) foValue; break;
            case 15: sSourceCd = (String) foValue; break;
            case 16: sPOTransx = (String) foValue; break;
            case 17: nEntryNox = (int) foValue; break;
            case 18: sInvTypCd = (String) foValue; break;
            case 19: cTranStat = (String) foValue; break;
            case 20: sPrepared = (String) foValue; break;
            case 21: dPrepared = (Date) foValue; break;
            case 22: sApproved = (String) foValue; break;
            case 23: dApproved = (Date) foValue; break;
            case 24: sAprvCode = (String) foValue; break;
            case 25: sPostedxx = (String) foValue; break;
            case 26: dPostedxx = (Date) foValue; break;
            case 27: sDeptIDxx = (String) foValue; break;
            case 28: cDivision = (String) foValue; break;
            case 29: sModified = (String) foValue; break;
            case 30: dModified = (Date) foValue; break;
            
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