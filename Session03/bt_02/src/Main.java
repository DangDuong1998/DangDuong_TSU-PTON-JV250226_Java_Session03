import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        boolean flag = true;
        int studentCount = 0;
        float allStudentGrade = 0;
        float maxGrade = 0;
        float minGrade = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("***************MENU NHẬP ĐIỂM***************");
            System.out.println("1.  Nhập điểm học viên");
            System.out.println("2.  Hiển thị thống kê");
            System.out.println("3.  Thoát");
            System.out.print("Lựa chọn của bạn: ");
            byte option = scanner.nextByte();
            switch (option){
                case 1:
                    System.out.println("--- Nhập điểm học viên (nhập -1 đ dừng) ---");
                    float inputGrade;
                    do{
                        System.out.print("Nhập điểm: ");
                        inputGrade = scanner.nextFloat();
                        if((inputGrade < 0 || inputGrade >10)&& inputGrade != -1){
                            while ((inputGrade < 0 || inputGrade >10)&&inputGrade != -1){
                                System.err.println("Điểm không hợp lệ. Nhập lại.");
                                inputGrade = scanner.nextFloat();
                            }
                        }
                        if(inputGrade != -1){
                            if(inputGrade< 5){
                                System.out.println("Học lực: Yếu");
                            }
                            else if(inputGrade >= 5 && inputGrade< 7 ){
                                System.out.println("Học lực: Trung Bình");
                            }
                            else if(inputGrade >= 7 && inputGrade < 8){
                                System.out.println("Học lực: Khá");
                            }
                            else if(inputGrade >= 8 && inputGrade < 9){
                                System.out.println("Học lực: Giỏi");
                            }
                            else{
                                System.out.println("Học lực: Xuất Sắc");
                            }
                            allStudentGrade += inputGrade;
                            if(studentCount == 0){
                                maxGrade = inputGrade;
                                minGrade = inputGrade;
                            }
                            else{
                                if(maxGrade < inputGrade){
                                    maxGrade = inputGrade;
                                }

                                if(minGrade > inputGrade){
                                    minGrade = inputGrade;
                                }
                            }

                            studentCount ++;
                        }
                    }while (inputGrade != -1);

                    break;

                case 2:
                    if(studentCount == 0){
                        System.out.println("Chưa có dữ liệu");
                    }
                    else{
                        float averageGrade = allStudentGrade / studentCount;
                        System.out.println("---KẾT QUẢ ---");
                        System.out.printf("Số học viên đã nhập: %d\n",studentCount);
                        System.out.printf("Điểm trung bình: %.2f\n",averageGrade);
                        System.out.printf("Điểm cao nhất: %.2f\n",maxGrade);
                        System.out.printf("Điểm thấp nhất: %.2f\n",minGrade);
                    }
                    break;
                case 3:
                    System.out.print("Kết thúc chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập chỉ từ 1 đến 3!");
                    break;
            }
        }while (true);


    }
}
