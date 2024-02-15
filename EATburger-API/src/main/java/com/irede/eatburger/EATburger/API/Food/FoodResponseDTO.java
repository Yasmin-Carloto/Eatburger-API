package com.irede.eatburger.EATburger.API.Food;

public record FoodResponseDTO(Integer id, String name, String image, Float price, Integer time, String description, String type, Boolean ischecked) {
    public FoodResponseDTO(Food food){
       this(food.getId(), food.getName(), food.getImage(), food.getPrice(), food.getTime(), food.getDescription(), food.getType(), food.getIschecked());
    }
}