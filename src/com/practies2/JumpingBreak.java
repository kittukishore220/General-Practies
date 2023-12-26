package com.practies2;

public class JumpingBreak {
	public void display() {
		for(int i=1;i<=10;i++) {
			//if (i==4)
				//break;
			if(i==7)
				continue;
					System.out.println("khammam"+i);
		}
		}

	public static void main(String[] args) {
		JumpingBreak JB=new JumpingBreak();
		JB.display();
	}

}

