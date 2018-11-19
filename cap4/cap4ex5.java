package cap4;


public class cap4ex5 {
    public static void main(String[] args) {
        Die dado = new Die();
        String resultados = "";
        for (int i = 0; i < 3; i++) {
            dado.roll();
            if (i == 0) {
                resultados = resultados + dado.getNumber();
            } else {
                resultados = resultados + " " + dado.getNumber();
            }
        }
        System.out.println(resultados);
    }
}
