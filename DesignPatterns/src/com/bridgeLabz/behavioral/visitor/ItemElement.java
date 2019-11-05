package com.bridgeLabz.behavioral.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}
