package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "goods")
public class GoodsEntity {

    @Id
    private String good_id;
    private String good_name;

    public GoodsEntity(){

    }

    public GoodsEntity(String good_id, String good_name){
        super();
        this.good_id = good_id;
        this.good_name = good_name;
    }

    public void setGood_id(String good_id) {
        this.good_id = good_id;
    }

    public String getGood_id() {
        return good_id;
    }

    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    public String getGood_name() {
        return good_name;
    }
}
