package com.cg.frs.dao;

@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException {
	
  public IdNotFoundException(String message)
  {
	  super(message);
  }
}
