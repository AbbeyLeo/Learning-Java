class Test07{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = input.nextInt();
		
		System.out.print("���������ڣ�");
		int day = input.nextInt();
		
		int days = day;
		switch(month){
			case 12:
				//ǰ��11���µ�������
				//days += ��11�µ�����;
				days += 30;
			case 11:
				//ǰ��10���µ�������
				//days += ��10�µ�����;
				days += 31;
			case 10:
				days += 30;//����
			case 9:
				days += 31;//����
			case 8:
				days += 31;//����
			case 7:
				days += 30;//����
			case 6:
				days += 31;//����
			case 5:
				days += 30;//����
			case 4:
				days += 31;//����
			case 3:
				days += 28;//����
			case 2:
				days += 31;//һ��
		}
		
		int week = 2-1;
		week += days;
		week = week%7;
		
		System.out.println(month+"��"+day+"��������"+(week==0?"��":week));
	}
}