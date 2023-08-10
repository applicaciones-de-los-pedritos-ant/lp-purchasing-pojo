package org.rmj.cas.purchasing.pojo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import org.rmj.appdriver.iface.GEntity;

/**
 * PO_Receiving_Detail other info table POJO
 * @author Michael Torres Cuison
 * @since 2018.11.07
 */
public class UnitPOReceivingDetailOthers implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sStockIDx")
    private String sStockIDx;
    
    @Column(name = "nQtyOnHnd")
    private Number nQtyOnHnd;
    
    @Column(name = "xQtyOnHnd")
    private Number xQtyOnHnd;
    
    @Column(name = "nResvOrdr")
    private Number nResvOrdr;
    
    @Column(name = "nBackOrdr")
    private Number nBackOrdr;
    
    @Column(name = "nReorderx")
    private Number nReorderx;
    
    @Column(name = "nLedgerNo")
    private int nLedgerNo;
    
    @Column(name = "xUnitPrce")
    private double xUnitPrce;
    
    @Column(name = "xBarCodex")
    private String xBarCodex;
    
    @Column(name = "xDescript")
    private String xDescript;
    
    /**
     * added by jovanalic
     * since 2021-07-2
     */
    @Column(name = "sMeasurNm")
    private String sMeasurNm;
    
    LinkedList laColumns = null;
    
    private void initRecord(){
        this.sStockIDx = "";
        this.nQtyOnHnd = 0;
        this.xQtyOnHnd = 0;
        this.nResvOrdr = 0;
        this.nBackOrdr = 0;
        this.nReorderx = 0;
        this.nLedgerNo = 0;
        this.xUnitPrce = 0.00;
        this.xBarCodex = "";
        this.xDescript = "";
        this.sMeasurNm = "";
        
        laColumns = new LinkedList();
        laColumns.add("sStockIDx");
        laColumns.add("nQtyOnHnd");
        laColumns.add("xQtyOnHnd");
        laColumns.add("nResvOrdr");
        laColumns.add("nBackOrdr");
        laColumns.add("nReorderx");
        laColumns.add("nLedgerNo");
        laColumns.add("xUnitPrce");
        laColumns.add("xBarCodex");
        laColumns.add("xDescript");
        laColumns.add("sMeasurNm");
    }
    
    public UnitPOReceivingDetailOthers(){
        initRecord();
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sStockIDx != null ? sStockIDx.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UnitPOReceivingDetailOthers)) {
            return false;
        }
        UnitPOReceivingDetailOthers other = (UnitPOReceivingDetailOthers) object;
        return !((this.sStockIDx == null && other.sStockIDx != null) || (this.sStockIDx != null && !this.sStockIDx.equals(other.sStockIDx)));
    }
    
    @Override
    public String toString() {
        return "org.rmj.purchasing.pojo.UnitPOReceivingDetailOthers[sStockIDx=" + sStockIDx + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sStockIDx;
            case 2: return nQtyOnHnd;
            case 3: return xQtyOnHnd;
            case 4: return nResvOrdr;
            case 5: return nBackOrdr;
            case 6: return nReorderx;
            case 7: return nLedgerNo;
            case 8: return xUnitPrce;
            case 9: return xBarCodex;
            case 10: return xDescript;
            case 11: return sMeasurNm;
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
        return "tmpTable";
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
            case 1: sStockIDx = (String) foValue; break;
            case 2: nQtyOnHnd = (Number) Double.valueOf(foValue.toString()); break;
            case 3: xQtyOnHnd = (Number) Double.valueOf(foValue.toString()); break;
            case 4: nResvOrdr = (Number) foValue; break;
            case 5: nBackOrdr = (Number) foValue; break;
            case 6: nReorderx = (Number) foValue; break;
            case 7: nLedgerNo = (int) foValue; break;
            case 8: xUnitPrce = (double) foValue; break;
            case 9: xBarCodex = (String) foValue; break;
            case 10: xDescript = (String) foValue; break;
            case 11: sMeasurNm = (String) foValue; break;
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
    
    public void list(){
        Stream.of(laColumns).forEach(System.out::println);        
    }
}
