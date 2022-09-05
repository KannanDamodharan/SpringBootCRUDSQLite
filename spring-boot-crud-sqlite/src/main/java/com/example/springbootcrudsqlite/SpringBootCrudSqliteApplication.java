package com.example.springbootcrudsqlite;

import com.example.springbootcrudsqlite.entities.Product;
import com.example.springbootcrudsqlite.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudSqliteApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudSqliteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		demo6();
	}

	private void demo1() {
		for(Product product: productService.findAll()){
			System.out.println("id: "+product.getId());
			System.out.println("name: "+product.getName());
			System.out.println("price: "+product.getPrice());
			System.out.println("quantity: "+product.getQuantity());
		}
	}

	private void demo2() {
		System.out.println("inside demo2 ");
		for(Product product: productService.search(29, 30)){
			System.out.println("id: "+product.getId());
			System.out.println("name: "+product.getName());
			System.out.println("price: "+product.getPrice());
			System.out.println("quantity: "+product.getQuantity());
		}
	}

	private void demo3() {
		System.out.println("inside demo3 ");
		Product product = productService.find(2);
			System.out.println("id: "+product.getId());
			System.out.println("name: "+product.getName());
			System.out.println("price: "+product.getPrice());
			System.out.println("quantity: "+product.getQuantity());
	}

	private void demo4() {
		System.out.println("inside demo4");

		Product product = new Product();
		product.setName("abc");
		product.setPrice(6);
		product.setQuantity(4);
		product.setStatus(true);
		product = productService.save(product);
		System.out.println("id: "+product.getId());
		System.out.println("name: "+product.getName());
		System.out.println("price: "+product.getPrice());
		System.out.println("quantity: "+product.getQuantity());
	}

	private void demo5() {
		System.out.println("inside demo5");

		Product product = productService.find(4);

		product.setName("aabc");
		product.setPrice(9);
		product.setQuantity(3);
		product.setStatus(false);

		product = productService.save(product);
		System.out.println("id: "+product.getId());
		System.out.println("name: "+product.getName());
		System.out.println("price: "+product.getPrice());
		System.out.println("quantity: "+product.getQuantity());
	}

	private void demo6() {
		try{
			productService.delete(4);
		}
		catch (Exception e){
			
		}
	}
}
