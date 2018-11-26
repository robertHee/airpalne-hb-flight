package com.example.pojo;
import java.io.Serializable;
import java.util.Date;

public class HbPay implements Serializable {

    private int id;
    private int order_id;
    private int trade_id;
    private int pay_method;
    private Double amount_price;
    private Date trade_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getTrade_id() {
        return trade_id;
    }

    public void setTrade_id(int trade_id) {
        this.trade_id = trade_id;
    }

    public int getPay_method() {
        return pay_method;
    }

    public void setPay_method(int pay_method) {
        this.pay_method = pay_method;
    }

    public Double getAmount_price() {
        return amount_price;
    }

    public void setAmount_price(Double amount_price) {
        this.amount_price = amount_price;
    }

    public Date getTrade_time() {
        return trade_time;
    }

    public void setTrade_time(Date trade_time) {
        this.trade_time = trade_time;
    }
}
