package cap5;

public class coffee {

    public String points(int choise){
        if (choise>=500){
            return "You won a free cup of coffee and a regular-size\n" +
                    "doughnut and a 12-oz orange juice and a combo\n" +
                    "breakfast and a reserved table for one week.";
        }else if(choise>=400){
            return "You won a free cup of coffee and a regular-size\n" +
                    "doughnut and a 12-oz orange juice and a combo\n" +
                    "breakfast.";
        }else if(choise>=300){
            return "You won a free cup of coffee and a regular-size\n" +
                    "doughnut and a 12-oz orange juice.";
        }else if(choise>=200){
            return "You won a free cup of coffee and a regular-size doughnut.";
        }else if(choise>=100){
            return "You won a free cup of coffee.";
        }else return "";
    }
}
