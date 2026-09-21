package com.bridgelabz.generics;

interface MealPlan {
    void displayPlan();
}

class VegetarianMeal implements MealPlan {

    public void displayPlan() {
        System.out.println("Meal Plan: Vegetarian");
    }
}

class VeganMeal implements MealPlan {

    public void displayPlan() {
        System.out.println("Meal Plan: Vegan");
    }
}

class KetoMeal implements MealPlan {

    public void displayPlan() {
        System.out.println("Meal Plan: Keto");
    }
}

class HighProteinMeal implements MealPlan {

    public void displayPlan() {
        System.out.println("Meal Plan: High-Protein");
    }
}


// T is bounded to MealPlan.
// Only valid MealPlan implementations can be used.
class Meal<T extends MealPlan> {

    private String mealName;
    private T mealPlan;

    public Meal(String mealName, T mealPlan) {
        this.mealName = mealName;
        this.mealPlan = mealPlan;
    }

    public void displayMeal() {
        System.out.println("Meal: " + mealName);
        mealPlan.displayPlan();
        System.out.println("----------------------------");
    }
}


class MealUtility {

    // Generic method uses T to preserve the specific Meal type.
    public static <T extends MealPlan> Meal<T> generateMealPlan(
            String mealName, T plan) {

        return new Meal<>(mealName, plan);
    }
}


public class PersonalizedMealPlanGenerator {

    public static void main(String[] args) {

        VegetarianMeal vegetarian = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();
        KetoMeal keto = new KetoMeal();
        HighProteinMeal protein = new HighProteinMeal();

        // T = VegetarianMeal
        Meal<VegetarianMeal> meal1 =
                MealUtility.generateMealPlan("Vegetable Bowl", vegetarian);

        // T = VeganMeal
        Meal<VeganMeal> meal2 =
                MealUtility.generateMealPlan("Vegan Salad", vegan);

        // T = KetoMeal
        Meal<KetoMeal> meal3 =
                MealUtility.generateMealPlan("Keto Chicken", keto);

        // T = HighProteinMeal
        Meal<HighProteinMeal> meal4 =
                MealUtility.generateMealPlan("Protein Bowl", protein);

        meal1.displayMeal();
        meal2.displayMeal();
        meal3.displayMeal();
        meal4.displayMeal();
    }
}