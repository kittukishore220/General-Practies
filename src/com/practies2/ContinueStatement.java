package com.practies2;

public class ContinueStatement {
	public void show() {
		for(int i=1;i<=10;i++){
		//if(i==8)
		// continue;
		if(i==5)
		break;{
				System.out.println("khammam:"+i);
			}
	}

}
	public static void main(String[] args) {
		ContinueStatement CS= new ContinueStatement();
		CS.show();
	}
}