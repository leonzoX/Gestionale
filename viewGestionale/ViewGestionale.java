package viewGestionale;
import controllerGestionale.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.awt.*;

public class ViewGestionale extends JFrame implements ActionListener{
	private JPanel listaClienti;
    AutoCompleteDecorator decorator;
    JTextField txtField;

	public ViewGestionale(String title,int width,int height){
        super(title);
        setLayout(new GridBagLayout());

        txtField = new JTextField();

        GridBagConstraints c = new GridBagConstraints();

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


        c.insets = new Insets(0,0,20,0);
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(b1,c);

        
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtField,c);

        
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;

        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(b3,c);

       


        
        c.weighty = 0.95;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 1;
        c.ipady = 40;
        c.ipadx = 100;
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = 3;
        c.anchor = GridBagConstraints.LINE_START;



        this.add(b6,c);

 		
 		

        
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