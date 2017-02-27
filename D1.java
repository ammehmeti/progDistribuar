import java.util.Scanner;

public class D1 {

	public static void main(String args[]) {
		String[] pp = new String[40];
		
		pp[0] = "Sa lojtare ka loja e futbollit ? ";
		pp[1] = "Lumi me i gjate ne Afrike?";
		pp[2] = "Kush e fitoi kampionatin Europian ?";
		pp[3] = "Cili aktor e ka fituar oscarin vitin e kaluar ?";
		pp[4] = "Ne java sa bit merr floati ne memorie?";
		pp[5] = "Sa eshte vlera e numrit PI ? ";
		pp[6] = "Ku gjendet shkretetira e sahares ?";
		pp[7] = "Kush e themeloi Microsoft-in";
		pp[8] = "Oqeani me i madhe ?";
		pp[9] = "Shteti me me se shumti banore ?";
		pp[10] = "Kur filloi Lufta e Dyte Boterore ?";
		pp[11] = "Cili eshte kryeqyteti i Anglise ?";
		pp[12] = "Sa shtete ka Amerika ?";
		pp[13] = "Sa kontinente jane gjithsej ?";
		pp[14] = "Sa eshte rezultati i 2+2/2";
		pp[15] = "Cili eshte kryeqyteti i Shqiperise?";
		pp[16] = "Cili eshte smartphone-i i pare i Apple ?";
		pp[17] = "Ne cilin vite u themelua Facebook ?";
		pp[18] = "Ne cilin vite u themelua Google ?";
		pp[19] = "Sa eshte rrenja katrore e numrit 16?";
		
		pp[20] = "22";
		pp[21] = "Nili";
		pp[22] = "Portugalia";
		pp[23] = "Leonardo di Caprio";
		pp[24] = "4";
		pp[25] = "3.14";
		pp[26] = "Afrike";
		pp[27] = "Bill Gates";
		pp[28] = "Paqesori";
		pp[29] = "Kina";
		pp[30] = "1939";
		pp[31] = "Londra" ;
		pp[32] = "52";
		pp[33] = "7";
		pp[34] = "3";
		pp[35] = "Tirana";
		pp[36] = "iPhone 2g";
		pp[37] = "2004";
		pp[38] = "1998";
		pp[39] = "4";
		

		for (int i = 0; i < 20; i++) {
			String a[] = new String[20];
			Scanner in = new Scanner(System.in);
			System.out.println(pp[i]);

			a[i] = in.nextLine();

			if (a[i].equals(pp[i + 20]))
				System.out.println("E sakte");
			else {
				System.out.println("E pasakte -Rishqyrto");
				a[i] = in.nextLine();
			}
			}
		}
	}
