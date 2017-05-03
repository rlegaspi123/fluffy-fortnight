# fluffy-fortnight
Project Objectives:

import greenfoot.; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo) import javax.swing.JOptionPane; /*

Write a description of class FakeAndRealGame here.
@author (your name)
@version (a version number or a date) */ public class FakeAndRealGame extends Actor {// field variable final int RANDOM_NUMBER = 10;

String[] randomQuestions = {"A Penny dropped from a 10ft fall can kill a person","Does oil stop stuck pasta.","Adding Sprinkle of salt can boil the water much quicker","Dogs sweat by salivating”,”5.) Alcohol can decrease your thinking","Alcohol keeps you warm","Bulls are colour blinded","Nails and hair keep growing after your death.","Mount Everest is the tallest mountain.","2D animated girls are better than real life girls."};

boolean [] fakeAndReal ={false,false,false,false,true,true,true,false,true,true};

/**

Act - do whatever the FakeAndRealGame wants to do. This method is called whenever
the 'Act' or 'Run' button gets pressed in the environment. */ public void act() {
}

public void dispMessage(){

String strNumQuestions;
strNumQuestions = JOptionPane.showInputDialog("Enter number of questions you want to play");




String strgameType;
strgameType = JOptionPane.showInputDialog("which type of game do you want to play?"+" "+
                                           "Press 1 to play fake count game"+" "+
                                           "and press 2 to play fake and real news game!!"); 
