package db;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class DB extends Frame {
    
    private static final long serialVersionUID = 1L;

	// VORSICHT!
	private static final String USER = "abl128"; // hier kommt Ihr Account hin
	private static final String PW = ""; // hier kommt Ihr PW hin (oder Sie fragen dieses
										 // �ber die Tastatur ab
	// VORSICHT!
	
	Panel knoepfe = new Panel(new GridLayout(1, 4));
	Button 	erst = new Button("Erste Zeile"), 
			prev = new Button("Vorherige Zeile"),
			next = new Button("N�chste Zeile"), 
			last = new Button("Letzte Zeile");
	TextField aus = new TextField();
	Connection c; Statement s; ResultSet r;
	  
	public DB() {
	    setLayout(new BorderLayout());
	    add(knoepfe, "North");
	    knoepfe.add(erst); knoepfe.add(prev); knoepfe.add(next); knoepfe.add(last);
	    add(aus, "Center");
	    setSize(400, 250);
	    setVisible(true);
	    erst.addActionListener(new ActionListener() {       // Erste Zeile
	    	public void actionPerformed(ActionEvent e) {
	        erster();}});
	    prev.addActionListener(new ActionListener() {       // Eine Zeile zur�ck
	      public void actionPerformed(ActionEvent e) {
	        vorheriger(); }});
	    next.addActionListener(new ActionListener() {       // Eine Zeile weiter
	      public void actionPerformed(ActionEvent e) {
	        naechster(); }});
	    last.addActionListener(new ActionListener() {       // Letzte Zeile
	      public void actionPerformed(ActionEvent e) {
	        letzter(); }});
	    addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	        System.exit(0); }} );
	    try {
	      Class.forName("oracle.jdbc.driver.OracleDriver"); 
	      String url = "jdbc:oracle:thin:@oracle.informatik.haw-hamburg.de:1521:inf09";
	      c = DriverManager.getConnection(url, USER, PW);
	      s =  c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	      // normalerweise kann ein ResultSet nur sequentiell von vorn nach hinten ausgewertet
	      // werden (TYPE_FORWARD_ONLY) - hier: Scrollable Cursor
	      r = s.executeQuery("select * from Merlin.BIRDS_DE");
	      erster();
	    }
	    catch (ClassNotFoundException e) 
	    	{e.printStackTrace();}
    	catch (SQLException e)
    		{e.printStackTrace();}
	  }
	  void erster() { try {r.first(); zeige();} catch (Exception ex) {} }
	  void vorheriger() { try {r.previous(); zeige();} catch (Exception ex) {} }
	  void naechster() { try {r.next(); zeige();} catch (Exception ex) {} }
	  void letzter() { try {r.last(); zeige();} catch (Exception ex) {} }
	  void zeige() throws Exception {
	    aus.setText(r.getString("DE_ID") + ", " + r.getString("DE_DEUTSCH") + ",  " +
	    r.getString("DE_ENGLISCH") + ", " + r.getString("DE_LATEIN"));
	  }
	public static void main(String[] args) throws Exception {
	    new DB();
	}
}
