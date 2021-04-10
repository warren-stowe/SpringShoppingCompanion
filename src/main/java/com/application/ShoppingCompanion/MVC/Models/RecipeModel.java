package com.application.ShoppingCompanion.MVC.Models;

public class RecipeModel {

    public int pkRecipeId;
    public String recipeName;
    public int preparationTime;     //nullable
    public int cookingTime;         //nullable
    public String source;
    public int sourcePage;          //nullable
    public String sourceWebpage;

    public int getPkRecipeId() {
        return pkRecipeId;
    }

    public void setPkRecipeId(int pkRecipeId) {
        this.pkRecipeId = pkRecipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getSourcePage() {
        return sourcePage;
    }

    public void setSourcePage(int sourcePage) {
        this.sourcePage = sourcePage;
    }

    public String getSourceWebpage() {
        return sourceWebpage;
    }

    public void setSourceWebpage(String sourceWebpage) {
        this.sourceWebpage = sourceWebpage;
    }
}
