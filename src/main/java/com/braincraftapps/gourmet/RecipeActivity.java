package com.braincraftapps.gourmet;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.braincraftapps.gourmet.data.IUowData;
import com.braincraftapps.gourmet.model.Calories;
import com.braincraftapps.gourmet.model.Description;
import com.braincraftapps.gourmet.vm.CategoryVM;
import com.braincraftapps.gourmet.vm.IngredientVM;
import com.braincraftapps.gourmet.vm.RecipeVM;
import com.braincraftapps.gourmet.vm.ViewModelHelper;

import java.util.List;

public class RecipeActivity extends ActionBarActivity {

    private LinearLayout ingredientsLinearLayout;
    private LinearLayout detailsLinearLayout;

    private List<RecipeVM> recipe;
    private List<Description> descriptions;
    private List<IngredientVM> ingredient;

    private IUowData uowData;
    private ViewModelHelper viewModelHelper;
    private CategoryVM category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);

        /*uowData = new UowData(this);
        ((IReadable) uowData).open();

        viewModelHelper = new ViewModelHelper(uowData);


        List<Recipe> recipes = uowData.getRecipes().findAll();*/

       // ArrayList<RecipeVM> recipeVM = (ArrayList<RecipeVM>) viewModelHelper.get(recipes);


       /* TypedArray images = getResources().
                obtainTypedArray(R.array.nav_category_icons);
        TypedArray imagesStep = getResources().
                obtainTypedArray(R.array.step);*/

       // recipe = ;
       /* recipe.add(new Recipe("Мясо по французски", images.getResourceId(0, -1), 70, "Мясо"
                , "Все мы любим ходить в кино и хрустеть попкорном. Но иногда собравшись всей семьёй у" +
                " \"голубого экрана\" хочется именно того самого карамельного попкорна. Представляю" +
                " Вам его. На сайте есть подобный рецепт, но принцип приготовления иной и есть разница" +
                " в ингредиентах.", 340.2f, 5.3f, 6.2f, 4.21f, 4.5f));*/


        /*ingredient = new ArrayList<>();
        *//*ingredient.add(new Ingredient("Говяжья голяшка на кости", 1.5, "кг."));
        ingredient.add(new Ingredient("Куриный окорочек", 4, "шт."));
        ingredient.add(new Ingredient("Белый гриб", 70, "гр."));
        ingredient.add(new Ingredient("Жареная ветчина", 300, "гр."));
        ingredient.add(new Ingredient("Капуста", 1, "шт."));
        ingredient.add(new Ingredient("Морковка", 3, "шт."));
        ingredient.add(new Ingredient("Корень петрушки", 1, "шт."));
        ingredient.add(new Ingredient("Чеснок", 7, "шт."));
        ingredient.add(new Ingredient("Петрушка", 1, "шт."));
        ingredient.add(new Ingredient("Лавровый лист", 1, "шт."));
        ingredient.add(new Ingredient("Смесь черного и душистого перца горошком", 1, "ч.л."));
        ingredient.add(new Ingredient("Соль"));
        ingredient.add(new Ingredient("Топленое масло"));
        ingredient.add(new Ingredient("Сметана"));*//*


        ingredientsLinearLayout = (LinearLayout) findViewById(R.id.ingredientLayout);
        RecipeAdapter adapter = new RecipeAdapter(getApplicationContext(), ingredient);
        int adapterCount = adapter.getCount();

        for (int i = 0; i < adapterCount; i++) {
            View item = adapter.getView(i, null, null);
            ingredientsLinearLayout.addView(item);
        }


        descriptions = new ArrayList<>();
        descriptions.add(new Description(1,"Положите голяшку на большой противень, рядом поместите" +
                " разрезанные пополам корень петрушки, 3 зубчика чеснока, 1 луковицу и 1 морковку" +
                " (овощи можно не очищать, только промыть). Все смажьте сверху маслом и поставьте" +
                " под сильно разогретый гриль до образования румяной корочки, на 15–20 мин. (за это время 1 раз переверните)."));
        descriptions.add(new Description(imagesStep.getResourceId(0, -1), true));
        descriptions.add(new Description(2,"Переложите голяшку с овощами в большую кастрюлю, залейте холодной водой на 4 пальца, доведите до кипения, уменьшите огонь до минимума и снимите пену. Добавьте половину связанных ниткой стеблей петрушки и перец горошком. Посолите, варите на минимальном огне 1,5 ч."));
        descriptions.add(new Description(imagesStep.getResourceId(1, -1), true));
        descriptions.add(new Description(3,"Залейте грибы половником горячего бульона и отставьте. Тонко нашинкуйте капусту, удалив кочерыжку. Мелко нарежьте оставшиеся лук, чеснок и морковь."));
        descriptions.add(new Description(imagesStep.getResourceId(2, -1), true));
        descriptions.add(new Description(4,"После 1,5 ч варки голяшки добавьте в кастрюлю куриные окорочка и лавровый лист, варите еще 40 мин. Снимите кастрюлю с огня, выньте голяшку и курицу, снимите мясо с костей средними кусками. Процедите бульон."));
        descriptions.add(new Description(imagesStep.getResourceId(3, -1), true));
        descriptions.add(new Description(5,"В сковороде разогрейте немного масла, положите лук, морковь и чеснок и обжарьте до мягкости, 5 мин. Добавьте вынутые из настоя грибы, обжаривайте до золотистого цвета лука, 5–7 мин."));
        descriptions.add(new Description(imagesStep.getResourceId(4, -1), true));
        descriptions.add(new Description(imagesStep.getResourceId(4, -1), true));
        descriptions.add(new Description(imagesStep.getResourceId(4, -1), true));
        descriptions.add(new Description(imagesStep.getResourceId(4, -1), true));
        descriptions.add(new Description(6,"Переложите содержимое сковороды в бульон вместе с капустой и грибным настоем, варите до готовности капусты, 15–20 мин. Добавьте рубленую оставшуюся петрушку, мясо голяшки и курицы, а также нарезанную полосками ветчину, закройте и дайте настояться на выключенной плите примерно 20 мин. Подавайте со сметаной."));
        descriptions.add(new Description(imagesStep.getResourceId(5, -1), true));

        detailsLinearLayout = (LinearLayout) findViewById(R.id.detailContainer);
        RecipeDescriptionAdapter detailsAdapter = new RecipeDescriptionAdapter(getApplicationContext(), descriptions);

        int adapterCount1 = detailsAdapter.getCount();
        for (int i = 0; i < adapterCount1; i++) {
            View item = detailsAdapter.getView(i, null, null);
            detailsLinearLayout.addView(item);
        }

        Calories calories = new Calories(420.2, 5, 3, 2);
        caloriesAdapter(calories);

       *//* images.recycle();
        imagesStep.recycle();*/
        recipeAdapter(recipe);

		/**/


    }

    public void recipeAdapter(List<RecipeVM> recipeToAdd) {
        TextView title = (TextView) findViewById(R.id.recipeName);
        TextView time = (TextView) findViewById(R.id.recipeTime);
        TextView category = (TextView) findViewById(R.id.recipeCategory);
        TextView description = (TextView) findViewById(R.id.recipeDescription);
        RatingBar rating = (RatingBar) findViewById(R.id.recipeRating);
        TextView totalImages = (TextView) findViewById(R.id.recipeTotalImages);
        ImageView recipeImage = (ImageView) findViewById(R.id.recipeImage);

        for (int i = 0; i < recipeToAdd.size(); i++) {
            title.setText(recipe.get(i).getName());
            time.setText(Integer.toString(recipe.get(i).getTime()) + " минут");
           // category.setText((int) recipe.get(i).getCategoryId());
          //  description.setText(recipe.get(i).getDescription());
            rating.setRating(recipe.get(i).getRating());
            totalImages.setText("4");
           // recipeImage.setImageResource(recipe.get(i).getImage());
        }


    }

    public void caloriesAdapter(Calories caloriesInRecipe) {
        TextView total = (TextView) findViewById(R.id.recipeTotalCalories);
        TextView fats = (TextView) findViewById(R.id.recipeFats);
        TextView protein = (TextView) findViewById(R.id.recipeProtein);
        TextView carbonates = (TextView) findViewById(R.id.recipeCarbonates);

        total.setText(Double.toString(caloriesInRecipe.getTotalCalories()) + " ккал.");
        fats.setText(Double.toString(caloriesInRecipe.getFats()) + " гр.");
        protein.setText(Double.toString(caloriesInRecipe.getProteins()) + " гр.");
        carbonates.setText(Double.toString(caloriesInRecipe.getCarbonates()) + " гр.");
    }
}

