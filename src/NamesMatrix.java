import java.util.Scanner;

//nao e a forma correta de se fazer
public class NamesMatrix {

    public static void main(String[] args) {
        
        String names[][] = {{"Cassiano", "Jose"}, {"Maria", "Ana"}, {"paulo", "Clara"}};

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(names[i][j]);
                for(int k = 0; k < 2; k++){
                    System.out.println(names[j][k]);
                }
            }
        }


    }
}
