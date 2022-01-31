public class Array03Test{
	public static void main(String[]args){
		Animal a1=new Cat();
		Animal a2=new Bird();
		Animal[] animals={a1,a2};
		for(int i=0;i<animals.length;i++){
			animals[i].d();
			if(animals[i] instanceof Cat){
			Cat cat=(Cat)animals[i];
				
				cat.c();}
			else if(animals[i] instanceof Bird){
					Bird bird=(Bird)animals[i];
						bird.b();}
			}
			
					
		}

	}


class Animal
{
	public void d(){
	System.out.println("保护动物");
	}
}
class Cat extends Animal{
	
	public void c(){
	System.out.println("猫在抓地");
	}
}
class Bird extends Animal{
	
	public void b(){
	System.out.println("鸟儿特有飞翔");
	}
}