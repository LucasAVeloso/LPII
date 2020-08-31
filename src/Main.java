import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Olá, este programa irá passar por uma conversa entre dois estranhos.");
		System.out.println("Defina o sentimento de cada um seguindo a seguinte regra:");
		System.out.println("1-Feliz");
		System.out.println("2-Triste");
		System.out.println("3-Mano");
		System.out.println("4-Esperançoso");
		System.out.println("5-Puto");
		System.out.println("Não selecionar uma opção válida deixará sua pessoa bem puta!");

		System.out.println("---");
		System.out.println("---");
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		System.out.println("Como se chama a pessoa 1?");
		pessoa1.nome = sc.nextLine();
		System.out.println("Como se chama a pessoa 2?");
		pessoa2.nome = sc.nextLine();
		
		
		System.out.println("Defina o sentimento de " + pessoa1.nome);
		pessoa1.status = sc.nextLine();
		pessoa1.InicializaPessoa();
		System.out.println(pessoa1.nome + " definida como " + pessoa1.statusExtenso);
		
		//-------------------------------
		
		System.out.println("Defina o sentimento de " + pessoa2.nome);
		pessoa2.status = sc.nextLine();
		pessoa2.InicializaPessoa();
		System.out.println(pessoa2.nome + " definida como " + pessoa2.statusExtenso);

		System.out.println("Tudo pronto. Aperte Enter para inciar");
		
		sc.nextLine();
		
		System.out.println("---");
		System.out.println("INICIANDO SIMULAÇÃO");
		System.out.println("---");

		System.out.println("Em uma rua movimentada pelo comércio de rua no centro de São Paulo");
		System.out.println("O olhar de duas pessoas se entrelaça");
		System.out.println("Querendo mostrar iniciativa, " + pessoa1.nome + " começa se saudando:");
		System.out.println(pessoa1.nome +": " + pessoa1.saudacao);
		System.out.println("Com educação, " + pessoa2.nome + " retruca:");
		System.out.println(pessoa2.nome +": " + pessoa2.saudacao);
		System.out.println(pessoa1.nome +": " + pessoa1.apresentacao + pessoa1.nome);
		System.out.println("engajado na conversa, o outro responde:");
		System.out.println(pessoa2.nome +": " + pessoa2.apresentacao + pessoa2.nome);
		System.out.println(pessoa1.nome +": " + pessoa1.sentimento);
		System.out.println(pessoa2.nome +": " + pessoa2.sentimento);
	}

}
