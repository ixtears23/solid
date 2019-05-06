package com.solid.lsp.sample02;

public class LSPDemo {
	
	public void caculateArea(Rectangle rectangle) {
		rectangle.setBreadth(2);
		rectangle.setLength(3);
		
		
		assert rectangle.getArea() == 6 : printError("area", rectangle) ;
		
		assert rectangle.getLength() == 2 : printError("length", rectangle);
		assert rectangle.getBreadth() == 3 : printError("breadth", rectangle);
		
	}
	
	private String printError(String errorIdentifer, Rectangle rectangle) {
		return "Unexcepted value of " + errorIdentifer + " for instance of " + rectangle.getClass().getName();
	}
	
	public static void main(String[] args) {
		LSPDemo lspDemo = new LSPDemo();
		
		lspDemo.caculateArea(new Rectangle());
		lspDemo.caculateArea(new Square());
	}

}
