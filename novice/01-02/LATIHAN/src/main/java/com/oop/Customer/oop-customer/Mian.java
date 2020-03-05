import java.util.Scanner;

/**
 * Mian
 */
public class Mian {

    public static void main (String [] args){


        boolean kondisi = true;
        do{


        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukan Nama Pembeli : ");
        String namaPembeli = inputScanner.nextLine();


        System.out.print("Masukan Alamat Pembeli : ");
        String alamatPembeli = inputScanner.nextLine();

        Customer customer1 = new Customer (namaPembeli, alamatPembeli );

        System.out.print("Masukan Nama Barang : ");
        String namaBarang= inputScanner.nextLine();

        System.out.print("Masukan Harga Barang : ");
        int hargaBarang= inputScanner.nextInt();

        System.out.print("Masukan Jumlah Barang : ");
        int jumlahBarang= inputScanner.nextInt();

        Order order1 = new Order (namaBarang, hargaBarang, jumlahBarang);
        customer1.order(order1);
        
        System.out.print("Lanjut ? (Y/T)");
        String kondisiInput = inputScanner.next();

        if (kondisiInput.equalsIgnoreCase("y")){
            kondisi = true;
        }else{
            System.out.println("____________terima kasih__________");
           
        }
    }while(false);

    
    }
}

class Customer {



    private String place_order;
    private String knows_name;
    private String knows_address;
    private String knows_customer_number;
    private String order_history;

    public Customer(String knows_name, String knows_address){
        this.knows_name = knows_name;
        this.knows_address = knows_address;
    }

    public void order (Order order){
        order.orderItemsDetaile();

    }
 
}

class Order {

    private String knows_placement_date ;
    private String delivery_date;
    private String order_items;
    private int price_items;
    private int amount;
    private int total;
    private String applicable_taxes;
    private String order_number;

    public Order(String order_items, int price_items, int amount) {
        this.order_items = order_items;
        this.price_items = price_items;
        this.amount = amount;
    }

    public void orderItemsDetaile() {
        total = price_items * amount;

        System.out.println("------------ You Order Detail------------------");
        System.out.println("name items : " + order_items);
        System.out.println("price items : " + price_items);
        System.out.println("amount items : " + amount);
        System.out.println("total : " + total);
    }


}