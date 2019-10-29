public class ProductTest {

    public static void main(String[] args) {


        Product product1= new Product("Mleko",2.5);
        Product product2= new Product("Mleko",2.5);
        Product product3= product2;


        System.out.println("product1 = product2 " +(product1 == product2));
        System.out.println("product1.equals(product2) " + product1.equals(product2) );


        System.out.println("product2 = product3 " +(product2 == product3));
        System.out.println("product1.equals(product2) " + product2.equals(product3) );
    }


}
