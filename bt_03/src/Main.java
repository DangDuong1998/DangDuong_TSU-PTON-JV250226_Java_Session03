import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    byte option;
        int maxSalary=0;
        int minSalary=0;
        int allSalary=0;
        int staffCount=0;
        int staffSalary=0 ;
        double allStaffBonus=0;
        while (true){
            System.out.println("***************MENU NHẬP LƯƠNG***************");
            System.out.println("1. Nhập lương nhân viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Tính tổng tiền thưởng cho nhân viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            option = scanner.nextByte();


            switch (option){
                case 1:
                    System.out.println("--- Nhập lương nhân viên (nhập -1 để kết thúc) ---");
                    do{
                        System.out.print("Nhập lương: ");
                        try{
                            staffSalary = scanner.nextInt();
                            if(staffSalary >= 0 && staffSalary <= 500000000 ){
                                float bonus;
                                if(staffSalary< 5000000){
                                    System.out.println("Phân loại: Thấp");
                                    bonus = staffSalary*0.05f;
                                }
                                else if(staffSalary>=5000000 && staffSalary<15000000){
                                    System.out.println("Phân loại: Trung Bình");
                                    bonus =  staffSalary*0.1f;
                                }
                                else if(staffSalary >= 15000000 && staffSalary < 50000000){
                                    System.out.println("Phân loại: Khá");
                                    bonus =  staffSalary*0.15f;
                                }
                                else{
                                    System.out.println("Phân loại: Cao");
                                    if(staffSalary < 100000000){
                                        bonus =  staffSalary*0.2f;
                                    }
                                    else{
                                        bonus =  staffSalary*0.25f;
                                    }
                                }
                                if(staffCount ==0){
                                    minSalary = staffSalary;
                                    maxSalary= staffSalary;
                                }
                                else {
                                    if(staffSalary > maxSalary){
                                        maxSalary = staffSalary;
                                    }
                                    if(staffSalary < minSalary){
                                        minSalary = staffSalary;
                                    }
                                }
                                allSalary += staffSalary;
                                allStaffBonus += bonus;
                                staffCount++;
                            }
                            else if(staffSalary != -1){
                                System.out.println("Lương không hợp lệ. Nhập lại.");
                            }
                        } catch (Exception e) {
//                            lớn hơn 2 tỷ1~ gây lỗi biến!
                                System.out.println("Lương không hợp lệ. Nhập lại.");
                                scanner.nextLine();
//                                staffSalary=0;
                        }
                    }while(staffSalary != -1);
                    break;
                case 2:
                    System.out.println("--- Thống kê ---");
                    if(staffCount == 0){
                        System.out.println("Chưa có dữ liệu");
                    }
                    else{
                        System.out.printf("Số nhân viên đã nhập: %,d\n",staffCount);
                        System.out.printf("Tổng lương: %,d VND\n", allSalary);
                        double averageSalary = Math.ceil((double) allSalary / staffCount);
                        System.out.printf("Lương trung bình: %,.0f VND\n",averageSalary);
                        System.out.printf("Lương cao nhất: %,d VND\n",maxSalary);
                        System.out.printf("Lương thấp nhất: %,d VND\n",minSalary);

                    }
                    break;
                case 3:
                    System.out.println("--- Tính tổng số tiền thưởng nhân viên ---");
                    if(staffCount == 0){
                        System.out.println("Chưa có dữ liệu");
                    }
                    else{
                        System.out.printf("Tổng tiền thưởng nhân viên: %,.0f VND \n",allStaffBonus);
                    }

                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Hãy nhập chỉ từ 1 đến 4");
                    break;
            }
        }

    }
}
