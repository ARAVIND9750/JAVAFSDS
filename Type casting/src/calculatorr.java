public class calculator{
	publicstaticvoidmain(Stringargs[]){
		Scannerx=newScanner(System.in);
		System.out.println("choose option \n1-addition\n2-subratction\n3-multiplucation\n4-divison");
		System.out.println("enter:");
		intopt=x.nextInt();
		System.out.println("enter fisrt value");
		inta=x.nextInt();
		System.out.println("enter second value");
		intb=x.nextInt();
		if(opt==1){
			System.out.println("additin is"+(a+b));
		}
		elseif(opt==2){
			System.out.println("subtraction is"+(a-b));
		}
		elseif(opt==3){
			System.out.println("multilpcation is"+(a*b));
		}
		elseif(opt==4){
			try{
			System.out.println("division is"+(double)(a/b));
		}catch(Exceptionex)
			{
			System.out.println("enter correct second value");
		}
			}
		else{
			System.out.println("choose correct option");
		}
		
	}


}
