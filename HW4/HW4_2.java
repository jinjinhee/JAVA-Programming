import java.util.Scanner;
class HW4_2{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		String type;
		boolean repeat=true;
		do{
			System.out.print("도형의 타입을 입력하세요(피라미드, 사각형, 다이아몬드): ");
			type = s.nextLine();
			int line;
			repeat=true;
			switch(type){
			case "피라미드":
				do{
					System.out.print("출력할 줄 수(10이하 양의 정수): ");	
					line = s.nextInt();
				}while(line<=0||line>10);//do-while문은 아직 안했으니 이부분은 제외하고 패턴 출력만 제대로 할 수 있으면 됩니다!!
				for(int i=0;i<line;i++){
					for(int j=line-1-i;j>0;j--){
						System.out.print(" ");
					}
					for(int j=i;j>=0;j--){
						System.out.print(j);
					}
					for(int j=1;j<=i;j++){
						System.out.print(j);
					}
					System.out.println();
				}
				repeat=false;
				break;
			case "사각형":	
				repeat=false;
				int 가로, sero, banbok;
				do{
					System.out.print("가로 : ");
					가로 = s.nextInt();
					System.out.print("세로 : ");
					sero = s.nextInt();
					System.out.print("반복횟수 : ");
					banbok = s.nextInt();
				}while(가로<0||sero<0||banbok<0);//역시 패턴 출력만 제대로 할 수 있으면 됩니다!!
				
				for(int i=0;i<sero;i++){
					for(int j=0;j<banbok;j++){
						for(int k=0; k<가로; k++){
							System.out.print("*");
						}
						System.out.print(" ");
					}
					System.out.println();
				}
				break;
			case "다이아몬드":
				do{
					System.out.print("출력할 줄 수(홀수): ");	
					line = s.nextInt();
				}while(line<=0||line%2==0);	//마찬가지로 이 부분은 몰라도 되고, 패턴 출력만 제대로 작성하시면 됩니다~!!
				
				for(int i=0;i<=line/2;i++){
					for(int j=line/2-i; j>0;j--){
						System.out.print(" ");
					}
					for(int j=0; j<2*i+1;j++){
						System.out.print("*");
					}
					System.out.println();
				}
				for(int i=0;i<line/2;i++){
					for(int j=0; j<=i;j++){
						System.out.print(" ");
					}
					for(int j=0; j<2*(line/2-i)-1;j++){
						System.out.print("*");
					}
					System.out.println();
				}
				repeat=false;
				break;	
			default:	
				System.out.println("도형 타입을 제대로 입력하세요.\n");
				break;		
			}	
		}while(repeat);	
	}
}