import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Produto extends JFrame implements ActionListener{
	private JLabel lblProduto, lblCodigo, lblQuantidade, lblPreco, lblDescricao, lblVazio;
	private JTextField txtProduto, txtCodigo, txtQuantidade, txtPreco, txtDescricao;
	private JButton btnSalvar;
	private JPanel painel;
	
	public Produto(String titulo) {
		super(titulo);
		lblProduto = new JLabel("Produto: ");
		lblCodigo = new JLabel("Código: ");
		lblQuantidade = new JLabel("Quantidade: ");
		lblPreco = new JLabel("Preço: ");
		lblDescricao = new JLabel("Descrição: ");
		lblVazio = new JLabel(" ");
		txtProduto = new JTextField(20);
		txtCodigo = new JTextField(20);
		txtQuantidade = new JTextField(20);
		txtPreco = new JTextField(20);
		txtDescricao = new JTextField(40);
		btnSalvar = new JButton("Salvar cadastro");
		btnSalvar.addActionListener(this);
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(6,2));
		painel.add(lblProduto);
		painel.add(txtProduto);
		painel.add(lblCodigo);
		painel.add(txtCodigo);
		painel.add(lblDescricao);
		painel.add(txtDescricao);
		painel.add(lblQuantidade);
		painel.add(txtQuantidade);
		painel.add(lblPreco);
		painel.add(txtPreco);
		painel.add(lblVazio);
		painel.add(btnSalvar);
		
		this.getContentPane().add(painel);;
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnSalvar) {
			Estoque estoque = new Estoque();
			estoque.setNome(txtProduto.getText());
			estoque.setCodigo(Integer.parseInt(txtCodigo.getText()));
			estoque.setDescricao(txtDescricao.getText());
			estoque.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
			estoque.setPreco(Double.parseDouble(txtPreco.getText()));
			estoque.Gravar();
			JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
			txtProduto.setText(null);
			txtCodigo.setText(null);
			txtDescricao.setText(null);
			txtQuantidade.setText(null);
			txtPreco.setText(null);
			
		}
	}
}
