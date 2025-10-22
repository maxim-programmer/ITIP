public class Cafe extends Establishment {

    private int tableCount;
    private boolean hasTerrace;

    public Cafe(String name, String address, int foundationYear, int tableCount, boolean hasTerrace) {
        super(name, address, foundationYear);
        this.tableCount = tableCount;
        this.hasTerrace = hasTerrace;
    }

    public Cafe() {
        this("Неизвестное кафе", "пр. Неизвестный", 2018, 15, true);
    }

    @Override
    public void describeActivity() {
        String terraceInfo = hasTerrace ? " и имеет летнюю террасу." : " и не имеет террасы.";
        System.out.println("Деятельность: Обслуживание гостей за " + tableCount + " столами" + terraceInfo);
    }

    public void bringOrder(String dish) {
        System.out.println("Официант принес заказ: " + dish);
    }

    public void bringOrder(String drink, int quantity) {
        System.out.println("Официант принес " + quantity + " чашк(и/у) " + drink);
    }
}