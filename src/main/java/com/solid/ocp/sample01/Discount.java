package com.solid.ocp.sample01;

import java.math.BigDecimal;

public interface Discount {

	BigDecimal apply(BigDecimal price);
}
