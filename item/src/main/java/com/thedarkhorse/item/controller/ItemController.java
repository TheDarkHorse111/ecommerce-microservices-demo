package com.thedarkhorse.item.controller;

import com.thedarkhorse.item.model.Item;
import com.thedarkhorse.item.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity<Item> getItemByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(itemService.findByName(name));
    }

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestBody Item item) {
        return ResponseEntity.status(CREATED).body(itemService.save(item));
    }
}
