package com.gessicameireles.CardapioDigital.controller;

import com.gessicameireles.CardapioDigital.dto.FoodRequestDTO;
import com.gessicameireles.CardapioDigital.dto.FoodResponseDTO;
import com.gessicameireles.CardapioDigital.model.Food;
import com.gessicameireles.CardapioDigital.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")

    @GetMapping
    public List<FoodResponseDTO> getAll(){


        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;

    }
}
