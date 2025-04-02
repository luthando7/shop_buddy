package com.lzaze.startup.grocery;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
public class GroceryItemEntity {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String category;
    private String size;
    private boolean marked;
    private LocalDate created;
    private LocalDate updated;

    public GroceryItemEntity(String name, String category, String size) {
        this.name = name;
        this.category = category;
        this.size = size;
        this.marked = false;
        this.created = LocalDate.now();
        this.updated = LocalDate.now();
    }
}
