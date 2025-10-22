public class Main {
    public static void main(String[] args) {
        Store store1 = new Store();
        Store store2 = new Store("Цветы", "ул. Садовая, 1", 2022, "Флористика", 3);
        Cafe cafe1 = new Cafe("Кафе Восточное", "ул. Мира, 7", 2010, 10, false);

        System.out.println();
        System.out.println("Всего создано объектов Store - " + Store.getStoreCount());

        System.out.println();
        System.out.println("Старое название store1: " + store1.getName());
        store1.setName("Переименованный Супермаркет");
        System.out.println("Новое название store1: " + store1.getName());
        store1.setFoundationYear(100);
        System.out.println("Год основания store1: " + store1.getFoundationYear());

        System.out.println();
        cafe1.showInfo();
        cafe1.describeActivity();

        System.out.println();
        cafe1.bringOrder("Суп");
        cafe1.bringOrder("Чай", 2);

        System.out.println();
        store2.processSale(5000);
    }
}