package viewGestionale;
import controllerGestionale.*;
import modelGestionale.ModelCliente;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class ViewGestionale extends JFrame implements ActionListener{
	private JList listaClienti;


    private PlaceholderTextField txtField;
    private ArrayList<String> nomiClienti;
    private ControllerGestionale gestionale;

	public ViewGestionale(String title,int width,int height){
        super(title);
        setLayout(new GridBagLayout());


        gestionale = new ControllerGestionale();


        nomiClienti= gestionale.getStringClienti();

        txtField = new PlaceholderTextField();
        txtField.setColumns(20);
        txtField.setPlaceholder("Ricerca clienti");
        final Font f = txtField.getFont();
        txtField.setFont(new Font(f.getName(), f.getStyle(), 20));

        listaClienti = new JList(gestionale.getStringClienti().toArray());
        listaClienti.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaClienti.setLayoutOrientation(JList.VERTICAL_WRAP);
        listaClienti.setVisibleRowCount(-1);
        JScrollPane listScroller = new JScrollPane(listaClienti);
        //listScroller.setPreferredSize(new Dimension(250, 80));

        GridBagConstraints c = new GridBagConstraints();

        AutoSuggestor autoSuggestor = new AutoSuggestor(txtField, this, nomiClienti, Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) ;


        JButton b1 = new JButton("bottone 1");
        JButton b2 = new JButton("bottone 2");
        JButton b3 = new JButton("bottone 3");
        JButton b4 = new JButton("bottone 4");
        JButton b5 = new JButton("bottone 5");
        JButton b6 = new JButton("bottone 6");
        JButton b7 = new JButton("bottone 7");
        JButton b8 = new JButton("bottone 8");
        JButton b9 = new JButton("bottone 9");
        JButton b10 = new JButton("bottone 10");




        
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        c.ipady = 20;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtField,c);

        
       
       


        
        c.weighty = 0.95;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 40;
        c.ipadx = 100;
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 2;
        c.anchor = GridBagConstraints.LINE_START;



        this.add(listaClienti,c);

 		
 		

        
         c.insets = new Insets(20,0,20,0);

        c.gridwidth = 1;
        c.weighty = 0;
        c.weightx = 0.98;
        c.gridx = 0;
        c.gridy = 2;
        c.ipady = 40;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.LAST_LINE_START;

        this.add(b8,c);

        
        c.weightx = 0.001;
        c.gridx = 1;
        c.gridy = 2;
        
        
        c.anchor = GridBagConstraints.PAGE_END;
        c.fill = GridBagConstraints.HORIZONTAL;

        this.add(b9,c);

       
       
        c.weightx = 0.98;
        c.gridx = 2;
        c.gridy = 2;
       
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.LAST_LINE_END;

        this.add(b10,c);


        

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
      
    }
}