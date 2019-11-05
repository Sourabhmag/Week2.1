package com.bridgeLabz.creational.singleton;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EagerSingleton eager_obj1 = EagerSingleton.getObj();
		EagerSingleton eager_obj2 = EagerSingleton.getObj();

		StaticBlockinitilization static_obj1 = StaticBlockinitilization.getObj();
		StaticBlockinitilization static_obj2 = StaticBlockinitilization.getObj();

		Thread lazy_thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				Lazyinitilization lazy_obj = Lazyinitilization.getObj();
			}
		});
		Thread lazy_thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Lazyinitilization lazy_obj = Lazyinitilization.getObj();
			}
		});
		lazy_thread1.start();
		lazy_thread2.start();
		
		Thread threadsafe1 = new Thread(new Runnable() {

			@Override
			public void run() {
				ThreadsafeSingleton threadsafeObj = ThreadsafeSingleton.getObj();
			}
		});
		Thread threadsafe2 = new Thread(new Runnable() {

			@Override
			public void run() {
				ThreadsafeSingleton threadsafeObj = ThreadsafeSingleton.getObj();
			}
		});
		threadsafe1.start();
		threadsafe2.start();
		
		
		Thread double_check_thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				DoubleCheckLocking double_check_obj1 = DoubleCheckLocking.getObj();
			}
		});
		Thread double_check_thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				DoubleCheckLocking double_check_obj1 = DoubleCheckLocking.getObj();
			}
		});
		double_check_thread1.start();
		double_check_thread2.start();
		
		EnumSingleton enumObj = EnumSingleton.INSTANCE;
		BillPugh billpughObj = BillPugh.getObj();
	}

}
