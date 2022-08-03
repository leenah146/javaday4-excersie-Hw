public class InoviceItem {
    String id;
    String desc;
    int qyt;
    double unitprice;

    public InoviceItem(String id, String desc, int qyt, double unitprice) {
        this.id = id;
        this.desc = desc;
        this.qyt = qyt;
        this.unitprice = unitprice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQyt() {
        return qyt;
    }

    public void setQyt(int qyt) {
        this.qyt = qyt;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getTotal (){
        return unitprice*qyt ;
    }

    @Override
    public String toString() {
        return "InoviceItem{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qyt=" + qyt +
                ", unitprice=" + unitprice +
                '}';
    }
}
