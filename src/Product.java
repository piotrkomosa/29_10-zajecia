import java.util.Objects;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}



//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){
//            return true;
//        }
//        if(obj == null){
//            return false;
//        }
//        if(!(obj instanceof Product)){
//            return  false;
//        }
//
//        Product other = (Product)obj;
//        if(name == null){
//            if(other.name != null){
//                return false;
//
//            }
//        }else if( !name.equals(other.name)){
//     }
//     return false;
//    }
//    if (price != other.price){
//        return false;