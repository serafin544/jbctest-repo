package necklaceShop;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class necklace {
     String brand;
     double price;
     int itemID;
     String date;



    public necklace(String brand, double price, int itemID, String date){
         this.brand = brand;
         this.price = price;
         this.itemID = itemID;
         this.date = date;

     }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
       date = date;
    }

    @Override
    public String toString() {
        return "Fancy Necklace   " +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", itemID=" + itemID +
                ", date='" + date + '\'';
    }
}
