package edu;

public class test_switch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nation = "KOR";
		// KOR JPN CHN => "�ƽþ�"
		// GBR FRA EUA => "����"
		// USA CAN MEX => "�Ƹ޸�ī"
		
		if (nation.equals("KOR") || nation.equals("JPN") || nation.equals("CHN")) {
			System.out.println("�ƽþ�");
		} else if (nation.equals("GBR") || nation.equals("FRA") || nation.equals("EUA")) {
			System.out.println("����");
		} else if (nation.equals("USA") || nation.equals("CAN") || nation.equals("MEX")) {
			System.out.println("�Ƹ޸�ī");
		} else {
			System.out.println("��Ÿ ����");
		}
		
		
		switch(nation) {
		case "KOR": case "JPN": case "CHN":
			System.out.println("�ƽþ�");
			break;
		case "GBR": case "FRA": case "EUA":
			System.out.println("����");
			break;
		case "USA": case "CAN": case "MEX":
			System.out.println("�Ƹ޸�ī");
			break;
		default:
			System.out.println("��Ÿ ����");
		}
		
		
	}

}
