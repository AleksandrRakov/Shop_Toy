    class Toy {
        private int id;
        private String name;
        private int quantity;
        private double percent;

        public Toy(int id, String name, int quantity, double percent) {
            this.id = id;
            this.name = name;
            this.quantity = quantity;
            this.percent = percent;
    }

    public String getName() {
        return name;
    }

    public double getPercent() {
        return percent;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity() {
        quantity--;
    }

    
    public String toString() {
        return "Номер: " + id + ", Название: " + name + ", Количество: " + quantity + ", Вероятность: " + percent + "%";
    }

}
