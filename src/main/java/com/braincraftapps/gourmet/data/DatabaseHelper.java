package com.braincraftapps.gourmet.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String TABLE_CATEGORY = "Categories";
    public static final String ROW_CATEGORY_ID = "categoryId";
    public static final String ROW_CATEGORY_NAME = "categoryName";
    private static final String CREATE_CATEGORY_QUERY =
            "CREATE TABLE " + TABLE_CATEGORY + " (" +
                    ROW_CATEGORY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_CATEGORY_NAME + " TEXT " +
                    ")";

    public static final String TABLE_RECIPES = "Recipes";
    public static final String ROW_RECIPE_ID = "recipeId";
    public static final String ROW_RECIPE_CATEGORY_ID = "categoryId";
    public static final String ROW_RECIPE_NAME = "recipeName";
    public static final String ROW_RECIPE_SHORT_DESCRIPTION = "shortDescription";
    public static final String ROW_RECIPE_FULL_DESCRIPTION = "fullDescription";
    public static final String ROW_RECIPE_TIME = "recipeTime";
    public static final String ROW_RECIPE_FATS = "recipeFats";
    public static final String ROW_RECIPE_PROTEINS = "recipeProteins";
    public static final String ROW_RECIPE_CARBOHYDRATES = "recipeÑarbohydrates";
    public static final String ROW_RECIPE_TOTAL_CALORIES = "totalCalories";
    public static final String ROW_RECIPE_TOTAL_IMAGES = "totalImages";
    public static final String ROW_RECIPE_RATING = "recipeRating";
    public static final String ROW_RECIPE_SERVES_COUNT = "ServesCount";
    private static final String CREATE_RECIPE_QUERY =
            "CREATE TABLE " + TABLE_RECIPES + " (" +
                    ROW_RECIPE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_RECIPE_CATEGORY_ID + " INTEGER, " +
                    ROW_RECIPE_NAME + " TEXT, "  +
                    ROW_RECIPE_SHORT_DESCRIPTION + " TEXT,  "  +
                    ROW_RECIPE_FULL_DESCRIPTION + " TEXT,  "  +
                    ROW_RECIPE_TIME + " INTEGER, "  +
                    ROW_RECIPE_FATS + " REAL, "  +
                    ROW_RECIPE_PROTEINS + " REAL, "  +
                    ROW_RECIPE_CARBOHYDRATES + " REAL, "  +
                    ROW_RECIPE_TOTAL_CALORIES + " REAL, "  +
                    ROW_RECIPE_TOTAL_IMAGES + " INTEGER, "  +
                    ROW_RECIPE_RATING + " REAL, "  +
                    ROW_RECIPE_SERVES_COUNT + " INTEGER, "  +
                    "FOREIGN KEY(" + ROW_RECIPE_CATEGORY_ID + ") REFERENCES " + TABLE_CATEGORY + "(" + ROW_CATEGORY_ID + ")" +
                    ")";

    public static final String TABLE_STEPS = "Steps";
    public static final String ROW_STEP_ID = "stepId";
    public static final String ROW_STEP_RECIPE_ID = "recipeId";
    public static final String ROW_STEP_NUMBER = "stepNumber";
    public static final String ROW_STEP_DESCRIPTION = "stepDescription";
    private static final String CREATE_STEP_QUERY =
            "CREATE TABLE " + TABLE_STEPS + " (" +
                    ROW_STEP_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_STEP_RECIPE_ID + " INTEGER, " +
                    ROW_STEP_NUMBER + " INTEGER, "  +
                    ROW_STEP_DESCRIPTION + " TEXT, "  +
                    "FOREIGN KEY(" + ROW_STEP_RECIPE_ID + ") REFERENCES " + TABLE_RECIPES + "( " + ROW_RECIPE_ID + ")" +
                    ")";

    public static final String TABLE_IMAGES = "Images";
    public static final String ROW_IMAGE_ID = "imageId";
    public static final String ROW_IMAGE_RECIPE_ID = "recipeId";
    public static final String ROW_IMAGE_CATEGORY_ID = "categoryId";
    public static final String ROW_IMAGE_STEP_ID = "stepId";
    public static final String ROW_IMAGE_URL = "imageURL";
    public static final String ROW_IMAGE_DESCRIPTION = "imageDescription";
    private static final String CREATE_IMAGES_QUERY =
            "CREATE TABLE " + TABLE_IMAGES + " (" +
                    ROW_IMAGE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_IMAGE_RECIPE_ID + " INTEGER, " +
                    ROW_IMAGE_CATEGORY_ID + " INTEGER, " +
                    ROW_IMAGE_STEP_ID + " INTEGER, " +
                    ROW_IMAGE_URL + " TEXT, " +
                    ROW_IMAGE_DESCRIPTION + " TEXT, " +
                    "FOREIGN KEY(" + ROW_IMAGE_RECIPE_ID + ") REFERENCES " + TABLE_RECIPES + "(" + ROW_RECIPE_ID + "), " +
                    "FOREIGN KEY(" + ROW_IMAGE_CATEGORY_ID + ") REFERENCES " + TABLE_CATEGORY + "(" + ROW_CATEGORY_ID + "), " +
                    "FOREIGN KEY(" + ROW_IMAGE_STEP_ID +  ") REFERENCES " + TABLE_STEPS + "(" + ROW_STEP_ID + ")" +
                    ")";

    public static final String TABLE_MEASUREMENTS = "Measurements";
    public static final String ROW_MEASUREMENTS_ID = "measurementId";
    public static final String ROW_MEASUREMENTS_NAME = "measurementName";
    private static final String CREATE_MEASUREMENT_QUERY =
            "CREATE TABLE " + TABLE_MEASUREMENTS + " (" +
                    ROW_MEASUREMENTS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_MEASUREMENTS_NAME + " TEXT " +
                    ")";

    public static final String TABLE_PRODUCTS = "Products";
    public static final String ROW_PRODUCT_ID = "productId";
    public static final String ROW_PRODUCTS_NAME = "productName";
    public static final String ROW_PRODUCTS_FATS = "productFats";
    public static final String ROW_PRODUCTS_PROTEIN = "productProtein";
    public static final String ROW_PRODUCTS_CARBOHYDRATES = "productÑarbohydrates";
    public static final String ROW_PRODUCTS_TOTAL_CALORIES = "totalCalories";
    private static final String CREATE_PRODUCT_QUERY =
            "CREATE TABLE " + TABLE_PRODUCTS + " (" +
                    ROW_PRODUCT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_PRODUCTS_NAME + " TEXT, " +
                    ROW_PRODUCTS_FATS + " REAL, "  +
                    ROW_PRODUCTS_PROTEIN + " REAL, "  +
                    ROW_PRODUCTS_CARBOHYDRATES + " REAL, "  +
                    ROW_PRODUCTS_TOTAL_CALORIES + " REAL "  +
                    ")";

    public static final String TABLE_INGREDIENTS = "Ingredients";
    public static final String ROW_INGREDIENTS_ID = "ingredientId";
    public static final String ROW_INGREDIENTS_RECIPE_ID = "recipeId";
    public static final String ROW_INGREDIENTS_CATEGORY_ID = "categoryId";
    public static final String ROW_INGREDIENTS_PRODUCT_ID = "productId";
    public static final String ROW_INGREDIENTS_MEASUREMENT_ID = "measurementId";
    public static final String ROW_INGREDIENTS_QUANTITY = "quantity";
    private static final String CREATE_INGREDIENT_QUERY =
            "CREATE TABLE " + TABLE_INGREDIENTS + " (" +
                    ROW_INGREDIENTS_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_INGREDIENTS_RECIPE_ID + " INTEGER, " +
                    ROW_INGREDIENTS_CATEGORY_ID + " INTEGER, " +
                    ROW_INGREDIENTS_PRODUCT_ID + " INTEGER, " +
                    ROW_INGREDIENTS_MEASUREMENT_ID + "  INTEGER," +
                    ROW_INGREDIENTS_QUANTITY + " REAL, " +
                    "FOREIGN KEY(" + ROW_INGREDIENTS_RECIPE_ID +  ") REFERENCES " + TABLE_RECIPES + "(" + ROW_RECIPE_ID + "), " +
                    "FOREIGN KEY(" + ROW_INGREDIENTS_CATEGORY_ID +  ") REFERENCES " + TABLE_CATEGORY + "(" + ROW_CATEGORY_ID + "), " +
                    "FOREIGN KEY(" + ROW_INGREDIENTS_PRODUCT_ID +  ") REFERENCES " + TABLE_PRODUCTS + "(" + ROW_PRODUCT_ID + "), " +
                    "FOREIGN KEY(" + ROW_INGREDIENTS_MEASUREMENT_ID +  ") REFERENCES " + TABLE_MEASUREMENTS + "(" + ROW_MEASUREMENTS_ID + ")" +
                    ")";

    public static final String TABLE_USERS = "Users";
    public static final String ROW_USER_ID = "userId";
    public static final String ROW_USER_NAME = "userName";
    public static final String ROW_USER_SURNAME = "userSurname";
    public static final String ROW_USER_EMAIL = "userEmail";
    public static final String ROW_USER_PASSWORD = "userPassword";
    public static final String ROW_USER_AVATAR = "userAvatar";
    private static final String CREATE_USER_QUERY =
            "CREATE TABLE " + TABLE_USERS + " (" +
                    ROW_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_USER_NAME + " TEXT, " +
                    ROW_USER_SURNAME + " TEXT, "  +
                    ROW_USER_EMAIL + " TEXT, "  +
                    ROW_USER_PASSWORD + " TEXT, "  +
                    ROW_USER_AVATAR + " TEXT "  +
                    ")";

    public static final String TABLE_USER_RATED_RECIPE = "UserRatedRecipes";
    public static final String ROW_USER_RATED_RECIPE_ID = "userRatedRecipeId";
    public static final String ROW_USER_RATED_RECIPE_USER_ID = "userId";
    public static final String ROW_USER_RATED_RECIPE_RECIPE_ID = "recipeId";
    public static final String ROW_USER_RATED_RECIPE_USER_RATING = "userRating";
    private static final String CREATE_USER_RATED_RECIPE_QUERY =
            "CREATE TABLE " + TABLE_USER_RATED_RECIPE + " (" +
                    ROW_USER_RATED_RECIPE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_USER_RATED_RECIPE_USER_ID + " INTEGER, " +
                    ROW_USER_RATED_RECIPE_RECIPE_ID + " INTEGER, "  +
                    ROW_USER_RATED_RECIPE_USER_RATING + " REAL, "  +
                    "FOREIGN KEY(" + ROW_USER_RATED_RECIPE_USER_ID + ") REFERENCES " + TABLE_USERS + "( " + ROW_USER_ID + "), " +
                    "FOREIGN KEY(" + ROW_USER_RATED_RECIPE_RECIPE_ID + ") REFERENCES " + TABLE_RECIPES + "( " + ROW_RECIPE_ID + ")" +
                    ")";

    public static final String TABLE_USER_RECIPES = "UserRecipes";
    public static final String ROW_USER_RECIPES_ID = "userRecipeId";
    public static final String ROW_USER_RECIPES_RECIPE_ID = "recipeId";
    public static final String ROW_USER_RECIPES_USER_ID = "userId";
    private static final String CREATE_USER_RECIPE_QUERY =
            "CREATE TABLE " + TABLE_USER_RECIPES + " (" +
                    ROW_USER_RECIPES_ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
                    ROW_USER_RECIPES_RECIPE_ID + " INTEGER," +
                    ROW_USER_RECIPES_USER_ID + " INTEGER, "  +
                    "FOREIGN KEY(" + ROW_USER_RECIPES_RECIPE_ID + ") REFERENCES " + TABLE_RECIPES + "(" + ROW_RECIPE_ID + "), " +
                    "FOREIGN KEY(" + ROW_USER_RECIPES_USER_ID + ") REFERENCES " + TABLE_USERS + "(" + ROW_USER_ID + ")" +
                    ")";


    private static final String DATABASE_NAME = "gourmet.db";
    private static final int DATABASE_VERSION = 1;
    private static DatabaseHelper databaseHelperInstance = null;

    private DatabaseHelper(final Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static DatabaseHelper getInstance(Context context) {
        if (databaseHelperInstance == null) {
            databaseHelperInstance = new DatabaseHelper(context);
        }

        return databaseHelperInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CATEGORY_QUERY);
        /*db.execSQL("INSERT INTO " + TABLE_CATEGORY + " VALUES (" + "1, Ïåðâîå)");
        db.execSQL("INSERT INTO " + TABLE_CATEGORY + " VALUES (" + "2, Âòîðîå)");
        db.execSQL("INSERT INTO " + TABLE_CATEGORY + " VALUES (" + "3, Ìÿñíûå)");
        db.execSQL("INSERT INTO " + TABLE_CATEGORY + " VALUES (" + "4, Ðûáíûå)");*/
        db.execSQL(CREATE_RECIPE_QUERY);
        db.execSQL(CREATE_STEP_QUERY);
        db.execSQL(CREATE_IMAGES_QUERY);
        db.execSQL(CREATE_MEASUREMENT_QUERY);
        db.execSQL(CREATE_PRODUCT_QUERY);
        db.execSQL(CREATE_INGREDIENT_QUERY);
        db.execSQL(CREATE_USER_QUERY);
        db.execSQL(CREATE_USER_RECIPE_QUERY);
        db.execSQL(CREATE_USER_RATED_RECIPE_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CATEGORY);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RECIPES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STEPS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_IMAGES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEASUREMENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PRODUCTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_INGREDIENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER_RECIPES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER_RATED_RECIPE);
        onCreate(db);

    }
}










