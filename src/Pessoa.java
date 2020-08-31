
public class Pessoa {
	public String status;
	public String statusExtenso;
	public String apresentacao;
	public String saudacao;
	public String sentimento;
	public String nome;

	public void InicializaPessoa() {
		if(status.equals("1")) {
			statusExtenso = "Feliz";
			apresentacao = Apresentacao.Feliz();
			saudacao = Saudacoes.Feliz();
			sentimento = Sentimento.Feliz();
		}else if(status.equals("2")) {
			statusExtenso = "Triste";
			apresentacao = Apresentacao.Triste();
			saudacao = Saudacoes.Triste();
			sentimento = Sentimento.Triste();
		}else if(status.equals("3")) {
			statusExtenso = "Mano";
			apresentacao = Apresentacao.Mano();
			saudacao = Saudacoes.Mano();
			sentimento = Sentimento.Mano();
		}else if(status.equals("4")) {
			statusExtenso = "Esperançoso";
			apresentacao = Apresentacao.Esperanca();
			saudacao = Saudacoes.Esperanca();
			sentimento = Sentimento.Esperanca();
		}else {
			statusExtenso = "Puto";
			apresentacao = Apresentacao.Puto();
			saudacao = Saudacoes.Puto();
			sentimento = Sentimento.Puto();
		}
	}
	
}
