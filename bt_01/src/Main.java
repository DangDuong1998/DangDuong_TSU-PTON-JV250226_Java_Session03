import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       System.out.println("================== NHẬP THÔNG TIN HÓA ĐƠN ==================");
       System.out.print("Nhập tên khách hàng: ");
       Scanner scanner = new Scanner(System.in);
       String clientName = scanner.nextLine();
       System.out.print("Nhập tên sản phẩm: ");
       String productName = scanner.nextLine();
       System.out.print("Nhập giá sản phẩm: ");
       float productPriceTag =  scanner.nextFloat();
       System.out.print("Nhập số lượng mua: ");
       int productQuantity = scanner.nextInt();
       System.out.print("Khách có thẻ thành viên? (true/false): ");
       boolean isMembership = scanner.nextBoolean();
       scanner.close();
       float sumBill = productPriceTag * productQuantity;
       float vat = sumBill*0.08f;
       float sumFinal = sumBill + vat;
       float discount = 0;
       if(isMembership){
        discount = sumBill *0.1f;
        sumFinal = sumFinal - discount;
       }
        System.out.println("======================= HÓA ĐƠN =======================");
        System.out.printf("Khách hàng: %s\n",clientName);
        System.out.printf("Số lượng: %d\n",productQuantity);
        System.out.printf("Đơn giá: %,.2f VND\n",productPriceTag);
        System.out.printf("Thành tiền: %,.2f VND\n",sumBill);
        System.out.printf("Giảm giá thành viên (10%%): %,.2f VND\n",discount);
        System.out.printf("Tiền VAT (8%%): %,.2f VND\n",vat);
        System.out.printf("Tổng thanh toán: %,.2f VND\n",sumFinal);
    }
}
