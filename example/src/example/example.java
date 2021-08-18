package example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.DefaultListModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.*;
import java.util.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import java.util.Timer;
import java.util.TimerTask;


interface Food 
{
	int getCost();
	int getType();
	String getDescription();
	void setCost(int cost);
	void setDescription(String Description);
	void setName(String Name);
	String getName();
	void setGramOfMeet(int g);
	int getGramOfMeet();
	void setLiters(int l);
	int getLiters();
}


class Veg implements Food
{
	String name;
	String Description;
	int cost;
	Veg()
	{
		
	}
	Veg(String name,String Description,int cost)
	{
		this.name=name;
		this.Description=Description;
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
	public int getType()
	{
		return 1;
	}
	public String getDescription()
	{
		return Description;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public void setDescription(String Description)
	{
		this.Description=Description;
	}
	public void setName(String Name)
	{
		this.name=Name;
	}
	public String getName()
	{
		return name;
	}
	public void setGramOfMeet(int g)
	{
		//throw exception
	}
	public int getGramOfMeet()
	{
		//throw exception
		return 0;
	}
	public void setLiters(int l)
	{
		//throw exception
	}
	public int getLiters()
	{
		//throw exception
		return 0;
	}
	
}



class NonVeg implements Food
{
	String name;
	String Description;
	int costOfMeetPerGram;
	int gramOfMeet;
	NonVeg()
	{
	
	}
	NonVeg(String name,String Description,int cost,int gramOfMeet)
	{
		this.name=name;
		this.Description=Description;
		this.costOfMeetPerGram=cost;
		this.gramOfMeet=gramOfMeet;
	}
	public int getCost()
	{
		return costOfMeetPerGram*gramOfMeet;
	}
	public String getDescription()
	{
		return Description;
	}
	public int getType()
	{
		return 2;
	}
	public void setCost(int cost)
	{
		this.costOfMeetPerGram=cost;
	}
	public void setDescription(String Description)
	{
		this.Description=Description;
	}
	public void setName(String Name)
	{
		this.name=Name;
	}
	public String getName()
	{
		return name;
	}
	public void setGramOfMeet(int g)
	{
		this.gramOfMeet=g;
	}
	public int getGramOfMeet()
	{
		return this.gramOfMeet;
	}
	public void setLiters(int l)
	{
		//throw exception
	}
	public int getLiters()
	{
		//throw exception
		return 0;
	}
}


class Drinks implements Food
{
	
	String name;
	String Description;
	int costPerLitre;
	int Liters;
	Drinks()
	{
		
	}
	Drinks(String name,String Description,int cost,int Liters)
	{
		this.name=name;
		this.Description=Description;
		this.costPerLitre=cost;
		this.Liters=Liters;
	}
	public int getCost()
	{
		return costPerLitre*Liters;
	}
	public int getType()
	{
		return 3;
	}
	public String getDescription()
	{
		return Description;
	}
	public void setCost(int cost)
	{
		this.costPerLitre=cost;
	}
	public void setDescription(String Description)
	{
		this.Description=Description;
	}
	public void setName(String Name)
	{
		this.name=Name;
	}
	public String getName()
	{
		return name;
	}
	public void setGramOfMeet(int g)
	{
		//throw exception
	}
	public int getGramOfMeet()
	{
		//throw exception
		return 0;
	}
	public void setLiters(int l)
	{
		this.Liters=l;
	}
	public int getLiters()
	{
		return this.Liters;
	}
	
	
}

class Hotel
{
	String name;
	ArrayList<Food> foodItems;
	DefaultListModel foodItemNames;
	String securityCode;
	Hotel()
	{
		foodItems=new ArrayList<Food>();
		foodItemNames= new DefaultListModel();
	}
	Hotel(String name)
	{
		foodItems=new ArrayList<Food>();
		this.name=name;
		foodItemNames= new DefaultListModel();
	}
	Hotel(String name,String securityCode)
	{
		foodItems=new ArrayList<Food>();
		this.name=name;
		this.securityCode=securityCode;
		foodItemNames= new DefaultListModel();
	}
	void addFoodItem(Food item)
	{
		foodItems.add(item);
		if(item.getType()==1)
			foodItemNames.addElement("Name: "+item.getName()+"  Catagory:Veg    Cost: "+item.getCost()+"  Description:"+item.getDescription());
		else if(item.getType()==2)
			foodItemNames.addElement("Name: "+item.getName()+"  Catagory:Non-Veg    quantity: "+item.getGramOfMeet()+"   Cost:"+item.getCost()+"  Description:"+item.getDescription());
		else 
			foodItemNames.addElement("Name: "+item.getName()+"  Catagory:Drinks    quantity: "+item.getLiters()+"   Cost:"+item.getCost()+"  Description:"+item.getDescription());
	}
	
	

	void removeItem(int i)
	{
		foodItems.remove(i);
		foodItemNames.remove(i);
	}
	
}



class DeleveryEmployee
{
	String Id;
	String name;
	int salary;
	int day;
	int month;
	int year;
	boolean isFree;
	DeleveryEmployee()
	{
		isFree=true;
	}
	DeleveryEmployee(String Id,String name,int salary,int day,int month,int year)
	{
		this.Id=Id;
		this.name=name;
		this.salary=salary;
		this.day=day;
		this.month=month;
		this.year=year;
		isFree=true;
	}
}



class Customer
{
	String name;
	String userName;
	String password;
	int day;
	int month;
	int year;
	String Gender;
	String address;
	DefaultListModel ORDERS;
	
	Customer(String name,String userName,String password,int day,int month,int year,String Gender,String address)
	{
		this.name=name;
		this.userName=userName;
		this.password=password;
		this.day=day;
		this.month=month;
		this.year=year;
		this.Gender=Gender;
		this.address=address;
		ORDERS = new DefaultListModel();
	}
}
		
class RemindTask extends TimerTask
{
	Order order;
	
	RemindTask(Order order)
	{
		this.order=order;
		
	}
	public void run()
	{
		String del="has been delevired";
		String str;
		int j=0;
		int i=0;
		for(i=0;i<order.customer.ORDERS.getSize();i++)
		{
			str=order.customer.ORDERS.get(i).toString();
			
			j=9;
			while(true)
			{
				if(str.charAt(j)==' ')
					break;
				j++;
			}
			
			if(str.substring(9, j).equals(order.orderID))
				break;
		}
		
		
		StringBuilder s;
		s=new StringBuilder(order.customer.ORDERS.get(i).toString());
		for(int k=0;k<18;k++)
			s.setCharAt(s.length()-1-k,del.charAt(17-k) );
		order.customer.ORDERS.remove(i);
		order.customer.ORDERS.addElement(s);
		
		order.hasBeenDeleveired=true;
		order.deleveryPerson.isFree=true;
		order.timer.cancel();
		
		
	}
}



class Order
{
	String orderID;
	DeleveryEmployee deleveryPerson;
	Customer customer;
	Hotel fromHotel;
	ArrayList<Food> foodItems;
	Timer timer;
	Boolean hasBeenDeleveired;
	Order(	String orderID,DeleveryEmployee deleveryPerson,Customer customer,Hotel fromHotel,ArrayList<Food> foodItems)
	{
		this.orderID=orderID;
		this.deleveryPerson=deleveryPerson;
		this.customer=customer;
		this.fromHotel=fromHotel;
		this.foodItems=new ArrayList<Food>();
		this.foodItems.addAll(foodItems);
		this.hasBeenDeleveired=false;
		timer=new Timer();
		timer.schedule(new RemindTask(this), 60*1000);
	}
	
	
}


class Admin
{
	String name;
	String userName;
	String password;
	Hotel ownedHotel;
	int day;
	int year;
	int month;
	Admin(String name,String userName,String password,Hotel ownedHotel,int day,int month,int year)
	{
		this.name=name;
		this.userName=userName;
		this.password=password;
		this.ownedHotel=ownedHotel;
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	void setOwnedHotel(Hotel ownedHotel)
	{
		this.ownedHotel=ownedHotel;
	}
	
	
	
}


class DataManagment
{
	static DataManagment instance;
	ArrayList<Hotel> hotels;
	ArrayList<Customer> customers;
	ArrayList<Admin> admins;
	ArrayList<DeleveryEmployee> deleveryEmployees;
	ArrayList<Order> orders;
	static
	{
		instance=null;
	}
	private DataManagment()
	{
		hotels=new ArrayList<Hotel>();
		customers=new ArrayList<Customer>();
		admins=new ArrayList<Admin>();
		deleveryEmployees=new ArrayList<DeleveryEmployee>();
		orders=new ArrayList<Order>();
		
	}
	static void getInstance()
	{
		if(instance==null)
			instance=new DataManagment();
	}
}





public class example extends JFrame {

	
	
	private DataManagment data;
	
	private JPanel adminSignInOrCreate;
	private JPanel customerSignInOrCreate;
	private JPanel openingWindow;
	private JPanel appManagment;
	private JPanel customerSelectHotel;
	private JPanel customerOrder;
	private JPanel adminHotelManagment;
	private JPanel appManagmentPass;
	private JPanel orderTrack;
	private String appDevPass="123456789";
	
	
	private JPasswordField c8passwordField;
	
	
	private JTextField c7textField;
	private JPasswordField c7passwordField;
	
	
	
	private JTextField c6textField;
	private JTextField c6textField_2;
	private JTextField c6textField_3;
	
	
	
	private JTextField c5textField;
	
	
	
	private JTextField c3textField;
	private JPasswordField c3passwordField;
	private JPasswordField c3passwordField_1;
	private JTextField c3textField_1;
	private JTextField c3textField_2;
	private JPasswordField c3passwordField_2;
	private JPasswordField c3passwordField_3;
	
	
	
	private JTextField c2textField;
	private JPasswordField c2passwordField;
	private JTextField c2textField_1;
	private JPasswordField c2passwordField_1;
	private JTextField c2textField_2;
	
	
	private int customerLogInAccount;
	private int adminLogInAccount;
	private int selectedhotel;
	private JTextField c7textField_1;
	private JTextField c7textField_2;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					example frame = new example();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public example() {
		
		customerLogInAccount=-1;
		selectedhotel=-1;
		adminLogInAccount=-1;
		DataManagment.getInstance();
		data=DataManagment.instance;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
		
		
		openingWindow = new JPanel();
		openingWindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		openingWindow.setPreferredSize(new Dimension(800,600));
		setContentPane(openingWindow);
		pack();
		openingWindow.setLayout(null);
		
		JLabel lblNewLabe = new JLabel("WELCOME ONLINE FOOD ORDERING");
		lblNewLabe.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabe.setBounds(233, 51, 304, 42);
		openingWindow.add(lblNewLabe);
		
		JButton btnNewButto = new JButton("APP MANAGMENT");
		btnNewButto.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButto.setBounds(284, 149, 178, 42);
		openingWindow.add(btnNewButto);
		
		JButton btnNewButto_1 = new JButton("HOTEL MANAGER");
		btnNewButto_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButto_1.setBounds(303, 202, 141, 42);
		openingWindow.add(btnNewButto_1);
		
		JButton btnNewButto_2 = new JButton("CUSTOMER");
		btnNewButto_2.setForeground(Color.BLACK);
		btnNewButto_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButto_2.setBounds(303, 269, 141, 42);
		openingWindow.add(btnNewButto_2);
		
		JLabel lblNewLabe_1 = new JLabel("SELECT WHAT YOU ARE");
		lblNewLabe_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabe_1.setBounds(300, 114, 162, 24);
		openingWindow.add(lblNewLabe_1);
		
		
		
		
		
		
		customerSignInOrCreate = new JPanel();
		customerSignInOrCreate.setBorder(new EmptyBorder(5, 5, 5, 5));
		customerSignInOrCreate.setPreferredSize(new Dimension(800,600));
		customerSignInOrCreate.setLayout(null);
		
		JLabel c2lblNewLabel = new JLabel("SING IN");
		c2lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		c2lblNewLabel.setBounds(109, 55, 60, 23);
		customerSignInOrCreate.add(c2lblNewLabel);
		
		c2textField = new JTextField();
		c2textField.setBounds(123, 89, 86, 20);
		customerSignInOrCreate.add(c2textField);
		c2textField.setColumns(10);
		
		JLabel c2lblNewLabel_1 = new JLabel("USERNAME:");
		c2lblNewLabel_1.setBounds(43, 92, 86, 14);
		customerSignInOrCreate.add(c2lblNewLabel_1);
		
		JLabel c2lblNewLabel_2 = new JLabel("PASSWORD:");
		c2lblNewLabel_2.setBounds(43, 134, 109, 14);
		customerSignInOrCreate.add(c2lblNewLabel_2);
		
		c2passwordField = new JPasswordField();
		c2passwordField.setBounds(123, 131, 86, 20);
		customerSignInOrCreate.add(c2passwordField);
		
		JButton c2btnNewButton = new JButton("SIGN IN");
		c2btnNewButton.setBounds(106, 188, 89, 23);
		customerSignInOrCreate.add(c2btnNewButton);
		
		JLabel c2lblNewLabel_3 = new JLabel("SIGN UP");
		c2lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		c2lblNewLabel_3.setBounds(534, 55, 60, 23);
		customerSignInOrCreate.add(c2lblNewLabel_3);
		
		c2textField_1 = new JTextField();
		c2textField_1.setBounds(520, 88, 86, 20);
		customerSignInOrCreate.add(c2textField_1);
		c2textField_1.setColumns(10);
		
		c2textField_2 = new JTextField();
		c2textField_2.setBounds(520, 130, 86, 20);
		customerSignInOrCreate.add(c2textField_2);
		c2textField_2.setColumns(10);
		
		JComboBox c2comboBox = new JComboBox();
		c2comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		c2comboBox.setBounds(491, 228, 38, 22);
		customerSignInOrCreate.add(c2comboBox);
		
		JComboBox c2comboBox_1 = new JComboBox();
		c2comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		c2comboBox_1.setBounds(550, 228, 38, 22);
		customerSignInOrCreate.add(c2comboBox_1);
		
		JComboBox c2comboBox_2 = new JComboBox();
		c2comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"}));
		c2comboBox_2.setBounds(600, 228, 60, 22);
		customerSignInOrCreate.add(c2comboBox_2);
		
		JRadioButton c2rdbtnNewRadioButton = new JRadioButton("Male");
		c2rdbtnNewRadioButton.setBounds(497, 270, 67, 23);
		customerSignInOrCreate.add(c2rdbtnNewRadioButton);
		
		JRadioButton c2rdbtnNewRadioButton_1 = new JRadioButton("Female");
		c2rdbtnNewRadioButton_1.setBounds(570, 270, 109, 23);
		customerSignInOrCreate.add(c2rdbtnNewRadioButton_1);
		
		JTextArea c2textArea = new JTextArea();
		c2textArea.setBounds(395, 309, 349, 79);
		customerSignInOrCreate.add(c2textArea);
		
		JButton c2btnNewButton_1 = new JButton("SignUP");
		c2btnNewButton_1.setBounds(534, 431, 89, 23);
		customerSignInOrCreate.add(c2btnNewButton_1);
		
		JLabel c2lblNewLabel_4 = new JLabel("Name:");
		c2lblNewLabel_4.setBounds(432, 92, 46, 14);
		customerSignInOrCreate.add(c2lblNewLabel_4);
		
		JLabel c2lblNewLabel_5 = new JLabel("Username:");
		c2lblNewLabel_5.setBounds(432, 134, 67, 14);
		customerSignInOrCreate.add(c2lblNewLabel_5);
		
		JLabel c2lblNewLabel_6 = new JLabel("Password:");
		c2lblNewLabel_6.setBounds(432, 175, 67, 14);
		customerSignInOrCreate.add(c2lblNewLabel_6);
		
		JLabel c2lblNewLabel_7 = new JLabel("Date of birth:");
		c2lblNewLabel_7.setBounds(409, 232, 95, 14);
		customerSignInOrCreate.add(c2lblNewLabel_7);
		
		JLabel c2lblNewLabel_8 = new JLabel("Day:");
		c2lblNewLabel_8.setBounds(491, 203, 46, 14);
		customerSignInOrCreate.add(c2lblNewLabel_8);
		
		JLabel c2lblNewLabel_9 = new JLabel("Month:");
		c2lblNewLabel_9.setBounds(548, 203, 46, 14);
		customerSignInOrCreate.add(c2lblNewLabel_9);
		
		JLabel c2lblNewLabel_10 = new JLabel("Year:");
		c2lblNewLabel_10.setBounds(603, 203, 46, 14);
		customerSignInOrCreate.add(c2lblNewLabel_10);
		
		JLabel c2lblNewLabel_11 = new JLabel("Gender:");
		c2lblNewLabel_11.setBounds(432, 274, 46, 14);
		customerSignInOrCreate.add(c2lblNewLabel_11);
		
		JLabel c2lblNewLabel_12 = new JLabel("Address:");
		c2lblNewLabel_12.setBounds(315, 314, 60, 14);
		customerSignInOrCreate.add(c2lblNewLabel_12);
		
		c2passwordField_1 = new JPasswordField();
		c2passwordField_1.setBounds(524, 172, 82, 20);
		customerSignInOrCreate.add(c2passwordField_1);
		
		JButton c2btnNewButton_2 = new JButton("Back");
		c2btnNewButton_2.setBounds(678, 554, 89, 23);
		customerSignInOrCreate.add(c2btnNewButton_2);
		
		
		
		
		
		adminSignInOrCreate = new JPanel();
		adminSignInOrCreate.setBorder(new EmptyBorder(5, 5, 5, 5));
		adminSignInOrCreate.setPreferredSize(new Dimension(800,600));
		adminSignInOrCreate.setLayout(null);
		
		JButton c3btnNewButton_2 = new JButton("Back");
		c3btnNewButton_2.setBounds(678, 554, 89, 23);
		adminSignInOrCreate.add(c3btnNewButton_2);
		
		JLabel c3lblNewLabel = new JLabel("SIGN IN");
		c3lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		c3lblNewLabel.setBounds(82, 46, 57, 24);
		adminSignInOrCreate.add(c3lblNewLabel);
		
		c3textField = new JTextField();
		c3textField.setBounds(126, 81, 86, 20);
		adminSignInOrCreate.add(c3textField);
		c3textField.setColumns(10);
		
		c3passwordField = new JPasswordField();
		c3passwordField.setBounds(126, 135, 86, 20);
		adminSignInOrCreate.add(c3passwordField);
		
		c3passwordField_1 = new JPasswordField();
		c3passwordField_1.setBounds(126, 191, 86, 20);
		adminSignInOrCreate.add(c3passwordField_1);
		
		JLabel c3lblNewLabel_1 = new JLabel("Useraname:");
		c3lblNewLabel_1.setBounds(10, 84, 62, 14);
		adminSignInOrCreate.add(c3lblNewLabel_1);
		
		JLabel c3lblNewLabel_2 = new JLabel("Password:");
		c3lblNewLabel_2.setBounds(10, 138, 62, 14);
		adminSignInOrCreate.add(c3lblNewLabel_2);
		
		JLabel c3lblNewLabel_3 = new JLabel("Hotel security code:");
		c3lblNewLabel_3.setBounds(10, 194, 129, 14);
		adminSignInOrCreate.add(c3lblNewLabel_3);
		
		JButton c3btnNewButton = new JButton("SIGN IN");
		c3btnNewButton.setBounds(82, 243, 89, 23);
		adminSignInOrCreate.add(c3btnNewButton);
		
		JLabel c3lblNewLabel_4 = new JLabel("SIGN UP");
		c3lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		c3lblNewLabel_4.setBounds(545, 52, 62, 18);
		adminSignInOrCreate.add(c3lblNewLabel_4);
		
		c3textField_1 = new JTextField();
		c3textField_1.setBounds(555, 81, 86, 20);
		adminSignInOrCreate.add(c3textField_1);
		c3textField_1.setColumns(10);
		
		c3textField_2 = new JTextField();
		c3textField_2.setBounds(555, 132, 86, 20);
		adminSignInOrCreate.add(c3textField_2);
		c3textField_2.setColumns(10);
		
		c3passwordField_2 = new JPasswordField();
		c3passwordField_2.setBounds(559, 188, 82, 20);
		adminSignInOrCreate.add(c3passwordField_2);
		
		c3passwordField_3 = new JPasswordField();
		c3passwordField_3.setBounds(559, 241, 82, 20);
		adminSignInOrCreate.add(c3passwordField_3);
		
		JComboBox c3comboBox = new JComboBox();
		c3comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		c3comboBox.setBounds(511, 295, 49, 22);
		adminSignInOrCreate.add(c3comboBox);
		
		JComboBox c3comboBox_1 = new JComboBox();
		c3comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		c3comboBox_1.setBounds(570, 295, 49, 22);
		adminSignInOrCreate.add(c3comboBox_1);
		
		JComboBox c3comboBox_2 = new JComboBox();
		c3comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009"}));
		c3comboBox_2.setBounds(629, 295, 62, 22);
		adminSignInOrCreate.add(c3comboBox_2);
		
		JLabel c3lblNewLabel_5 = new JLabel("Name:");
		c3lblNewLabel_5.setBounds(436, 84, 46, 14);
		adminSignInOrCreate.add(c3lblNewLabel_5);
		
		JLabel c3lblNewLabel_6 = new JLabel("Username:");
		c3lblNewLabel_6.setBounds(436, 138, 71, 14);
		adminSignInOrCreate.add(c3lblNewLabel_6);
		
		JLabel c3lblNewLabel_7 = new JLabel("Password:");
		c3lblNewLabel_7.setBounds(436, 194, 86, 14);
		adminSignInOrCreate.add(c3lblNewLabel_7);
		
		JLabel c3lblNewLabel_8 = new JLabel("Hotel Security code:");
		c3lblNewLabel_8.setBounds(436, 247, 143, 14);
		adminSignInOrCreate.add(c3lblNewLabel_8);
		
		JLabel c3lblNewLabel_9 = new JLabel("Date of birth:");
		c3lblNewLabel_9.setBounds(418, 299, 83, 14);
		adminSignInOrCreate.add(c3lblNewLabel_9);
		
		JLabel c3lblNewLabel_10 = new JLabel("Day:");
		c3lblNewLabel_10.setBounds(511, 275, 46, 14);
		adminSignInOrCreate.add(c3lblNewLabel_10);
		
		JLabel c3lblNewLabel_11 = new JLabel("Month:");
		c3lblNewLabel_11.setBounds(570, 275, 46, 14);
		adminSignInOrCreate.add(c3lblNewLabel_11);
		
		JLabel c3lblNewLabel_12 = new JLabel("Year:");
		c3lblNewLabel_12.setBounds(633, 275, 46, 14);
		adminSignInOrCreate.add(c3lblNewLabel_12);
		
		JButton c3btnNewButton_1 = new JButton("SING UP");
		c3btnNewButton_1.setBounds(545, 359, 89, 23);
		adminSignInOrCreate.add(c3btnNewButton_1);
		
		
		
		customerSelectHotel = new JPanel();
		customerSelectHotel.setBorder(new EmptyBorder(5, 5, 5, 5));
		customerSelectHotel.setPreferredSize(new Dimension(800,600));
		customerSelectHotel.setLayout(null);
		
		JList c4list = new JList();
		c4list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		c4list.setBounds(214, 96, 73, 61);
		
		JScrollPane c4scrollPane = new JScrollPane(c4list);
		c4scrollPane.setBounds(273, 92, 347, 341);
		customerSelectHotel.add(c4scrollPane);
		
		JLabel c4lblNewLabel = new JLabel("SELECT HOTEL");
		c4lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		c4lblNewLabel.setBounds(307, 47, 151, 34);
		customerSelectHotel.add(c4lblNewLabel);
		
		JButton c4btnNewButton = new JButton("Next");
		c4btnNewButton.setBounds(273, 480, 89, 23);
		customerSelectHotel.add(c4btnNewButton);
		
		JButton c4btnNewButton_1 = new JButton("Back");
		c4btnNewButton_1.setBounds(531, 480, 89, 23);
		customerSelectHotel.add(c4btnNewButton_1);
		
		
		
		customerOrder = new JPanel();
		customerOrder.setBorder(new EmptyBorder(5, 5, 5, 5));
		customerOrder.setPreferredSize(new Dimension(800,600));
		customerOrder.setLayout(null);
		
		JList c5list = new JList();
		c5list.setBounds(264, 108, 65, 90);
		
		JScrollPane c5scrollPane = new JScrollPane(c5list);
		c5scrollPane.setBounds(78, 132, 160, 200);
		customerOrder.add(c5scrollPane);
		
		JLabel c5lblNewLabel = new JLabel("SELECT FOOD ITEMS:");
		c5lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		c5lblNewLabel.setBounds(78, 94, 146, 27);
		customerOrder.add(c5lblNewLabel);
		
		JButton c5btnNewButton = new JButton("Add to cart");
		c5btnNewButton.setBounds(78, 379, 106, 23);
		customerOrder.add(c5btnNewButton);
		
		JList c5list_1 = new JList();
		c5list_1.setBounds(512, 132, 160, 200);
		customerOrder.add(c5list_1);
		
		JScrollPane c5scrollPane_1 = new JScrollPane(c5list_1);
		c5scrollPane_1.setBounds(512, 132, 160, 200);
		customerOrder.add(c5scrollPane_1);
		
		c5textField = new JTextField();
		c5textField.setEditable(false);
		c5textField.setBounds(512, 68, 86, 20);
		customerOrder.add(c5textField);
		c5textField.setColumns(10);
		c5textField.setText("0");
		
		JLabel c5lblNewLabel_1 = new JLabel("Total Rs:");
		c5lblNewLabel_1.setBounds(512, 43, 56, 14);
		customerOrder.add(c5lblNewLabel_1);
		
		JButton c5btnNewButton_1 = new JButton("place order");
		c5btnNewButton_1.setBounds(512, 379, 106, 23);
		customerOrder.add(c5btnNewButton_1);
		
		JButton c5btnNewButton_2 = new JButton("Back");
		c5btnNewButton_2.setBounds(608, 515, 89, 23);
		customerOrder.add(c5btnNewButton_2);
		
		JLabel c5lblNewLabel_2 = new JLabel("CART");
		c5lblNewLabel_2.setBounds(512, 107, 46, 14);
		customerOrder.add(c5lblNewLabel_2);
		
		JButton c5btnNewButton_3 = new JButton("Remove");
		c5btnNewButton_3.setBounds(512, 345, 89, 23);
		customerOrder.add(c5btnNewButton_3);
		
		
		
		adminHotelManagment = new JPanel();
		adminHotelManagment.setBorder(new EmptyBorder(5, 5, 5, 5));
		adminHotelManagment.setPreferredSize(new Dimension(800,600));
		adminHotelManagment.setLayout(null);
		
		JLabel c6lblNewLabel = new JLabel("Add New Item:");
		c6lblNewLabel.setBounds(139, 47, 83, 14);
		adminHotelManagment.add(c6lblNewLabel);
		
		JComboBox c6comboBox = new JComboBox();
		c6comboBox.setModel(new DefaultComboBoxModel(new String[] {"Veg", "Non-Veg", "Drinks"}));
		c6comboBox.setBounds(139, 93, 71, 22);
		adminHotelManagment.add(c6comboBox);
		
		c6textField = new JTextField();
		c6textField.setBounds(139, 146, 86, 20);
		adminHotelManagment.add(c6textField);
		c6textField.setColumns(10);
		
		c6textField_2 = new JTextField();
		c6textField_2.setBounds(136, 294, 86, 20);
		adminHotelManagment.add(c6textField_2);
		c6textField_2.setColumns(10);
		
		c6textField_3 = new JTextField();
		c6textField_3.setBounds(136, 337, 86, 20);
		adminHotelManagment.add(c6textField_3);
		c6textField_3.setColumns(10);
		
		JButton c6btnNewButton = new JButton("Add");
		c6btnNewButton.setBounds(136, 390, 89, 23);
		adminHotelManagment.add(c6btnNewButton);
		
		JLabel c6lblNewLabel_1 = new JLabel("Name:");
		c6lblNewLabel_1.setBounds(83, 149, 46, 14);
		adminHotelManagment.add(c6lblNewLabel_1);
		
		JLabel c6lblNewLabel_2 = new JLabel("Description:");
		c6lblNewLabel_2.setBounds(58, 202, 71, 14);
		adminHotelManagment.add(c6lblNewLabel_2);
		
		JLabel c6lblNewLabel_3 = new JLabel("Quantity:");
		c6lblNewLabel_3.setBounds(58, 340, 68, 14);
		adminHotelManagment.add(c6lblNewLabel_3);
		
		JLabel c6lblNewLabel_4 = new JLabel("Cost:");
		c6lblNewLabel_4.setBounds(80, 297, 46, 14);
		adminHotelManagment.add(c6lblNewLabel_4);
		
		JTextArea c6textArea = new JTextArea();
		c6textArea.setBounds(139, 197, 199, 86);
		adminHotelManagment.add(c6textArea);
		
		JList c6list = new JList();
		
		JScrollPane c6scrollPane = new JScrollPane(c6list);
		c6scrollPane.setBounds(489, 127, 169, 187);
		adminHotelManagment.add(c6scrollPane);
		
		
		JLabel c6lblNewLabel_5 = new JLabel("Remove Items:");
		c6lblNewLabel_5.setBounds(489, 86, 89, 14);
		adminHotelManagment.add(c6lblNewLabel_5);
		
		JButton c6btnNewButton_1 = new JButton("Remove");
		c6btnNewButton_1.setBounds(489, 336, 89, 23);
		adminHotelManagment.add(c6btnNewButton_1);
		
		JButton c6btnNewButton_2 = new JButton("Back");
		c6btnNewButton_2.setBounds(614, 554, 89, 23);
		adminHotelManagment.add(c6btnNewButton_2);
		

		
		
		
		
		
		appManagment = new JPanel();
		appManagment.setBorder(new EmptyBorder(5, 5, 5, 5));
		appManagment.setPreferredSize(new Dimension(800,600));
		appManagment.setLayout(null);
		
		JLabel c7lblNewLabel = new JLabel("ADD HOTEL");
		c7lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		c7lblNewLabel.setBounds(76, 106, 80, 14);
		appManagment.add(c7lblNewLabel);
		
		c7textField = new JTextField();
		c7textField.setBounds(138, 143, 86, 20);
		appManagment.add(c7textField);
		c7textField.setColumns(10);
		
		c7passwordField = new JPasswordField();
		c7passwordField.setBounds(138, 224, 86, 20);
		appManagment.add(c7passwordField);
		
		JLabel c7lblNewLabel_1 = new JLabel("Hotel Name:");
		c7lblNewLabel_1.setBounds(21, 149, 74, 14);
		appManagment.add(c7lblNewLabel_1);
		
		JLabel c7lblNewLabel_2 = new JLabel("Set Security Code:");
		c7lblNewLabel_2.setBounds(12, 230, 108, 14);
		appManagment.add(c7lblNewLabel_2);
		
		JButton c7btnNewButton = new JButton("ADD");
		c7btnNewButton.setBounds(67, 290, 89, 23);
		appManagment.add(c7btnNewButton);
		
		JList c7list = new JList();
		c7list.setBounds(522, 198, 23, 32);
		
		JScrollPane c7scrollPane = new JScrollPane(c7list);
		c7scrollPane.setBounds(434, 124, 149, 161);
		appManagment.add(c7scrollPane);
		
		JLabel c7lblNewLabel_3 = new JLabel("REMOVE EMPTY HOTELS");
		c7lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		c7lblNewLabel_3.setBounds(434, 84, 174, 14);
		appManagment.add(c7lblNewLabel_3);
		
		JButton c7btnNewButton_1 = new JButton("Remove");
		c7btnNewButton_1.setBounds(457, 290, 89, 23);
		appManagment.add(c7btnNewButton_1);
		
		JButton c7btnNewButton_2 = new JButton("Back");
		c7btnNewButton_2.setBounds(584, 542, 89, 23);
		appManagment.add(c7btnNewButton_2);
		
		c7textField_1 = new JTextField();
		c7textField_1.setBounds(138, 389, 86, 20);
		appManagment.add(c7textField_1);
		c7textField_1.setColumns(10);
		
		c7textField_2 = new JTextField();
		c7textField_2.setBounds(138, 437, 86, 20);
		appManagment.add(c7textField_2);
		c7textField_2.setColumns(10);
		
		JComboBox c7comboBox = new JComboBox();
		c7comboBox.setModel(new DefaultComboBoxModel(new String[] {"15000", "18000", "20000", "21000", "25000", "28000", "30000", "33000", "35000", "38000"}));
		c7comboBox.setBounds(138, 485, 75, 22);
		appManagment.add(c7comboBox);
		
		JComboBox c7comboBox_1 = new JComboBox();
		c7comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		c7comboBox_1.setBounds(138, 542, 46, 22);
		appManagment.add(c7comboBox_1);
		
		JComboBox c7comboBox_2 = new JComboBox();
		c7comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		c7comboBox_2.setBounds(205, 542, 43, 22);
		appManagment.add(c7comboBox_2);
		
		JComboBox c7comboBox_3 = new JComboBox();
		c7comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", ""}));
		c7comboBox_3.setBounds(272, 542, 60, 22);
		appManagment.add(c7comboBox_3);
		
		JLabel c7lblNewLabel_4 = new JLabel("ID:");
		c7lblNewLabel_4.setBounds(82, 392, 46, 14);
		appManagment.add(c7lblNewLabel_4);
		
		JLabel c7lblNewLabel_5 = new JLabel("Name:");
		c7lblNewLabel_5.setBounds(67, 440, 46, 14);
		appManagment.add(c7lblNewLabel_5);
		
		JLabel c7lblNewLabel_6 = new JLabel("Salary:");
		c7lblNewLabel_6.setBounds(67, 489, 46, 14);
		appManagment.add(c7lblNewLabel_6);
		
		JLabel c7lblNewLabel_7 = new JLabel("DOB:");
		c7lblNewLabel_7.setBounds(49, 546, 46, 14);
		appManagment.add(c7lblNewLabel_7);
		
		JButton c7btnNewButton_3 = new JButton("ADD");
		c7btnNewButton_3.setBounds(124, 575, 89, 23);
		appManagment.add(c7btnNewButton_3);
		
		JLabel c7lblNewLabel_8 = new JLabel("Day:");
		c7lblNewLabel_8.setBounds(138, 518, 46, 14);
		appManagment.add(c7lblNewLabel_8);
		
		JLabel c7lblNewLabel_9 = new JLabel("Month:");
		c7lblNewLabel_9.setBounds(202, 517, 46, 14);
		appManagment.add(c7lblNewLabel_9);
		
		JLabel c7lblNewLabel_10 = new JLabel("Year:");
		c7lblNewLabel_10.setBounds(272, 517, 46, 14);
		appManagment.add(c7lblNewLabel_10);
		
		JLabel c7lblNewLabel_11 = new JLabel("Add Delevery Employee");
		c7lblNewLabel_11.setBounds(110, 346, 135, 20);
		appManagment.add(c7lblNewLabel_11);
		
		
		
		JList c7list_1 = new JList();
		c7list_1.setBounds(456, 411, 60, 48);
		
		JScrollPane c7scrollPane_1 = new JScrollPane(c7list_1);
		c7scrollPane_1.setBounds(434, 360, 149, 171);
		appManagment.add(c7scrollPane_1);
		
		JButton c7btnNewButton_4 = new JButton("Remove");
		c7btnNewButton_4.setBounds(444, 542, 89, 23);
		appManagment.add(c7btnNewButton_4);
		
		JLabel c7lblNewLabel_12 = new JLabel("REMOVE free Delevery employees");
		c7lblNewLabel_12.setBounds(434, 335, 222, 14);
		appManagment.add(c7lblNewLabel_12);
		
		
		
		
		
		
		
		appManagmentPass = new JPanel();
		appManagmentPass.setBorder(new EmptyBorder(5, 5, 5, 5));
		appManagmentPass.setPreferredSize(new Dimension(800,600));
		appManagmentPass.setLayout(null);
		
		c8passwordField = new JPasswordField();
		c8passwordField.setBounds(327, 204, 145, 20);
		appManagmentPass.add(c8passwordField);
		
		JLabel c8lblNewLabel = new JLabel("ENTER THE APP DEVELOPER PASSWORD:");
		c8lblNewLabel.setBounds(301, 155, 276, 27);
		appManagmentPass.add(c8lblNewLabel);
		
		JButton c8btnNewButton = new JButton("Next");
		c8btnNewButton.setBounds(353, 256, 89, 23);
		appManagmentPass.add(c8btnNewButton);
		
		JButton c8btnNewButton_1 = new JButton("Back");
		c8btnNewButton_1.setBounds(657, 540, 89, 23);
		appManagmentPass.add(c8btnNewButton_1);
		
		
		orderTrack = new JPanel();
		orderTrack.setBorder(new EmptyBorder(5, 5, 5, 5));
		orderTrack.setPreferredSize(new Dimension(800,600));
		setContentPane(orderTrack);
		pack();
		orderTrack.setLayout(null);
		
		
		
		JList c9list = new JList();
		c9list.setBounds(168, 125, 50, 51);
		
		JScrollPane c9scrollPane = new JScrollPane(c9list);
		c9scrollPane.setBounds(112, 157, 388, 308);
		orderTrack.add(c9scrollPane);
		
		JLabel c9lblNewLabel = new JLabel("YOUR ORDERS");
		c9lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		c9lblNewLabel.setBounds(134, 89, 121, 34);
		orderTrack.add(c9lblNewLabel);
		
		JButton c9btnNewButton = new JButton("Back");
		c9btnNewButton.setBounds(660, 552, 89, 23);
		orderTrack.add(c9btnNewButton);
		
		
		
		
		
		
		
		
		
		DefaultListModel CART = new DefaultListModel();
		c5list_1.setModel(CART);
		
		ArrayList<Food> cartItems=new ArrayList<Food>();
		
		DefaultListModel Hotels= new DefaultListModel();
		c4list.setModel(Hotels);
		c7list.setModel(Hotels);
		
		DefaultListModel deleveryEmps= new DefaultListModel();
		c7list_1.setModel(deleveryEmps);
		
		
	
		
		btnNewButto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			setContentPane(appManagmentPass);
			pack();
			}
		});
		
		
		btnNewButto_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			setContentPane(adminSignInOrCreate);
			pack();
			}
		});
		
		btnNewButto_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			setContentPane(customerSignInOrCreate);
			pack();
			}
		});
		
		
		c2btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			setContentPane(openingWindow);
			pack();
			}
		});
		
		c3btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			setContentPane(openingWindow);
			pack();
			}
		});
		
		c8btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			setContentPane(openingWindow);
			pack();
			}
		});
		
		
		c2btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				String password,username;
				password=new String(c2passwordField.getPassword());
				
				username=c2textField.getText();
				for(i=0;i<data.customers.size();i++)
				{
					
					if(data.customers.get(i).userName.equals(username) && data.customers.get(i).password.equals(password))
					{
						
						break;
					}
				}
			
				if(i==data.customers.size())
					JOptionPane.showMessageDialog(null, "INVALID PASSWORD OR USERNAME!!!");
				else
				{
					customerLogInAccount=i;
					setContentPane(customerSelectHotel);
					pack();
				}
				
			}
		});
		
		
		c2rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c2rdbtnNewRadioButton.isSelected())
				{
					c2rdbtnNewRadioButton_1.setSelected(false);
				}
				else
				{
					c2rdbtnNewRadioButton.setSelected(true);
					
				}
				
				
			}
		});
		
		c2rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c2rdbtnNewRadioButton_1.isSelected())
				{
					c2rdbtnNewRadioButton.setSelected(false);
				}
				else
				{
					c2rdbtnNewRadioButton_1.setSelected(true);
					
				}
				
				
			}
		});
		
		
		c2btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=c2textField_1.getText();
				String Username=c2textField_2.getText();
				String Password=new String(c2passwordField_1.getPassword());
				int day=Integer.parseInt(c2comboBox.getSelectedItem().toString());
				int month=Integer.parseInt(c2comboBox_1.getSelectedItem().toString());
				int year=Integer.parseInt(c2comboBox_2.getSelectedItem().toString());
				String gender=(c2rdbtnNewRadioButton.isSelected())? "male":(c2rdbtnNewRadioButton_1.isSelected() ? "female" : null);
				if(gender==null)
				{
					JOptionPane.showMessageDialog(null, "choose gender!!!");
					return;
				}
				String Address=c2textArea.getText();
				if(Name.length()==0||Username.length()==0||Password.length()==0||Address.length()==0)
				{
					JOptionPane.showMessageDialog(null, "Empty fields detected!!!");
					return;
				}
				int i=0;
				for(i=0;i<data.customers.size();i++)
				{
					if(data.customers.get(i).userName.equals(Username) && data.customers.get(i).password.equals(Password))
					{
						
						break;
					}
					
				}
				if(i!=data.customers.size())
				{
					JOptionPane.showMessageDialog(null, "An account with this username and password already exits!!! ");;
					return;
				}
				
				data.customers.add(new Customer(Name,Username,Password,day,month,year,gender,Address));
				JOptionPane.showMessageDialog(null, "User created ");;

			}
		});
		
		
		c4btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(customerSignInOrCreate);
				pack();
				customerLogInAccount=-1;
			}
			
			});
		
		c4btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIndex=c4list.getSelectedIndex();
				if(selectedIndex==-1)
					JOptionPane.showMessageDialog(null, "Select a hotel");
				else
				{
					
					c5list.setModel(data.hotels.get(selectedIndex).foodItemNames);
					selectedhotel=selectedIndex;
					
					setContentPane(customerOrder);
					pack();
					
				}
			}
			
			});
		
		c5btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] indices=c5list.getSelectedIndices();
				Food food;
				
				if(indices.length==0)
				{
					JOptionPane.showMessageDialog(null, "Nothing selected");
				}
				else
				{
					
					for(int i=0;i<indices.length;i++)
					{
						CART.addElement(c5list.getModel().getElementAt(indices[i]));
						food=data.hotels.get(selectedhotel).foodItems.get(indices[i]);
						if(food.getType()==1)
							cartItems.add(new Veg(food.getName(),food.getDescription(),food.getCost()));
						else if(food.getType()==2)
							cartItems.add(new NonVeg(food.getName(),food.getDescription(),food.getCost()/food.getGramOfMeet(),food.getGramOfMeet()));
						else 
							cartItems.add(new Drinks(food.getName(),food.getDescription(),food.getCost()/food.getLiters(),food.getLiters()));
						c5textField.setText(""+(Integer.parseInt(c5textField.getText())+data.hotels.get(selectedhotel).foodItems.get(indices[i]).getCost()));
					}
				}
			}
			
			});
		
		c5btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] indices=c5list_1.getSelectedIndices();
				
				if(indices.length==0)
					JOptionPane.showMessageDialog(null, "Nothing selected");
				else
				{
					for(int i=0;i<indices.length;i++)
					{
						CART.removeElementAt(indices[i]-i);
						c5textField.setText(""+(Integer.parseInt(c5textField.getText())-cartItems.get(indices[i]-i).getCost()));
						cartItems.remove(indices[i]-i);
					}
					
				}
			}
			
			});
		
		c5btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectedhotel=-1;
				c5textField.setText("0");
				CART.removeAllElements();
				cartItems.clear();
				setContentPane(customerSelectHotel);
				pack();
			}
			
			});
		
		c5btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=0;
				if(cartItems.size()==0)
				{
					c9list.setModel(data.customers.get(customerLogInAccount).ORDERS);
					setContentPane(orderTrack);
					pack();
					return;
				}
				for(i=0;i<data.deleveryEmployees.size();i++)
				{
					if(data.deleveryEmployees.get(i).isFree)
						break;
				}
				if(i==data.deleveryEmployees.size())
				{
					JOptionPane.showMessageDialog(null, "Sorry all the delevery employeesare full!!");
					return;
				}
				
				data.orders.add(new Order(""+data.orders.size(),data.deleveryEmployees.get(i),data.customers.get(customerLogInAccount),data.hotels.get(selectedhotel),cartItems));
				data.customers.get(customerLogInAccount).ORDERS.addElement("Order ID:"+(""+(data.orders.size()-1))+"    Hotel Name:"+data.hotels.get(selectedhotel).name+"   Delevery Person:"+data.deleveryEmployees.get(i).name+"   status: is being delevered");
				c9list.setModel(data.customers.get(customerLogInAccount).ORDERS);
				setContentPane(orderTrack);
				pack();
				data.deleveryEmployees.get(i).isFree=false;
				cartItems.clear();
				c5textField.setText("0");
				CART.removeAllElements();
			}
			
			});
		
		c9btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(customerOrder);
				pack();
			}
			
			});
		
		
		c8btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password=new String(c8passwordField.getPassword());
				if(password.equals(appDevPass))
				{
					setContentPane(appManagment);
					pack();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "INVALID PASSWORD!!!");
				}
				
				
			}
			
			});
		
		c7btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setContentPane(appManagmentPass);
				pack();
			}
			
			});
		
		
		c7btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Id=c7textField_1.getText();
				int i=0;
				for(i=0;i<data.deleveryEmployees.size();i++)
				{
					if(data.deleveryEmployees.get(i).Id.equals(Id))
						break;
				}
				if(i!=data.deleveryEmployees.size())
				{
					JOptionPane.showMessageDialog(null, "error duplicate ID!!!");
					return;
				}
				
				String Name=c7textField_2.getText();
				int Salary=Integer.parseInt(c7comboBox.getSelectedItem().toString());
				int day=Integer.parseInt(c7comboBox_1.getSelectedItem().toString());
				int month=Integer.parseInt(c7comboBox_2.getSelectedItem().toString());
				int year=Integer.parseInt(c7comboBox_3.getSelectedItem().toString());
				
				if(Id.length()==0 || Name.length()==0)
				{
					JOptionPane.showMessageDialog(null, "Empty fields detected!!!");
				}
				else
				{
					data.deleveryEmployees.add(new DeleveryEmployee(Id,Name,Salary,day,month,year));
					deleveryEmps.addElement("Id:"+Id+"   Name:"+Name+"  Salary:"+Salary);
				}
			}
			
			});
		
		c7btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Name=c7textField.getText();
				String SecCode=new String(c7passwordField.getPassword());
				int i=0;
				if(Name.length()==0||SecCode.length()==0)
					JOptionPane.showMessageDialog(null, "Empty fields detected!!!");
				else
				{
					for(i=0;i<data.hotels.size();i++)
					{
						if(data.hotels.get(i).securityCode.equals(SecCode))
							break;
						
					}
					if(i!=data.hotels.size())
					{
						JOptionPane.showMessageDialog(null, "Security code already used");
						return;
					}
					
					data.hotels.add(new Hotel(Name,SecCode));
					Hotels.addElement(Name);
				}
				
			}
			
			});
			
		
		c7btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] indices=c7list_1.getSelectedIndices();
				int j=0;
				if(indices.length==0)
				{
					JOptionPane.showMessageDialog(null, "SELECT EMPLOYEES!!!");
					
				}
				else
				{
					for( j=0;j<indices.length;j++)
					{
						if(!data.deleveryEmployees.get(indices[j]).isFree)
							break;
					}
					if(j!=indices.length)
					{
						JOptionPane.showMessageDialog(null, "The are not free!!!");
						return;
					}
					
					for(int i=0;i<indices.length;i++)
					{
						data.deleveryEmployees.remove(indices[i]-i);
						deleveryEmps.remove(indices[i]-i);
					}
				}
				
				
				
			}
			
			});
		
		c7btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] indices=c7list.getSelectedIndices();
				int i=0;
				int j=0;
				if(indices.length==0)
				{
					JOptionPane.showMessageDialog(null, "Select Hotels!!!");
					return;
				}
				else
				{
					for(i=0;i<indices.length;i++)
					{
						for(j=0;j<data.admins.size();j++)
						{
							if(data.admins.get(j).ownedHotel==data.hotels.get(indices[i]))
								break;
						}
						
							
						
						if(!(data.hotels.get(indices[i]).foodItems.size()==0 && j==data.admins.size()))
							break;
					}
					if(i!=indices.length)
					{
						JOptionPane.showMessageDialog(null, "They are not empty hotels");
						return;
					}
					
					
					for(i=0;i<indices.length;i++) 
					{
						data.hotels.remove(indices[i]-i);
						Hotels.remove(indices[i]-i);
					}
					
				}
							
				
				
			}
			
			});
		
		
		c3btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName=c3textField.getText();		
				String Password=new String(c3passwordField.getPassword());
				String secCode=new String(c3passwordField_1.getPassword());
				int i=0;
				for(i=0;i<data.admins.size();i++)
				{
					if(userName.equals(data.admins.get(i).userName) && Password.equals(data.admins.get(i).password))
						break;
				}
				if(i==data.admins.size())
				{
					JOptionPane.showMessageDialog(null, "Ivalid username or password");
					return;
				}
				if(!data.admins.get(i).ownedHotel.securityCode.equals(secCode))
				{
					JOptionPane.showMessageDialog(null, "Invalid Security code");
					return;
				}
				
				
				adminLogInAccount=i;
				setContentPane(adminHotelManagment);
				pack();
				
				c6list.setModel(data.admins.get(i).ownedHotel.foodItemNames);
			}
			
			});
		
		c3btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=c3textField_1.getText();
				String userName=c3textField_2.getText();
				String Password=new String(c3passwordField_2.getPassword());
				String secCode=new String(c3passwordField_3.getPassword());
				int day=Integer.parseInt(c3comboBox.getSelectedItem().toString());
				int month=Integer.parseInt(c3comboBox_1.getSelectedItem().toString());
				int year=Integer.parseInt(c3comboBox_2.getSelectedItem().toString());
				int i=0,j=0;
				for(i=0;i<data.admins.size();i++)
				{
					if(data.admins.get(i).userName.equals(userName) && data.admins.get(i).password.equals(Password))
						break;
				}
				if(i!=data.admins.size())
				{
					JOptionPane.showMessageDialog(null, "User name and password already exists");
					return;
				}
				for(j=0;j<data.hotels.size();j++)
				{
					if(data.hotels.get(j).securityCode.equals(secCode))
						break;
				}
				
				if(j==data.hotels.size())
				{
					JOptionPane.showMessageDialog(null, "Invalid securitycode");
					return;
				}
				
				int k=0;
				for(k=0;k<data.admins.size();k++)
				{
					if(data.admins.get(k).ownedHotel==data.hotels.get(j))
						break;
				}
				if(k!=data.admins.size())
				{
					JOptionPane.showMessageDialog(null, "Someone else is admin of this hotel!!!");
					return;
				}
				if(Name.length()==0 || Password.length()==0 || userName.length()==0)
				{
					JOptionPane.showMessageDialog(null, "Empty fields detected!!!");
					return;
				}
				
				data.admins.add(new Admin(Name,userName,Password,data.hotels.get(j),day,month,year));
				JOptionPane.showMessageDialog(null, "user created!!!");
			}
			
			});
		
		
		c6btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adminLogInAccount=-1;
				setContentPane(adminSignInOrCreate);
				pack();
			}
			
			});
		
		
		
		
		c6btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String catogory=c6comboBox.getSelectedItem().toString();
				String Name=c6textField.getText();
				String Description=c6textArea.getText();
				try
				{int Cost=Integer.parseInt(c6textField_2.getText());
				
				
				int quantity=0;
				
				if(Name.length()==0 ||  Description.length()==0 )
				{
					JOptionPane.showMessageDialog(null, "Empty Fields detected!!!");
					return;
					
				}
				if(catogory.equals("Veg"))
				{
					
					data.admins.get(adminLogInAccount).ownedHotel.addFoodItem(new Veg(Name,Description,Cost));
				}
				else if(catogory.equals("Non-Veg") )
				{
					quantity=Integer.parseInt(c6textField_3.getText());
					data.admins.get(adminLogInAccount).ownedHotel.addFoodItem(new NonVeg(Name,Description,Cost,quantity));
					
				}
				else if( catogory.equals("Drinks"))
				{
					quantity=Integer.parseInt(c6textField_3.getText());
					data.admins.get(adminLogInAccount).ownedHotel.addFoodItem(new Drinks(Name,Description,Cost,quantity));
				}	
				}
				catch(NumberFormatException e1)
				{
					JOptionPane.showMessageDialog(null, "error invalid integer!");
					return;
				}
			}
			
			});
		
		c6btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] indices=c6list.getSelectedIndices();
				if(indices.length==0)
				{
					JOptionPane.showMessageDialog(null, "Select items to remove!!!");
					return;
				}
				
				for(int i=0;i<indices.length;i++)
				{
					data.admins.get(adminLogInAccount).ownedHotel.removeItem(indices[i]-i);
				}
			}
			
			});
		
	
		data.hotels.add(new Hotel("mc donals","1"));
		Hotels.addElement("mc donals");
		data.hotels.add(new Hotel("panjurli","2"));
		Hotels.addElement("panjurli");
		data.hotels.add(new Hotel("Ananth executive","3"));
		Hotels.addElement("Ananth executive");
		data.hotels.add(new Hotel("Empty hotel","4"));
		Hotels.addElement("Empty hotel");
		
		data.admins.add(new Admin("rahul","rahul123","1234",data.hotels.get(0),1,1,1990));
		data.admins.add(new Admin("sham","sham123","12345678",data.hotels.get(1),1,12,1990));
		data.admins.add(new Admin("ram","raml123","1234ram",data.hotels.get(2),1,10,1990));
		
		data.hotels.get(0).addFoodItem(new Veg("allu tikki","its good",49));
		data.hotels.get(0).addFoodItem(new NonVeg("chicken nugget","its good",20,3));
		data.hotels.get(0).addFoodItem(new Drinks("chocklate drinks","its good",50,1));
		
		data.hotels.get(1).addFoodItem(new Veg("chapathi uta","its good",20));
		data.hotels.get(1).addFoodItem(new NonVeg("chicken 65","its good",90,3));
		data.hotels.get(1).addFoodItem(new Drinks("lassi","its good",20,1));
		
		data.hotels.get(2).addFoodItem(new Veg("thandurri roti","its good",49));
		data.hotels.get(2).addFoodItem(new Veg("dal thadaka","its good",100));
		data.hotels.get(2).addFoodItem(new Drinks("butter scoch","its good",80,1));
		
		data.deleveryEmployees.add(new DeleveryEmployee("1","Bham",28000,1,1,1990));
		data.deleveryEmployees.add(new DeleveryEmployee("2","sumpreeth",28000,1,2,1990));
		data.deleveryEmployees.add(new DeleveryEmployee("3","rahul",28000,10,2,1990));
		
	}
}
