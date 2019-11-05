package com.bridgeLabz.behavioural.mediator;

public class Controller {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "Sourabh");
		User user2 = new UserImpl(mediator, "Pandit");
		User user3 = new UserImpl(mediator, "Aditya");
		User user4 = new UserImpl(mediator, "Aniket");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi guys");
		
	}
}
