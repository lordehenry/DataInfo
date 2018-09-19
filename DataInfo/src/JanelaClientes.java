import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class JanelaClientes extends JFrame implements MenuListener, ActionListener{

	private JMenuBar barraMenu;
	private JMenu menuCliente, menuFuncionario, menuSair;
	private JMenuItem menuApagar, menuCadastro, menuCadastrafunc, menuDemitefunc;
	private Pessoa pcliente = null;

	
	public JanelaClientes (String titulo){
		
		super(titulo);
		this.setBounds(100, 100, 456, 112);
		iniciar();
}
	public void iniciar(){
		barraMenu = new JMenuBar();
		menuCliente = new JMenu("Cliente");
		menuCadastro = new JMenuItem("Cadastrar cliente");
		menuApagar = new JMenuItem("Remover cliente");
		
		menuFuncionario = new JMenu("Funcionario");
		menuCadastrafunc = new JMenuItem("Cadastrar funcionario");
		menuDemitefunc = new JMenuItem("Demitir funcionario");
		
		menuSair = new JMenu("Sair");
		
		
	//Menus Cliente
		menuCliente.addMenuListener(this);	
		menuCliente.addActionListener(this);
		menuCliente.addActionListener(this);
	//Menus Funcionario
		menuFuncionario.addMenuListener(this);
		menuFuncionario.addActionListener(this);
		menuFuncionario.addActionListener(this);
	//atribuicao de itens
		menuCliente.add(menuCadastro);
		menuCliente.add(menuApagar);
		menuFuncionario.add(menuCadastrafunc);
		menuFuncionario.add(menuDemitefunc);
		
		this.setJMenuBar(barraMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		menuFuncionario.add(menuCadastrafunc);
		menuFuncionario.add(menuDemitefunc);
		menuCadastro.add(menuCadastro);
		menuCadastro.add(menuApagar);
		menuCliente.add( menuCliente );
		menuCadastro.add(menuCadastro);
		
}	
	
	public static void main(String[] args){
	
	new JanelaClientes ("Menu da aplicacao").setVisible(true);
	
}	
@Override
public void actionPerformed (ActionEvent e){
	
	if (e.getSource()== menuCadastro){
		if (pcliente == null){
			pcliente = new Pessoa ();
		}	
	}
	else if (e.getSource()== menuSair){
		System.exit(0);
	}
		
	}
@Override
public void menuCanceled(MenuEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void menuDeselected(MenuEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void menuSelected(MenuEvent arg0) {
	// TODO Auto-generated method stub
	
}
}




