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
@Table(name="UnitPOReceivingMaster")

public class UnitPOReceivingMaster implements Serializable, GEntity {
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
       
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Basic(optional = false)
    @Column(name = "dRefernce")
    @Temporal(TemporalType.DATE)
    private Date dRefernce;
    
    @Column(name = "sTermCode")
    private String sTermCode;
    
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
    
    @Column(name = "nAmtPaidx")
    private Number nAmtPaidx;
    
    @Column(name = "nFreightx")
    private Number nFreightx;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
         
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
    
    public UnitPOReceivingMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.sDeptIDxx = "";
        this.dTransact = null;
        this.sCompnyID = "";
        this.sSupplier = "";
        this.sReferNox = "";
        this.dRefernce = null;
        this.sTermCode = "";
        this.nTranTotl = 0.00;	
        this.nVATRatex = 0.00;	
        this.nTWithHld = 0.00;	
        this.nDiscount = 0.00;	
        this.nAddDiscx = 0.00;	
        this.nAmtPaidx = 0.00;	
        this.nFreightx = 0.00;	
        this.sRemarksx = "";	
        this.sSourceNo = "";
        this.sSourceCd = "";
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
        laColumns.add("sReferNox");
        laColumns.add("dRefernce");
        laColumns.add("sTermCode");
        laColumns.add("nTranTotl");	
        laColumns.add("nVATRatex");	
        laColumns.add("nTWithHld");	
        laColumns.add("nDiscount");	
        laColumns.add("nAddDiscx");	
        laColumns.add("nAmtPaidx");	
        laColumns.add("nFreightx");	
        laColumns.add("sRemarksx");	
        laColumns.add("sSourceNo");
        laColumns.add("sSourceCd");
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
               
    public void setReferNo(String sReferNox){
        this.sReferNox = sReferNox;
    }
    public String getReferNo(){
        return sReferNox;
    }
    
    public void setReferDate(Date dRefernce){
        this.dRefernce = dRefernce;
    }
    public Date getReferDate(){
        return dRefernce;
    }
    
    public void setTermCode(String sTermCode){
        this.sTermCode = sTermCode;
    }
    public String getTermCode(){
        return sTermCode;
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
    
    public void setAmountPaid(Number nAmtPaidx){
        this.nAmtPaidx = nAmtPaidx;
    }
    public Number getAmountPaid(){
        return nAmtPaidx;
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
        if (!(object instanceof UnitPOReceivingMaster)) {
            return false;
        }
        UnitPOReceivingMaster other = (UnitPOReceivingMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.purchasing.pojo.UnitPOReceivingMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return sCompnyID;
            case 5: return sSupplier;
            case 6: return sReferNox;
            case 7: return dRefernce;
            case 8: return sTermCode;
            case 9: return nTranTotl;
            case 10: return nVATRatex;
            case 11: return nTWithHld;
            case 12: return nDiscount;
            case 13: return nAddDiscx;
            case 14: return nAmtPaidx;
            case 15: return nFreightx;
            case 16: return sRemarksx;
            case 17: return sSourceNo;
            case 18: return sSourceCd;
            case 19: return nEntryNox;
            case 20: return sInvTypCd;
            case 21: return cTranStat;
            case 22: return sPrepared;
            case 23: return dPrepared;
            case 24: return sApproved;
            case 25: return dApproved;
            case 26: return sAprvCode;
            case 27: return sPostedxx;
            case 28: return dPostedxx;
            case 29: return sDeptIDxx;
            case 30: return cDivision;
            case 31: return sModified;
            case 32: return dModified;
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
        return "PO_Receiving_Master";
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
            case 6: sReferNox = (String) foValue; break;
            case 7: dRefernce = (Date) foValue; break;
            case 8: sTermCode = (String) foValue; break;
            case 9: nTranTotl = (Number) foValue; break;
            case 10: nVATRatex = (Number) foValue; break;
            case 11: nTWithHld = (Number) foValue; break;
            case 12: nDiscount = (Number) foValue; break;
            case 13: nAddDiscx = (Number) foValue; break;
            case 14: nAmtPaidx = (Number) foValue; break;
            case 15: nFreightx = (Number) foValue; break;
            case 16: sRemarksx = (String) foValue; break;
            case 17: sSourceNo = (String) foValue; break;
            case 18: sSourceCd = (String) foValue; break;
            case 19: nEntryNox = (int) foValue; break;
            case 20: sInvTypCd = (String) foValue; break;
            case 21: cTranStat = (String) foValue; break;
            case 22: sPrepared = (String) foValue; break;
            case 23: dPrepared = (Date) foValue; break;
            case 24: sApproved = (String) foValue; break;
            case 25: dApproved = (Date) foValue; break;
            case 26: sAprvCode = (String) foValue; break;
            case 27: sPostedxx = (String) foValue; break;
            case 28: dPostedxx = (Date) foValue; break;
            case 29: sDeptIDxx = (String) foValue; break;
            case 30: cDivision = (String) foValue; break;
            case 31: sModified = (String) foValue; break;
            case 32: dModified = (Date) foValue; break;
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