import java.awt.*;

@SuppressWarnings("serial")
public class InterfaceGrafica extends Frame {
	private Button butAddAutomovel, butAddPeca;
	private Label lblChoiceCor, lblChoiceModelo;
	private Choice choiceCor, choiceModelo;
	private Label lblChoiceEstado, lblChoiceTipo;
	private Choice choiceEstado, choiceTipo;
	private Label lblAutomovel, lblPeca;
	
	public InterfaceGrafica(Concessionaria con) {
		super("Concessionaria Supimpa");
		
		// Criando interface automovel
		lblAutomovel = new Label("Adicionar automovel");
		lblChoiceCor = new Label("Selecione a cor");
		choiceCor = new Choice();
		for (CorAutomovel cor : CorAutomovel.values()) {
			choiceCor.add(cor.toString());
		}
		lblChoiceModelo = new Label("Selecione o modelo");
		choiceModelo = new Choice();
		for (ModeloAutomovel modelo : ModeloAutomovel.values()) {
			choiceModelo.add(modelo.toString());
		}
		butAddAutomovel = new Button("Adicionar");
		
		// Criando interface peça
		lblPeca = new Label("Adicionar peça");
		lblChoiceEstado = new Label("Selecione a peça");
		choiceEstado = new Choice();
		for (EstadoPeca cor : EstadoPeca.values()) {
			choiceEstado.add(cor.toString());
		}
		lblChoiceTipo = new Label("Selecione o tipo");
		choiceTipo = new Choice();
		for (TipoPeca modelo : TipoPeca.values()) {
			choiceTipo.add(modelo.toString());
		}
		butAddPeca = new Button("Adicionar");
		
		setLayout (new GridLayout(6, 2));
		add(lblAutomovel);
		add(lblPeca);
		add(lblChoiceCor);
		add(choiceCor);
		add(lblChoiceTipo);
		add(choiceTipo);
		add(lblChoiceModelo);
		add(choiceModelo);
		add(lblChoiceEstado);
		add(choiceEstado);
		add(butAddAutomovel);
		add(butAddPeca);
		
		pack();
	}
	
}
