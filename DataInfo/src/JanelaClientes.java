import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import menus.Menu;
import menus.Principal;

public class JanelaClientes extends JFrame implements MenuListener, ActionListener{

	private JMenuBar barraMenu;
	private JMenu menuCliente, menuFuncionario, menuSair;
	private JMenuItem menuApagar, menuCadastro, menuCadastrafunc, menuDemitefunc;
	private Principal pcliente = null;

	
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
	//atribuição de itens
		menuCliente.add(menuCadastro);
		menuCliente.add(menuApagar);
		menuFuncionario.add(menuCadastrafunc);
		menuFuncionario.add(menuDemitefunc);
		
		this.setJMenuBar(barraMenu);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

}	
	
	public static void main(String[] args){
	
	new JanelaClientes ("Menu da aplicação").setVisible(true);
	
}	
@Override
public void actionPerformed (ActionEvent e){
	
	if (e.getSource()== menuCadastro){
		if (pcliente == null){
			pcliente = new Pessoa (this, "Menu", true);
		}	
	}
	else if (e.getSource()== menuSair){
		System.exit(0);
	}
}
@Override
public void menuCanceled(MenuEvent e){
}
@Override
public void menuDeselected (MenuEvent e){
	if (e.getSource()== menuCadastro){
		System.out.println("Menu cadastro desselecionado");
	}
	else if (e.getSource()== menuSobre);
		System.out.println("Menu sobre desselecionado");
	}

@Override
public void menuSelected(MenuEvent e){
	
	if (e.getSource()== menuCadastro){
	System.out.println("Menu cadastro acionado");
}
else if (e.getSource()== menuSobre){
	System.out.println("Menu sobre selecionado");
	JOptionPane.showMessageDialog(this, "Créditos do Java");
}
		
}
}





