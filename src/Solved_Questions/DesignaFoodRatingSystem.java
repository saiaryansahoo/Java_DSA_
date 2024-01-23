package Solved_Questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class DesignaFoodRatingSystem {
    public static void main(String[] args) {

    }
}

class FoodRatings {

    class Food {
        private String food, cuisine;
        private int rating;
        Food(String food, String cuisine, int rating){
            this.food = food;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }

    class FoodComparator implements Comparator<Food> {
        public int compare(Food s1, Food s2) {
            if (s1.rating < s2.rating)
                return 1;
            else if (s1.rating > s2.rating)
                return -1;
            return (s1.food).compareTo(s2.food); // if ratings are equal
        }
    }

    HashMap<String, Food> foodMap;
    HashMap<String, TreeSet<Food>> cuisineMap;
    TreeSet<Food> bestFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodMap = new HashMap<>();
        cuisineMap = new HashMap<>();

        for(int i=0; i<foods.length; i++){
            if(cuisineMap.containsKey(cuisines[i])){
                bestFoods = cuisineMap.get(cuisines[i]);
            } else{
                bestFoods = new TreeSet<>(new FoodComparator());
            }

            Food foodObj = new Food(foods[i], cuisines[i], ratings[i]);
            bestFoods.add(foodObj);
            cuisineMap.put(cuisines[i], bestFoods);
            foodMap.put(foods[i], foodObj);
        }
    }

    public void changeRating(String newFood, int newRating) {
        Food foodObj = foodMap.get(newFood);
        String cuisine = foodObj.cuisine;
        bestFoods = cuisineMap.get(cuisine);

        bestFoods.remove(foodObj);
        foodObj.rating = newRating;
        bestFoods.add(foodObj);
    }

    public String highestRated(String cuisine) {
        bestFoods = cuisineMap.get(cuisine);
        Food foodObj = bestFoods.first();
        return foodObj.food;
    }
}