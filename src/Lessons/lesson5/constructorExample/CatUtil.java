package lessons.lesson5.constructorExample;

public class CatUtil {
    Cat createCat(){
        UserInput ui = new UserInput();
        String catName = ui.userInputText("Please enter Cat name ");
        String catColor = ui.userInputText("Please enter Cat color ");
        int catAge = ui.userInputInt("Please enter Cat age ");
        boolean catHungry = ui.userInputBoolean("Is cat hungry? ");

        Cat newCat = new Cat(catName,catColor,catAge,catHungry);
        System.out.println("Create new cat - "+newCat);


        return newCat;
    }
}
