public class Store extends Establishment {

    private static int storeCount = 0;

    private String productType;
    private int employeeCount;

    public Store(String name, String address, int foundationYear, String productType, int employeeCount) {
        super(name, address, foundationYear);
        this.productType = productType;
        this.employeeCount = employeeCount;
        storeCount++;
    }

    public Store() {
        this("Неизвестный магазин", "Неизввестная ул.", 2000, "Продукты", 25);
    }

    public static int getStoreCount() {
        return storeCount;
    }

    @Override
    public void describeActivity() {
        System.out.println("Деятельность: Продажа " + productType + " населению.");
    }

    public void processSale(int amount) {
        System.out.println(getName() + " успешно обработал продажу на сумму: " + amount + " РУБ.");
    }
}