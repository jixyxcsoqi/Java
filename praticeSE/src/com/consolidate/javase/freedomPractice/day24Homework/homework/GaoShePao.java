package com.consolidate.javase.freedomPractice.day24Homework.homework;

/**
 * 高射炮，是武器，但是不能移动，只能射击
 */
public class GaoShePao extends Weapon implements Shootable {

    @Override
    public void shoot() {
        System.out.println("高射炮开炮！！！");
    }
}
