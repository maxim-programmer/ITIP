public abstract class Establishment {
    private String name;
    private String address;
    private int foundationYear;

    public Establishment(String name, String address, int foundationYear) {
        this.name = name;
        this.address = address;
        this.foundationYear = foundationYear;
        System.out.println("Создано заведение - " + name);
    }

    public Establishment() {
        this("Неизвестное место", "Нет адреса", 3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        if (foundationYear > 0 && foundationYear <= 2025) {
            this.foundationYear = foundationYear;
        } else {
            System.out.println("Ошибка: Некорректный год основания.");
        }
    }

    public void showInfo() {
        System.out.println("Информация о заведении");
        System.out.println("Название - " + name);
        System.out.println("Адрес - " + address);
        System.out.println("Год основания - " + foundationYear);
    }

    public abstract void describeActivity();
}