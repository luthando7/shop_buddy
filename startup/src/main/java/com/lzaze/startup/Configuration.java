package com.lzaze.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.lzaze.startup.grocery.GroceryItemEntity;
import com.lzaze.startup.grocery.GroceryRepository;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    CommandLineRunner commandLineRunner(
        GroceryRepository groceryRepository
    ) {
        return args -> {
            GroceryItemEntity grocerySnackItem = new GroceryItemEntity("Romany Creams", "Snacks", "Regular");
            groceryRepository.save(grocerySnackItem);

            GroceryItemEntity groceryProteinItem = new GroceryItemEntity("Sirloin Steak", "Meat", "500g");
            groceryRepository.save(groceryProteinItem);
        };
    }
}
