import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Estoque extends JFrame implements ActionListener{
	private String nome; 
	private String descricao;
	private int quantidade;
	private int codigo;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	private JButton btnPesquisar;
	private JLabel lblPesquisar;
	private JTextField txtPesquisar;
	private JPanel painel;
	
	public void Gravar() {
		try {
		    PrintWriter gravarArquivo = new PrintWriter(new BufferedWriter(new FileWriter("ProdutoEstoque.txt", true)));
		    gravarArquivo.print(Integer.toString(codigo) + " | ");
		    gravarArquivo.print(nome + " | ");
		    gravarArquivo.print(descricao + " | ");
		    gravarArquivo.print(Integer.toString(quantidade) + " | ");
		    gravarArquivo.print(Double.toString(preco) + " | \n");
		    gravarArquivo.close();
	        }  
		catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "ERRO NO BANCO DE DADOS: " + erro);
		}
	}
	public void Exibir() {
		lblPesquisar = new JLabel("Insira o nome do produto");
		txtPesquisar = new JTextField(40);
		btnPesquisar = new JButton("Pesquisar");
		painel = new JPanel();
		btnPesquisar.addActionListener( this);
		
		painel.setLayout(new FlowLayout());
		painel.add(lblPesquisar);
		painel.add(txtPesquisar);
		painel.add(btnPesquisar);
		
		this.getContentPane().add(painel);;
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
