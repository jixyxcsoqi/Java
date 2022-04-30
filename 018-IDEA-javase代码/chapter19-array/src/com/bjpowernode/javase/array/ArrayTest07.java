package com.bjpowernode.javase.array;

/**
 * һά��������룬�����д洢������Ϊ��������������
 * ����������˵��ʵ����ֻ�ܴ洢java����ġ��ڴ��ַ���������д洢��ÿ��Ԫ���ǡ����á���
 */
public class ArrayTest07 {
    public static void main(String[] args) {

        // a��һ������
        // a[0] �������е�һ��Ԫ�ء�
        // a[1] �������е�һ��Ԫ�ء�
        int[] a = {100, 200, 300};
        System.out.println(a[1]);
        //a[2] = 400;

        int[] array = {1,2,3};
        for (int i = 0; i < array.length; i++) {
            /*int temp = array[i];
            System.out.println(temp);*/
            System.out.println(array[i]);
        }

        // ����һ��Animal���͵�����
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1, a2};

        // ��Animal������б���
        for (int i = 0; i < animals.length; i++) {
            /*Animal a = animals[i];
            a.move();*/
            // ����ϲ�
            animals[i].move(); // ���move()������������ġ������鵱��Animal�����move()������
        }

        // ��̬��ʼ��һ������Ϊ2��Animal�������顣
        Animal[] ans = new Animal[2];
        // ����һ��Animal���󣬷ŵ�����ĵ�һ�������С�
        ans[0] = new Animal();

        // Animal������ֻ�ܴ��Animal���ͣ����ܴ��Product���͡�
        //ans[1] = new Product();

        // Animal�����п��Դ��Cat���͵����ݣ���ΪCat��һ��Animal��
        // Cat��Animal�����ࡣ
        ans[1] = new Cat();

        // ����һ��Animal���͵����飬���鵱�д洢Cat��Bird
        Cat c = new Cat();
        Bird b = new Bird();
        Animal[] anis = {c, b};

        //Animal[] anis = {new Cat(), new Bird()}; // �������д洢������������ڴ��ַ��
        for (int i = 0; i < anis.length; i++){
            // ���ȡ�����Ŀ�����Cat��Ҳ������Bird�������϶���һ��Animal
            // ������õķ����Ǹ����д��ڵķ�������Ҫ����ת�͡�ֱ��ʹ�ø��������õ��ü��ɡ�
            //anis[i]
            //Animal an = anis[i];
            //an.move();

            //Animal��û��sing()������
            //anis[i].sing();

            // �����Ӷ������з����Ļ�����Ҫ����ת�ͣ�����
            if(anis[i] instanceof Cat){
                Cat cat = (Cat)anis[i];
                cat.catchMouse();
            }else if(anis[i] instanceof Bird){
                Bird bird = (Bird)anis[i];
                bird.sing();
            }
        }

    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}

// ��Ʒ��
class Product{

}

// Cat������
class Cat extends Animal {
    public void move(){
        System.out.println("è����è����");
    }
    // ���з���
    public void catchMouse(){
        System.out.println("èץ����");
    }
}

// Bird����
class Bird extends Animal {
    public void move(){
        System.out.println("Bird Fly!!!");
    }
    // ���еķ���
    public void sing(){
        System.out.println("����ڸ質������");
    }
}