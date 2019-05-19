package com.topgun.springmodule;

public class Person {
	
	String name;
	int age;

	public Person () {
		System.out.println("person construct...");
	}
	
	public void sayHello() {
		System.out.println(name +":"+age);
	}
	
	public static void main(String[] args) {
		System.out.println(new Person().toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void open() {
		System.out.println("打开资源");
		}
		public void close() {
		System.out.println("释放资源");
		}
	
}
