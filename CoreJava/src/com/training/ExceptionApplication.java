package com.training;

import com.training.myException.RangeCheckException;

public class ExceptionApplication {

  public static void main(String[] args) {

    try {
      Customer cust = new Customer(987456321L, 101, "Ramesh");
    }
    catch(RangeCheckException e){
      e.printStackTrace();
    }
    finally{
    	System.out.println("Finally block executed");
    }
  }
}
