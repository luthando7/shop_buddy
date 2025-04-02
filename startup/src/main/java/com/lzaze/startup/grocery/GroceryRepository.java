package com.lzaze.startup.grocery;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface GroceryRepository extends JpaRepository<GroceryItemEntity, UUID>{
}