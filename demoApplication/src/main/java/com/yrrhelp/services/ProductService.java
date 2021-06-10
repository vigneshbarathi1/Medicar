package com.yrrhelp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.yrrhelp.models.Product;

@Service 
public class ProductService {

	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("123", "paracetamol", "This is for fever ", 400.4, "Cipla"));
		listOfProducts.add(new Product("124", "Combiflame", "This is for cough ", 300.4, "Cipla"));
		listOfProducts.add(new Product("125", "Diclofenac", "This is for lung infection ", 200.4, "Intas"));

		return listOfProducts;
	}

	public Product getProductById(String id) {

		Predicate<Product> byId = p -> p.getId().equals(id);
		return filterProducts(byId);
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}
}
