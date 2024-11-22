package Less14;

public class Drink {
    private String name;
    private Size size;
    private double price;
    private boolean isAvailable;

    public Drink(String name,Size size, double price, boolean isAvailable) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void changeAvailability(boolean status){
        isAvailable = status;
    }
    public double calculateDiscountedPrice(double discount){
       return price -(price * (discount/100));
    }

    public boolean isAffordable(double budget){ //бюджет
        if (budget < price){  // return budget >= price;
            return false;
        }
        return true;
    }
    public int comparePrice(Drink otherDrink) {
        if (price == otherDrink.getPrice()) {
            return 0;
        } else if (price < otherDrink.getPrice()) {
            return -1;
        }
            return 1;
        }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return  "name='" + name +
                ", size=" + size +
                ", price=" + price +
                ", isAvailable=" + isAvailable ;
    }
}
