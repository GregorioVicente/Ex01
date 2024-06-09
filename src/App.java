import java.util.Scanner;

public class App {

    static Scanner Lerdados = new Scanner(System.in);
         public static void main(String[] args) throws Exception {
      
                Escolhas();
     
    }
   static void Escolhas(){
    System.out.println("""
            
          
    
    Escolha uma das opções:
    1 - Cadastrar Livros
    2- Listar Livros
    3 - Finalizar   
      """);
    int escolha = Lerdados.nextInt();
    
    switch (escolha) {
        case 1:System.out.println("Esreva os dados:Titulo do livro, Autor do Livro e  Ano de publicação");
        Livro Livro = new Livro();
        System.out.println("Livro cadastrado com sucesso!");
        Escolhas();
        case 2:
        Biblioteca.MostrarLivros();
            break;
        
        case 3:
        System.out.println("Obrigado por utilizar nossos serviços!");
        break;
    
        default:
            break;
    }
}
}
