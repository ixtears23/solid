package com.solid.ocp.sample01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountBefore {
	
	public BigDecimal apply(BigDecimal price) {
		BigDecimal percent = new BigDecimal("0.10");
		BigDecimal discount = price.multiply(percent);
		return price.subtract(discount).setScale(2, RoundingMode.HALF_UP);
	}

}