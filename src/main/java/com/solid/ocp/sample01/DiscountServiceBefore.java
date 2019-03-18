package com.solid.ocp.sample01;

import java.math.BigDecimal;

public class DiscountServiceBefore {

	public BigDecimal applyDiscounts(BigDecimal price, DiscountBefore discount) {
		
		BigDecimal discountPrice = price.add(BigDecimal.ZERO);
		discountPrice = discount.apply(discountPrice);
		
		return discountPrice;
	}
	
	public BigDecimal applySeniorDiscount(BigDecimal price, SeniorDiscountBefore discount) {
		return discount.apply(price);
	}
}
