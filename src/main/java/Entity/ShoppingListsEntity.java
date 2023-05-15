package Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_lists")
public class ShoppingListsEntity {

    @Id
    private String list_id;
    private String date;
    private String name_of_list;
    private String amount_of_goods;
    private Boolean shopping_mark;
    @ManyToOne
    @JoinColumn(name = "good_id", referencedColumnName = "good_id")
    private GoodsEntity good_id;

    public ShoppingListsEntity(){

    }

    public ShoppingListsEntity(String list_id, String date, String name_of_list, String amount_of_goods, Boolean shopping_mark, GoodsEntity good_id){
        super();
        this.list_id = list_id;
        this.date = date;
        this.name_of_list = name_of_list;
        this.amount_of_goods = amount_of_goods;
        this.shopping_mark = shopping_mark;
        this.good_id = good_id;
    }

    public void setList_id(String list_id) {
        this.list_id = list_id;
    }

    public String getList_id() {
        return list_id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setName_of_list(String name_of_list) {
        this.name_of_list = name_of_list;
    }

    public String getName_of_list() {
        return name_of_list;
    }

    public void setAmount_of_goods(String amount_of_goods) {
        this.amount_of_goods = amount_of_goods;
    }

    public String getAmount_of_goods() {
        return amount_of_goods;
    }

    public void setGood_id(GoodsEntity good_id) {
        this.good_id = good_id;
    }

    public GoodsEntity getGood_id() {
        return good_id;
    }
}



