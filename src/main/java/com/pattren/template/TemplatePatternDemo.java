package com.pattren.template;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。<br>
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行 。
 * */
public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}