package com.example.demoapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class DemoapigatewayApplication {

	private List<Book> books = new ArrayList<>();

	@PostMapping
	public Book addBook(@RequestBody Book book)
	{
		books.add(book);
		return book;
	}

	@GetMapping
	public List<Book> getBooks()
	{
		return books;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoapigatewayApplication.class, args);
	}

}

echo "# demogithubactions" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/meghadave1/demogithubactions.git
		git push -u origin main