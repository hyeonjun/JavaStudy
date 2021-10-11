package edu;

public class test_switch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nation = "KOR";
		// KOR JPN CHN => "아시아"
		// GBR FRA EUA => "유럽"
		// USA CAN MEX => "아메리카"
		
		if (nation.equals("KOR") || nation.equals("JPN") || nation.equals("CHN")) {
			System.out.println("아시아");
		} else if (nation.equals("GBR") || nation.equals("FRA") || nation.equals("EUA")) {
			System.out.println("유럽");
		} else if (nation.equals("USA") || nation.equals("CAN") || nation.equals("MEX")) {
			System.out.println("아메리카");
		} else {
			System.out.println("기타 지역");
		}
		
		
		switch(nation) {
		case "KOR": case "JPN": case "CHN":
			System.out.println("아시아");
			break;
		case "GBR": case "FRA": case "EUA":
			System.out.println("유럽");
			break;
		case "USA": case "CAN": case "MEX":
			System.out.println("아메리카");
			break;
		default:
			System.out.println("기타 지역");
		}
		
		
	}

}
