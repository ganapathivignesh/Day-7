package com.threadgrp;

public class Mainthreadgrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ThreadGroup g = new    ThreadGroup("group");
      Racinggrp.ThreadGroup1 grp1=new Racinggrp.ThreadGroup1("velocity",g);
      Racinggrp.ThreadGroup2 grp2=new Racinggrp.ThreadGroup2("data",g);
      Racinggrp.ThreadGroup3 grp3=new Racinggrp.ThreadGroup3("dalias",g);
   
      
      
      Thread t1=new Thread(g,grp1,"one");
      
      Thread t2=new Thread(g,grp1,"two");
      Thread t3=new Thread(g,grp1,"three");
      
      Thread t4=new Thread(g,grp2,"four");
      Thread t5=new Thread(g,grp2,"five");
      Thread t6=new Thread(g,grp2,"six");
      
      Thread t7=new Thread(g,grp3,"seven");
      Thread t8=new Thread(g,grp3,"eight");
      Thread t9=new Thread(g,grp3,"nine");
      
      
      synchronized(g)
    		  {
    	  grp1.start();
    	  grp2.start();
    	  grp3.start();
    		  }
	}

}
