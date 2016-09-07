package com.ifeng.auto.model;

public class DealerSalesWithBLOBs extends DealerSales {
    private byte[] idcardpic;

    private byte[] ecard;

    public byte[] getIdcardpic() {
        return idcardpic;
    }

    public void setIdcardpic(byte[] idcardpic) {
        this.idcardpic = idcardpic;
    }

    public byte[] getEcard() {
        return ecard;
    }

    public void setEcard(byte[] ecard) {
        this.ecard = ecard;
    }
}