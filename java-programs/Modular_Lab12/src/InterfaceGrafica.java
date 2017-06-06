import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class InterfaceGrafica extends JFrame {
	private JPanel panelAutomovel, panelPeca, panelNotaFiscal;
	private JTabbedPane tabs; 
	private JButton butAddAutomovel, butAddPeca, butNotaFiscal;
	private Choice choiceCor, choiceModelo;
	private Choice choiceEstado, choiceTipo;
	private JTextField fieldAno;
	
	public InterfaceGrafica(Concessionaria con) {
		super("Concessionaria Supimpa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tabs = new JTabbedPane();
		tabs.setPreferredSize(new Dimension(300, 300));
		
		// Criando interface automovel
		panelAutomovel = new JPanel();
		panelAutomovel.setLayout(new BorderLayout());
		JLabel lblAutomovel = new JLabel("Adicionar automovel");
		
		JPanel dadosAutomovel = new JPanel();
		dadosAutomovel.setLayout(new GridLayout(3, 3));
		JLabel lblChoiceCor = new JLabel("Selecione a cor:");
		choiceCor = new Choice();
		for (CorAutomovel cor : CorAutomovel.values()) {
			choiceCor.add(cor.toString());
		}
		JLabel lblChoiceModelo = new JLabel("Selecione o modelo:");
		choiceModelo = new Choice();
		for (ModeloAutomovel modelo : ModeloAutomovel.values()) {
			choiceModelo.add(modelo.toString());
		}
		JLabel lblAno = new JLabel("Ano:");
		fieldAno = new JTextField();
		butAddAutomovel = new JButton("Adicionar");
		
		// Adicionando componentes do painel de dados do automovel
		dadosAutomovel.add(lblChoiceCor);
		dadosAutomovel.add(choiceCor);
		dadosAutomovel.add(lblChoiceModelo);
		dadosAutomovel.add(choiceModelo);
		dadosAutomovel.add(lblAno);
		dadosAutomovel.add(fieldAno);
		
		panelAutomovel.add(lblAutomovel, BorderLayout.NORTH);
		panelAutomovel.add(dadosAutomovel, BorderLayout.CENTER);
		panelAutomovel.add(butAddAutomovel, BorderLayout.SOUTH);
		
		// Criando interface peça
		panelPeca = new JPanel();
		panelPeca.setLayout(new BorderLayout());
		
		JPanel dadosPeca = new JPanel();
		dadosPeca.setLayout(new GridLayout(2, 2));
		JLabel lblPeca = new JLabel("Adicionar peça");
		JLabel lblChoiceEstado = new JLabel("Selecione a peça:");
		choiceEstado = new Choice();
		for (EstadoPeca cor : EstadoPeca.values()) {
			choiceEstado.add(cor.toString());
		}
		JLabel lblChoiceTipo = new JLabel("Selecione o tipo:");
		choiceTipo = new Choice();
		for (TipoPeca modelo : TipoPeca.values()) {
			choiceTipo.add(modelo.toString());
		}
		butAddPeca = new JButton("Adicionar");
		
		// Adicionando componentes do painel de dados da peça
		dadosPeca.add(lblChoiceEstado);
		dadosPeca.add(choiceEstado);
		dadosPeca.add(lblChoiceTipo);
		dadosPeca.add(choiceTipo);
		
		panelPeca.add(lblPeca, BorderLayout.NORTH);
		panelPeca.add(dadosPeca, BorderLayout.CENTER);
		panelPeca.add(butAddPeca, BorderLayout.SOUTH);
		
		// Criando interfaco nota fiscal
		panelNotaFiscal = new JPanel();
		panelNotaFiscal.setLayout(new BorderLayout());
		
		JLabel lblNotaFiscal = new JLabel("Clique para emitir a nota fiscal");
		butNotaFiscal = new JButton("Emitir Nota Fiscal");
		panelNotaFiscal.add(lblNotaFiscal, BorderLayout.NORTH);
		panelNotaFiscal.add(butNotaFiscal, BorderLayout.CENTER);
		
		// Adicionando listeners
		butAddAutomovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CorAutomovel cor = CorAutomovel.valueOf(choiceCor.getSelectedItem());
					ModeloAutomovel modelo = ModeloAutomovel.valueOf(choiceModelo.getSelectedItem());
					int ano = Integer.parseInt(fieldAno.getText());
					con.adicionaAutomovel(new Automovel(cor, modelo, ano));
					JOptionPane.showMessageDialog(null, "Automovel adicionado com sucesso!");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao inserir carro. Confira os dados e tente novamente.");
				}
			}
		});
		
		butAddPeca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					EstadoPeca estado = EstadoPeca.valueOf(choiceEstado.getSelectedItem());
					TipoPeca tipo = TipoPeca.valueOf(choiceTipo.getSelectedItem());
					con.adicionaPeca(new Peca(estado, tipo));
					JOptionPane.showMessageDialog(null, "Peça adicionada com sucesso!");
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro ao inserir peça. Confira os dados e tente novamente.");
				}
			}
		});
		
		butNotaFiscal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, con.getNotaFiscal());
			}
		});

		tabs.add(panelAutomovel, "Automoveis");
		tabs.add(panelPeca, "Peças");
		tabs.add(panelNotaFiscal, "Nota Fiscal");
		
		getContentPane().add(tabs, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
	}
	
}
