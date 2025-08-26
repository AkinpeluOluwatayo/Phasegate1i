import java.util.Scanner;
public class Mbti {
  public static void main(String[] args){

   Scanner input = new Scanner(System.in);

	String[] sizeEI = new String[5];
	String[] sizeSN = new String[5];
	String[] sizeTF = new String[5];
	String[] sizeJP = new String[5];

	String[][] values = {
	{"1 A. Expend energy, Energy \t  B. Conserve energy, enjoy one on one"},
	{"2 A. Interpret literally \t  B. Look for meaning and possibilities"},
	{"3 A. Logical, thinking, questioning \t B. Empathetic, feeling accommodating"},
	{"4 A. Organised, orderly \t B. flexible, adaptable"},
	{"5 A. More outgoing, think out loud \t B. More reserved, think to yourself"},
	{"6 A. Practical, realistic, experiential \t B. Imaginative, innovative, theoretical"},
	{"7 A. Candid, straight forward, frank \t B. tactful, kind, encouranging"},
	{"8 A. Plan, schedule \t B. unplanned, spontaneous"},
	{"9 A. Seek many task, public activities, interaction with others, \t B. Seek private, solitary activities with quiet to concentrate"},
	{"10 A. Standard, usual, conventional \t B. Different, novel, unique"},
	{"11 A. Firm, tend to criticize, hold the line \t B. Gentle, tend to appreciate, conciliate"},
	{"12 A. Regulated, structured \t B. Easy-going, live and let live"},
	{"13 A. External, communicative, express yourself  \t B. Internal, reticent, keep to yourself"},
	{"14 A. Focus on here and now, \t B. Look to the future, global perspective, big picture"},
	{"15 A. Tough minded, just \t B. Tender hearted, merciful"},
	{"16 A. Preparation, plan ahead \t B. Go with the flow, adapt as you go"},
	{"17 A. Active, initiate \t B. Reflective, deliberate"},
	{"18 A. Facts, things, what is \t B. Ideas, dreams, what could be, philosophical"},
	{"19 A. Matter of fact, issue oriented \t B. Sensitive, people oriented, compassionate"},
	{"20 A. Control, govern, \t B. Lattitude, freedom"}
		};
	

	String[] results = new String[20];

	for (int row = 0; row < values.length; row++){
	  for (int col = 0; col < values[row].length; col++){

		System.out.println("Click A or B");
		System.out.println(values[row][col]);
		results[row] = input.next();
		
	   }


	}

	sizeEI[0] = results[0];
	sizeEI[1] = results[4];
	sizeEI[2] = results[8];
	sizeEI[3] = results[12];
	sizeEI[4] = results[16];


	sizeSN[0] = results[1];
	sizeSN[1] = results[5];
	sizeSN[2] = results[9];
	sizeSN[3] = results[13];
	sizeSN[4] = results[17];



	sizeTF[0] = results[2];
	sizeTF[1] = results[6];
	sizeTF[2] = results[10];
	sizeTF[3] = results[14];
	sizeTF[4] = results[18];


	sizeJP[0] = results[3];
	sizeJP[1] = results[7];
	sizeJP[2] = results[11];
	sizeJP[3] = results[15];
	sizeJP[4] = results[19];


	System.out.println("The result for question 1,5,9,13,17");
	System.out.println(sizeEI[0]);
	System.out.println(sizeEI[1]);
	System.out.println(sizeEI[2]);
	System.out.println(sizeEI[3]);
	System.out.println(sizeEI[4]);


	System.out.println("The result for question 2,6,10,14,18");
	System.out.println(sizeSN[0]);
	System.out.println(sizeSN[1]);
	System.out.println(sizeSN[2]);
	System.out.println(sizeSN[3]);
	System.out.println(sizeSN[4]);

	System.out.println("The result for question 3,7,11,15,19");
	System.out.println(sizeTF[0]);
	System.out.println(sizeTF[1]);
	System.out.println(sizeTF[2]);
	System.out.println(sizeTF[3]);
	System.out.println(sizeTF[4]);


	System.out.println("The result for question 4,8,12,16,20");
	System.out.println(sizeJP[0]);
	System.out.println(sizeJP[1]);
	System.out.println(sizeJP[2]);
	System.out.println(sizeJP[3]);
	System.out.println(sizeJP[4]);


	System.out.println("Thank you, here are your answers: ");
	System.out.println("Question ");




}


}