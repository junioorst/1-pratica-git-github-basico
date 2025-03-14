import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(10);
        array.add(7);
        array.add(2);
        array.add(23);
        array.add(45);
        array.add(9);

        retornaOcorrencias(array, 5);
        retornaRepetidos(array);
    }

    // a. Método que retorna quantas ocorrências de um elemento estão na lista
    public static int retornaOcorrencias(ArrayList<Integer> array, int l) {
        int ocorrencias = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == l) {
                ocorrencias++;
            }
        }
        return ocorrencias;
    }


    //   d. Método que retorna uma lista de elementos repetidos de l
    public static ArrayList<Integer> retornaRepetidos (ArrayList<Integer> array) {
        ArrayList<Integer> repetidos = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            int num = array.get(i);
            if (array.indexOf(num) != i && !repetidos.contains(num)) {
                repetidos.add(num);
            }
        }
        return repetidos;
    }
}