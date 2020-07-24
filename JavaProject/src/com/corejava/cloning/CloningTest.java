package com.corejava.cloning;

public class CloningTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Human human = new Human();
		human.setGender("male");
		Man man = new Man();
		man.setAge(26);
		man.setHuman(human);
		Man manCloned = (Man) man.clone();
		System.out.println(manCloned);
		manCloned.getHuman().setGender("female");
		System.out.println(man.getHuman().getGender());
	}
}
