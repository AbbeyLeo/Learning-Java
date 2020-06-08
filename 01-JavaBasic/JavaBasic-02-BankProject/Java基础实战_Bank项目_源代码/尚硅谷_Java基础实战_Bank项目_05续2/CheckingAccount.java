package banking5_3;

public class CheckingAccount extends Account{

	//��ʾ͸֧����
	private SavingAccount protectedBy;
	
	public CheckingAccount(double init_balance) {
		super(init_balance);
	}
	
	public CheckingAccount(double init_balance, SavingAccount protectedBy){
		super(init_balance);
		this.protectedBy = protectedBy;
	}
	
	/**
	 * ��д withdraw ������ 
	 * 
	 * �˷�������ִ�����м�顣�����ǰ����㹻�ֲ�ȡ��amount,���������С�
	 * ��������ֲ����Ǵ���͸֧������������overdraftProtection��ֵ���ֲ��ò�ֵ��balance-amount��.
	 * ����ֲ���͸֧����Ҫ�Ľ����ڵ�ǰ�ı�����������������ʧ�ܣ������δ��Ӱ�졣
	 * 
	 */
	@Override
	public boolean withdraw(double amt) {
		if(balance >= amt){
			balance -= amt;
		}else{
			if(protectedBy != null && protectedBy.getBalance() >= (amt - balance)){
				protectedBy.withdraw(amt - balance);
				balance = 0;
			}else{
				return false;
			}
		}
		
		return true;
	}
	
}
