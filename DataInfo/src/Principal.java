import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Principal extends JFrame implements MenuListener, ActionListener{
	private JMenuBar barraMenu;
	private JMenu abaCadastro, abaSobre;
	private JMenuItem itemCadastrar, itemExibir, itemExcluir, itemSair;
	
	public Principal(String titulo) {
		super(titulo);
		this.setBounds(100, 100, 456, 112);
		iniciar();
	}
	
	public void iniciar() {
		barraMenu = new JMenuBar();
		abaCadastro = new JMenu("Inicio");
		abaSobre = new JMenu("Sobre");
		itemCadastrar = new JMenuItem("Novo cadastro");
		itemExibir = new JMenuItem("buscar produto cadastrado");
		itemExcluir = new JMenuItem("Excluir cadastro existente");
		itemSair = new JMenuItem("Sair");
		
		abaCadastro.addMenuListener(this);
		abaSobre.addMenuListener(this);
		itemCadastrar.addActionListener(this);
		itemExibir.addActionListener(this);
		itemExcluir.addActionListener(this);
		itemSair.addActionListener(this);
		
		barraMenu.add(abaCadastro);
		barraMenu.add(abaSobre);
		
		abaCadastro.add(itemCadastrar);
		abaCadastro.add(itemExibir);
		abaCadastro.add(itemExcluir);
		abaCadastro.add(itemSair);
		
		this.setJMenuBar(barraMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Principal ("Tela inicial");
		new Estoque();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == itemCadastrar) {
			new Produto("Cadastrar produto");
		}
		if(e.getSource() == itemExibir) {
			Estoque busca = new Estoque();
			busca.Exibir();
			
		}
		
		else if(e.getSource() == itemSair) {
			System.exit(0);
		}
		
	}

	@Override
	public void menuCanceled(MenuEvent arg0) {
		
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuSelected(MenuEvent e) {
		if (e.getSource() == abaSobre) {
			JOptionPane.showMessageDialog(this, "####################\n" + "Desenvolvedor: Flávio \n" + "####################\n");
			
		}
		
	}

}
