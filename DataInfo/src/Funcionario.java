import java.util.ArrayList;
import java.util.List;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Funcionario extends JFrame {
	
	
	private double salario;
	private static List<Funcionario>minhaLista = new ArrayList<Funcionario>();
	private static String titulo;


	//public void cadastraFunc(){
	public Funcionario(String titulo) {
		super(titulo);
		JTextField campoNome;
		JTextField campoDDD;
		JTextField campoTelefone;
		JTextField campoEmail;
		JTextField campoEndereco;
		JTextField campoNumero;
		JTextField campoComplemento;
		JTextField campoBairro;
		JTextField campoCidade;
		JTextField campoEstado;
		JTextField campoCep;
		JTextField campoCPF;
		JTextField campoRG;
	    JTextField campoNascimento;
	    JLabel nome;
	    JLabel ddd;
	    JLabel telefone;
	    JLabel email;
	    JLabel endereco;
	    JLabel numero;
	    JLabel complemento;
	    JLabel bairro;
	    JLabel cidade;
	    JLabel estado;
	    JLabel cep;
	    JLabel cpf;
	    JLabel rg;
	    JLabel nascimento;

			campoNome = new JTextField();
			campoDDD = new JTextField();
			campoTelefone = new JTextField();
			campoEmail = new JTextField();
			campoEndereco = new JTextField();
			campoNumero = new JTextField();
			campoComplemento = new JTextField();
			campoBairro = new JTextField();
			campoCidade = new JTextField();
			campoEstado = new JTextField();
			campoCep = new JTextField();
			campoCPF = new JTextField();
			campoRG = new JTextField();
			campoNascimento = new JTextField();
			nome = new JLabel("Nome:");
			ddd = new JLabel("DDD:");
			telefone = new JLabel("Telefone:");
			email = new JLabel("E-mail:");
			endereco = new JLabel("Endereço:");
			numero = new JLabel("Nº:");
			complemento = new JLabel("Complemento:");
			bairro = new JLabel("Bairro:");
			cidade = new JLabel("Cidade:");
			estado = new JLabel("Estado:");
			cep = new JLabel("Cep:");
			cpf = new JLabel("CPF:");
			rg = new JLabel("RG:");
			nascimento = new JLabel("Nacimento: dd/mm/aa");
			
			JPanel panel = new JPanel();
			panel.setLayout(new GridLayout(14, 2));
			panel.add(nome);
			panel.add(campoNome);
			panel.add(email);
			panel.add(campoEmail);
			panel.add(ddd);
			panel.add(campoDDD);
			panel.add(telefone);
			panel.add(campoTelefone);
			panel.add(endereco);
			panel.add(campoEndereco);
			panel.add(numero);
			panel.add(campoNumero);
			panel.add(complemento);
			panel.add(campoComplemento);
			panel.add(bairro);
			panel.add(campoBairro);
			
			panel.add(cep);
			panel.add(campoCep);
			panel.add(cidade);
			panel.add(campoCidade);
			panel.add(estado);
			panel.add(campoEstado);
			panel.add(rg);
			panel.add(campoRG);
			panel.add(cpf);
			panel.add(campoCPF);
			panel.add(nascimento);
			panel.add(campoNascimento);
			
			this.getContentPane().add(panel);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
			this.setLocation(150, 150);
}

		
	public double getSalario() {
		return salario;
}
	public void setSalario(double salario) {
		this.salario = salario;
}
	
	
}
