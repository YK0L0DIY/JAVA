package cap5;

public class color {
    public color(int num) {
        switch (num) {
            case 0:
                System.out.println("You selected Magenta");
                break;

            case 1:
                System.out.println("You selected Cyan");
                break;

            case 2:
                System.out.println("You selected Red");
                break;

            case 3:
                System.out.println("You selected Blue");
                break;

            case 4:
                System.out.println("You selected Green");
                break;

            default:
                System.out.println("Invalid selection");
        }
    }
}
