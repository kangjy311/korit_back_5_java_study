package com.study.test01;


public class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public void showOrderInfo() {
        System.out.println(toString());

    }

    public Order(int orderId, String productName, String consumerName, int price, int stock) {
        this.orderId = orderId;
        this.productName = productName;
        this.consumerName = consumerName;
        this.price = price;
        this.stock = stock;
    }

    public static OrderBuilder builder() {
        return new OrderBuilder();
    }

    public static class OrderBuilder {
        private int orderId;
        private String productName;
        private String consumerName;
        private int price;
        private int stock;

        public Order build() {
            return new Order(orderId, productName, consumerName, price, stock);
        }
        public OrderBuilder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }
        public OrderBuilder productName(String productName) {
            this.productName = productName;
            return this;
        }
        public OrderBuilder consumerName(String consumerName) {
            this.consumerName = consumerName;
            return this;
        }
        public OrderBuilder price(int price) {
            this.price = price;
            return this;
        }
        public OrderBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }
    }

    @Override
    public String toString() {
        return
                "주문번호 = " + orderId +
                "\n상품명 = " + productName +
                "\n구매자 = " + consumerName +
                "\n가격 = " + price +
                "\n수량 = " + stock
                ;
    }
}
