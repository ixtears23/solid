package com.solid.ocp.sample01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class DiscountService {
	
	public BigDecimal applyDiscounts(BigDecimal price, Discount[] discounts) {
		
		BigDecimal discountPrice = price.add(BigDecimal.ZERO);
		
		List<Discount> discount = Arrays.asList(discounts);
		discount.forEach(s -> s.apply(discountPrice));
		
		
		return discountPrice;
	}

}
